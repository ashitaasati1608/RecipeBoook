package com.jetpackcompose.android.composableCookBook.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.jetpackcompose.android.composableCookBook.domain.model.Recipe
import com.jetpackcompose.android.composableCookBook.presentation.utils.loadPicture
import com.jetpackcompose.android.composableCookBook.R

@Composable
fun RecipeCard(recipe: Recipe, onClick: () -> Unit) {
    Card(
        shape = MaterialTheme.shapes.small,
        modifier = Modifier.padding(
            top = 6.dp,
            bottom = 6.dp,
            start = 12.dp,
            end = 12.dp
        )
            .fillMaxWidth()
            .clickable(onClick = onClick),
        elevation = 16.dp
    ) {

        Column {
            recipe.featuredImage?.let { url ->
                loadPicture(url = url, defaultImage = R.drawable.empty_image).value?.let { image ->
                    Image(
                        image.asImageBitmap(),
                        modifier = Modifier
                            .fillMaxWidth()
                            .preferredHeight(225.dp),
                        contentScale = ContentScale.Crop
                    )
                }
            }
            recipe.title?.let { title ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 12.dp, bottom = 12.dp, start = 8.dp, end = 8.dp)
                ) {
                    Text(
                        title,
                        modifier = Modifier
                            .fillMaxWidth(0.85f)
                            .wrapContentWidth(Alignment.Start),
                        style = MaterialTheme.typography.h6
                    )

                    Text(
                        recipe.rating.toString(),
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentWidth(Alignment.End)
                            .align(Alignment.CenterVertically),
                        style = MaterialTheme.typography.h6
                    )
                }
            }
        }
    }
}
