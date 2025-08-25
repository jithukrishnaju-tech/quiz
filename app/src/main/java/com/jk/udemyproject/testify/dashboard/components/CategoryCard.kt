package com.jk.udemyproject.testify.dashboard.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jk.udemyproject.testify.R


@Composable
@Preview
fun CategoryGrid() {
    Column {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            CategoryCard(
                "Science",
                R.drawable.cat1,
                modifier = Modifier
                    .padding(start = 24.dp, end = 24.dp, top = 16.dp).weight(1f)
            )
            CategoryCard(
                "History",
                R.drawable.cat2,
                modifier = Modifier
                    .padding(start = 24.dp, end = 24.dp, top = 16.dp).weight(1f)
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(modifier = Modifier.fillMaxWidth()) {
            CategoryCard(
                "Science",
                R.drawable.cat3,
                modifier = Modifier
                    .padding(start = 24.dp, end = 24.dp, top = 16.dp).weight(1f)
            )
            CategoryCard(
                "History",
                R.drawable.cat4,
                modifier = Modifier
                    .padding(start = 24.dp, end = 24.dp, top = 16.dp).weight(1f)
            )
        }

    }

}

@Composable
fun CategoryCard(title: String, resId: Int, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .height(50.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(colorResource(id = R.color.white))
            .padding(start = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Image(
            painter = painterResource(resId),
            contentDescription = null,
            modifier = Modifier.size(32.dp)
        )

        Spacer(
            modifier = Modifier.width(
                16.dp
            )
        )

        Text(text = title, fontSize = 17.sp, fontWeight = FontWeight.Bold)

    }
}
