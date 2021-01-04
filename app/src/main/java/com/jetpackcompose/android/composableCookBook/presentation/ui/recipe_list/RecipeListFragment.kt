package com.jetpackcompose.android.composableCookBook.presentation.ui.recipe_list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.jetpackcompose.android.composableCookBook.presentation.components.RecipeCard
import com.jetpackcompose.android.composableCookBook.presentation.components.SearchAppBar
import com.jetpackcompose.android.composableCookBook.presentation.components.circularIndeterminateCircularBar
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RecipeListFragment : Fragment() {

    private val viewModel: RecipeListViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                displayView()
            }
        }
    }

    @Composable
    fun displayView() {
        val recipes = viewModel.recipes.value
        val query = viewModel.query.value
        val selectedCategory = viewModel.selectedCategory.value
        val loading = viewModel.loading.value

        Column {
            TopAppBar(title = {
                Text("Recipe book")
            })

            Column {
                SearchAppBar(
                    query = query,
                    onQueryChanged = viewModel::onQueryChanged,
                    newSearch = viewModel::newSearch,
                    categoryScrollPosition = viewModel.categoryScrollPosition,
                    onCategoryScrollPositionChange = viewModel::onCategoryScrollPositionChange,
                    onSelectedCategoryChanged = viewModel::onSelectedCategoryChanged,
                    selectedCategory = selectedCategory
                )

                Box(modifier = Modifier.fillMaxSize()) {
                    LazyColumn {
                        itemsIndexed(items = recipes) { index, recipe ->
                            RecipeCard(recipe, onClick = {})
                        }
                    }
                    circularIndeterminateCircularBar(isDisplayed = loading)
                }
            }
        }
    }
}