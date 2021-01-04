package com.jetpackcompose.android.composableCookBook.presentation.ui.recipe_list

import com.jetpackcompose.android.composableCookBook.presentation.ui.recipe_list.FoodCategory.*

enum class FoodCategory(val value: String) {
    CHICKEN("Chicken"),
    BEEF("Beef"),
    SOUP("Soup"),
    DESSERT("Dessert"),
    MILK("Milk"),
    VEGETARIAN("Vegetarian"),
    VEGAN("Vegan"),
    PIZZA("Pizza"),
    DONUT("Donut")
}

fun getAllFoodCategories(): List<FoodCategory> {
    return listOf(
        CHICKEN,
        BEEF,
        SOUP,
        DESSERT,
        MILK,
        VEGETARIAN,
        VEGAN,
        PIZZA,
        DONUT
    )
}

fun getFoodCategory(value: String): FoodCategory? {
    return FoodCategory.values().associateBy { FoodCategory::value }[value]
}