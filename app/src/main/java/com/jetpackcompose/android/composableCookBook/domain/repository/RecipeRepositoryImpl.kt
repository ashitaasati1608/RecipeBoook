package com.jetpackcompose.android.composableCookBook.domain.repository

import com.jetpackcompose.android.composableCookBook.domain.model.Recipe
import com.jetpackcompose.android.composableCookBook.domain.network.RecipeDtoMapper
import com.jetpackcompose.android.composableCookBook.domain.network.RecipeService

class RecipeRepositoryImpl(
    private val recipeService: RecipeService,
    private val recipeDtoMapper: RecipeDtoMapper
) : RecipeRepository {

    override suspend fun search(token: String, page: Int, query: String): List<Recipe>? {
        return recipeDtoMapper.toDomainList(
            recipeService.search(
                token,
                page,
                query = query
            ).results
        )

    }

    override suspend fun getRecipe(token: String, id: Int): Recipe {
        return recipeDtoMapper.mapToDomainModel(recipeService.getRecipe(token, id))
    }
}