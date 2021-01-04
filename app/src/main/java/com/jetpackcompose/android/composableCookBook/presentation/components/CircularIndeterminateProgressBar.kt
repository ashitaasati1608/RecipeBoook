package com.jetpackcompose.android.composableCookBook.presentation.components

import androidx.compose.foundation.layout.ConstraintLayout
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun circularIndeterminateCircularBar(isDisplayed: Boolean) {
    if (isDisplayed) {

        //Way 1 to create Loading Indicator using Constraint Layout
        ConstraintLayout(modifier = Modifier.fillMaxSize()) {
            val progress = createRef()
            val createGuideline = createGuidelineFromTop(0.2f)
            CircularProgressIndicator(color = MaterialTheme.colors.primary,
                modifier = Modifier
                    .constrainAs(progress) {
                        top.linkTo(createGuideline)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    })
        }

        //Way 2 to Loading Indicator using Row and Column
        /*Row  (
            modifier = Modifier.fillMaxWidth()
                .padding(50.dp),
            horizontalArrangement = Arrangement.Center,
        ) {
                CircularProgressIndicator(color = MaterialTheme.colors.primary)
        }*/
    }
}