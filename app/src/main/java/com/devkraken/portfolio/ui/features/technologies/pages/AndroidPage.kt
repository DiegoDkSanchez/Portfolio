package com.devkraken.portfolio.ui.features.technologies.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.devkraken.portfolio.R
import com.devkraken.portfolio.ui.theme.DarkBackgroundAndroid

@Composable
fun AndroidPage() {
    Column (
        Modifier.fillMaxWidth().fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Image(
            painter = painterResource(id = R.drawable.logo_android),
            contentDescription = "Android Logo",
        )
        Box(
          modifier = Modifier.clip(RoundedCornerShape(topEnd = 30.dp))
        ) {
            Text("Example")
        }
    }
}