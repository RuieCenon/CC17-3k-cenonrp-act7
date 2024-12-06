package com.example.latrinidadhighlights

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainFragment : Fragment() {

    private lateinit var categoryAdapter: CategoryAdapter
    private val viewModel: MainViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)

        val recyclerView: RecyclerView = view.findViewById(R.id.categoryRecyclerView)
        recyclerView.layoutManager = GridLayoutManager(context, 2) // 2x2 grid
        recyclerView.addItemDecoration(GridSpaceDcor(2, resources.getDimensionPixelSize(R.dimen.grid_spacing), true))

        categoryAdapter = CategoryAdapter(emptyList()) { category ->
            when (category.name) {
                "Cultural Attractions" -> findNavController().navigate(R.id.action_main_to_culturalAttractions)
                "Farm Highlights" -> findNavController().navigate(R.id.action_main_to_outdoorActivities)
                "Cafes and Restos" -> findNavController().navigate(R.id.action_main_to_diningOptions)
                "Other Experiences" -> findNavController().navigate(R.id.action_main_to_shoppingExperiences)
            }
        }

        recyclerView.adapter = categoryAdapter

        viewModel.categories.observe(viewLifecycleOwner) { categories ->
            categoryAdapter.updateCategories(categories)
        }

        return view
    }
}
