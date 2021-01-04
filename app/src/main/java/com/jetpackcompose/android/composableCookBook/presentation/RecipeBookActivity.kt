package com.jetpackcompose.android.composableCookBook.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jetpackcompose.android.composableCookBook.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RecipeBookActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}