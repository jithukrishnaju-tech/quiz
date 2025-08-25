package com.jk.udemyproject.testify.dashboard.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.jk.udemyproject.testify.R

@Composable
fun BottomNavigationBar(
    onItemSelected: (Int) -> Unit,
    modifier: Modifier = Modifier
) {

    NavigationBar(
        modifier = modifier
            .fillMaxWidth()
            .height(80.dp)
    ) {
        NavigationBarItem(
            selected = false,
            onClick = {
                onItemSelected(R.id.home)
            },
            icon = {
                Icon(
                    painter = painterResource(R.drawable.bottom_btn1),
                    contentDescription = null
                )
            },
            label = { Text("Home") })
        NavigationBarItem(
            selected = false,
            onClick = {
                onItemSelected(R.id.board)
            },
            icon = {
                Icon(
                    painter = painterResource(R.drawable.bottom_btn2),
                    contentDescription = null
                )
            },
            label = { Text("Board") })
        NavigationBarItem(
            selected = false,
            onClick = {
                onItemSelected(R.id.favorite)
            },
            icon = {
                Icon(
                    painter = painterResource(R.drawable.bottom_btn3),
                    contentDescription = null
                )
            },
            label = { Text("Favorite") })
        NavigationBarItem(
            selected = false,
            onClick = {
                onItemSelected(R.id.profile)
            },
            icon = {
                Icon(
                    painter = painterResource(R.drawable.bottom_btn4),
                    contentDescription = null
                )
            },
            label = { Text("Profile") })
    }


}