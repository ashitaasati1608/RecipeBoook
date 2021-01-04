package com.jetpackcompose.android.composableCookBook.di

import com.jetpackcompose.android.composableCookBook.domain.network.RecipeDtoMapper
import com.jetpackcompose.android.composableCookBook.domain.network.RecipeService
import com.jetpackcompose.android.composableCookBook.domain.repository.RecipeRepository
import com.jetpackcompose.android.composableCookBook.domain.repository.RecipeRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideRepository(
        recipeService: RecipeService,
        recipeDtoMapper: RecipeDtoMapper
    ): RecipeRepository {
        return RecipeRepositoryImpl(
            recipeService = recipeService,
            recipeDtoMapper = recipeDtoMapper
        )
    }
}