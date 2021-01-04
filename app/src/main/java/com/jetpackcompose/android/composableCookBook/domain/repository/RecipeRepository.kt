package com.jetpackcompose.android.composableCookBook.domain.repository

import com.jetpackcompose.android.composableCookBook.domain.model.Recipe

interface RecipeRepository {

    suspend fun search(token: String, page: Int, query: String): List<Recipe>?

    suspend fun getRecipe(token: String, id: Int): Recipe
}