package com.jk.udemyproject.testify.dashboard.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jk.udemyproject.testify.R

@Composable
@Preview
fun GameMadeButtons(onSinglePlayerClick: () -> Unit = {}) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp)
            .height(145.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        GameButton(
            backgroundColor = R.color.purple_700,
            iconRes = R.drawable.btn1,
            text = "Create Quiz",
            onSinglePlayerClick
        )
        Spacer(modifier = Modifier.width(12.dp))
        GameButton(
            backgroundColor = R.color.purple_200,
            iconRes = R.drawable.btn2,
            text = "Single Player",
            onSinglePlayerClick
        )
        Spacer(modifier = Modifier.width(12.dp))
        GameButton(
            backgroundColor = R.color.teal_700,
            iconRes = R.drawable.btn2,
            text = "Multiple Player",
            onSinglePlayerClick
        )
    }
}


@Composable
fun GameButton(
    backgroundColor: Int,
    iconRes: Int,
    text: String,
    onClick: (() -> Unit)? = null,
) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .clickable(enabled = onClick != null) { onClick?.invoke() }
            .clip(shape = RoundedCornerShape(size = 10.dp))
            .background(color = colorResource(id = backgroundColor))
            .padding(all = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = iconRes),
            contentDescription = null,
            modifier = Modifier
                .width(90.dp)
                .height(60.dp)
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = text,
            color = colorResource(id = R.color.white),
            textAlign = TextAlign.Center
        )
    }
}
