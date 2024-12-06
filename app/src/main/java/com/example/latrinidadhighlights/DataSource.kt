package com.example.latrinidadhighlights

object DataSource {

    val activities = listOf(
        Farms(
			name = "The Strawberry Farm",
			description = "Stawberry farm is one of the tourist spots in La Trinidad, it is famous for its fresh strawberries and strawberry products",
			location = "Strawberry Valley Hotel, ID-58 Strawberry Farm, Swamp Area, La Trinidad",
			time = "8:00 AM to 5:00 PM",
			imageResId = R.drawable.strawberry_farm
        ),
        Farms(
			name = "The Admiral's Farm Park",
			description = "The park is a small recreational park where people can have picnics",
			location = "CHR3+VJ7, Pico - Lamtang Rd, La Trinidad",
			time = "8:00 AM to 5:00 PM",
			imageResId = R.drawable.admirals
        ),
        Farms(
			name = "The Alapang Flower Farm",
			description = "This farm is usually known for its potted flowers of many kind",
			location = "FHFX+RWH, Obudan, La Trinidad",
			time = "8:00 AM to 5:00 PM",
			imageResId = R.drawable.alapang
        )

    )

    val eatsOptions = listOf(
        Eats(
			name = "The Arca's Yard",
			specialty = "Arca's Yard is a popular cafe known for its cozy atmosphere, mini library, and delicious food and drinks. It's a great place to relax, read a book, and enjoy a cup of coffee or tea.",
			location = "777 Tiptop, Ambuklao Rd, La Trinidad",
			time = "8:00 AM to 7:30 PM",
			imageResId = R.drawable.arca
        ),
        Eats(
			name = "Taste and Cups by Joanna C.",
			specialty = "Pastries, cakes, sandwiches, and coffee are just a few of the many foods and beverages available at this cafe..",
			location = "Pico - Lamtang Rd., La Trinidad",
			time = "10:00 AM to 8:30 PM",
			imageResId = R.drawable.tastte
        ),
        Eats(
			name = "The Zambalii Grill",
			specialty = "Excellent dining establishment Zambalii Grill is well-known for its welcoming ambiance and varied cuisine, which features both international and local specialties, such as its delicious sandwiches and savory Chicken Inasal.",
			location = "Beckel, La Trinidad",
			time = "9:00 AM to 7:30 PM",
			imageResId = R.drawable.zambali
        )
    )

    val othersExperiences = listOf(
        Others(
			name = "Mt. Yangbew",
			description = "Near La Trinidad, Benguet, Mt. Yangbew, also called Mt. Jumbo, is a well-liked hiking destination. It is notably well-known for its breathtaking views of the surrounding mountains and the La Trinidad Valley, especially at sunrise and sunset.",
			location = "Ambiong-Lubas-Tawang Rd., La Trinidad",
			imageResId = R.drawable.yangbew
        ),
        Others(
			name = "Bell Church",
			description = "The Bell Church is a distinctive and intriguing Chinese temple that combines Buddhist and Taoist traditions. It is situated in La Trinidad, Benguet. It is a well-liked vacation spot because of its beautiful architecture, calm ambiance, and cultural importance.",
			location = "Bell Church Rd, La Trinidad",
			imageResId = R.drawable.betterchurch
        ),
        Others(
			name = "The Adivay Festival",
			description = "The Adivay Festival is a colorful celebration of the Philippines' Benguet Province's rich cultural legacy. \"Adivay\" is an Ibaloi term that means \"having fun and coming together.\"\"",
			location = " Benguet Sports Complex, Wangal, La Trinidad",
			imageResId = R.drawable.adivay
        )
    )

    val culturalAttractions: List<Attraction>
		get() = listOf(

			Attraction(
				name = "Arca's Yard Library & Museum",
				description = "Through art and community, Tam-Awan Village honors Cordilleran tradition as an artist's village. In addition to viewing local artwork and taking part in seminars teaching traditional skills like weaving and ceramics, visitors can explore traditional cottages constructed from locally available materials.",
				location = "777 Tiptop Road, La Trinidad",
				hours = "8:00 AM to 7:30 PM",
				imageResId = R.drawable.arcamuseum
			),

			Attraction(
				name = "Mt. Kalugong Cultural Village",
				description = "Along with a range of cultural attractions like traditional Igorot huts, a coffee shop, and hiking routes, this high-altitude location offers breathtaking panoramic views of the La Trinidad Valley.",
				location = "Kalugong Rd, La Trinidad.",
				hours = "7:00 AM to 6:00 PM",
				imageResId = R.drawable.kalugong
			)
		)
}
