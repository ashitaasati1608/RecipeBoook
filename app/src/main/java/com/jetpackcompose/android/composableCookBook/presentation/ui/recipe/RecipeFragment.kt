package com.jetpackcompose.android.composableCookBook.presentation.ui.recipe

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material.AmbientTextStyle
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.jetpackcompose.android.composableCookBook.presentation.ui.recipe_list.RecipeListViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RecipeFragment : Fragment() {
    private val viewModel: RecipeListViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("RecipeFragment : $viewModel")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return ComposeView(requireContext()).apply {
            setContent {
                Text(
                    "Recipe Fragment",
                    Modifier,
                    Color.Unspecified,
                    TextUnit.Unspecified,
                    null,
                    null,
                    null,
                    TextUnit.Unspecified,
                    null,
                    null,
                    TextUnit.Unspecified,
                    TextOverflow.Clip,
                    true,
                    Int.MAX_VALUE,
                    {},
                    AmbientTextStyle.current
                )
            }
        }
    }
}