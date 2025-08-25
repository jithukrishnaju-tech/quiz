package com.jk.udemyproject.testify.dashboard.screens

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jk.udemyproject.testify.R
import com.jk.udemyproject.testify.dashboard.components.Banner
import com.jk.udemyproject.testify.dashboard.components.BottomNavigationBar
import com.jk.udemyproject.testify.dashboard.components.CategoryGrid
import com.jk.udemyproject.testify.dashboard.components.CategoryHeader
import com.jk.udemyproject.testify.dashboard.components.GameMadeButtons
import com.jk.udemyproject.testify.dashboard.components.TopUserSection

@Composable
@Preview
fun MainScreen(onSingleClick: () -> Unit = {}) {
    val scrollState = rememberScrollState()
    Box(
        modifier = Modifier
            .fillMaxSize()

    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
        ) {
            TopUserSection()
            Spacer(modifier = Modifier.height(16.dp))
            GameMadeButtons(onSinglePlayerClick = onSingleClick)
            Spacer(modifier = Modifier.height(32.dp))
            CategoryHeader()
            CategoryGrid()
            Spacer(modifier = Modifier.height(24.dp))
            Banner()
        }
        BottomNavigationBar(
            modifier = Modifier.align(Alignment.BottomCenter),
            onItemSelected = {
                when (it) {
                    R.id.home -> {
                        Log.d("BottomNavigationBar", "Home Clicked")
                    }

                    R.id.board -> {
                        Log.d("BottomNavigationBar", "Board Clicked")
                    }

                    R.id.favorite -> {
                        Log.d("BottomNavigationBar", "Favorite Clicked")
                    }

                    R.id.profile -> {
                        Log.d("BottomNavigationBar", "Profile Clicked")
                    }

                    else -> {
                        Log.d("BottomNavigationBar", "something else is Clicked")
                    }
                }
            }
        )
    }

}