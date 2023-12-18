package solved.leetcode.code_december


fun main() {

    val foods = arrayOf("kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi")
    val cuisines = arrayOf("korean", "japanese", "japanese", "greek", "japanese", "korean")
    val ratings = intArrayOf(9, 12, 8, 15, 14, 7)

    val foodRatings = FoodRatings(foods, cuisines, ratings)

    println(foodRatings.highestRated("korean"))
    println(foodRatings.highestRated("japanese"))

    foodRatings.changeRating("sushi", 16)

    println(foodRatings.highestRated("japanese"))

    foodRatings.changeRating("ramen", 16)

    println(foodRatings.highestRated("japanese"))


}

class FoodRatings(foods: Array<String>, cuisines: Array<String>, ratings: IntArray) {
    // cuisine -> foodDetails
    val mapCus = mutableMapOf<String, MutableList<FoodDetails>>()

    // food -> cuisine
    val foodMap = mutableMapOf<String, String>()

    init {
        for (i in foods.indices) {
            foodMap[foods[i]] = cuisines[i]
            val foodDetails = FoodDetails(
                foods[i],
                cuisines[i],
                ratings[i]
            )
            val list = mapCus.getOrDefault(cuisines[i], mutableListOf())
            list.add(foodDetails)
            mapCus[cuisines[i]] = list
        }


    }

    fun changeRating(food: String, newRating: Int) {
        val foodList = mapCus[foodMap[food]]
        foodList!!.forEach {
            if (food == it.food) {
                it.rating = newRating
            }
        }
    }

    fun highestRated(cuisine: String): String {
        val list = mapCus[cuisine]
        list!!.sortBy { it.rating }

        val food = list.maxByOrNull { it.rating }

        return food!!.food
    }

    data class FoodDetails(
        val food: String,
        val cuisine: String,
        var rating: Int
    )

}