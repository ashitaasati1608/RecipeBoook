package com.jetpackcompose.android.composableCookBook.domain.network

import com.jetpackcompose.android.composableCookBook.domain.model.Recipe
import com.jetpackcompose.android.composableCookBook.domain.util.DomainMapper

class RecipeDtoMapper : DomainMapper<RecipeDto, Recipe> {

    override fun mapToDomainModel(model: RecipeDto): Recipe {
        return Recipe(
            id = model.pk,
            title = model.title,
            featuredImage = model.featured_image,
            rating = model.rating,
            publisher = model.publisher,
            sourceUrl = model.source_url,
            description = model.description,
            cookingInstructions = model.cookingInstructions,
            ingredients = model.ingredients,
            dateAdded = model.dateAdded,
            dateUpdated = model.dateUpdated
        )
    }

    override fun mapFromDomainModel(domainModel: Recipe): RecipeDto {
        return RecipeDto(
            pk = domainModel.id,
            title = domainModel.title,
            featured_image = domainModel.featuredImage,
            rating = domainModel.rating,
            publisher = domainModel.publisher,
            source_url = domainModel.sourceUrl,
            description = domainModel.description,
            cookingInstructions = domainModel.cookingInstructions,
            ingredients = domainModel.ingredients,
            dateAdded = domainModel.dateAdded,
            dateUpdated = domainModel.dateUpdated
        )
    }

    fun toDomainList(initial: List<RecipeDto>?): List<Recipe>? {
        return initial?.map {
            mapToDomainModel(it)
        }
    }

    fun fromDomainList(initial: List<Recipe>): List<RecipeDto> {
        return initial.map {
            mapFromDomainModel(it)
        }
    }
}