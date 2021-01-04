package com.jetpackcompose.android.composableCookBook.domain.network

import com.google.gson.annotations.SerializedName

data class RecipeDto(
    var pk: Int? = null,
    var title: String? = null,
    var publisher: String? = null,
    var featured_image: String? = null,
    var rating: Int? = 0,
    var source_url: String? = null,
    var description: String? = null,
    @SerializedName("cooking_instructions")
    var cookingInstructions: String? = null,
    var ingredients: List<String>? = null,
    @SerializedName("date_added")
    var dateAdded: String? = null,
    @SerializedName("date_updated")
    var dateUpdated: String? = null
)