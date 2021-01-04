package com.jetpackcompose.android.composableCookBook.domain.network.responses

import com.jetpackcompose.android.composableCookBook.domain.network.RecipeDto

data class RecipeSearchResponse(
    var count: Int? = 0,
    var results: List<RecipeDto>? = listOf()
)