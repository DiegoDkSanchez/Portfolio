package com.devkraken.portfolio.ui.features.technologies.pages.android

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.devkraken.portfolio.R

@Composable
fun AndroidPage() {
    Column(
        Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo_android),
            contentDescription = "Android Logo",
            modifier = Modifier
                .width(244.dp)
                .height(139.dp)
                .weight(1f)
        )
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(topEnd = 179.dp))
                .weight(2f)
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.onSecondaryContainer),
        ) {
            Image(
                modifier = Modifier.padding(top = 40.dp),
                painter = painterResource(id = R.drawable.android_background),
                contentDescription = "Android background",
            )
            Text(
                modifier = Modifier.padding(20.dp),
                text = stringResource(id = R.string.android_title),
                style = MaterialTheme.typography.titleLarge.copy(
                    color = MaterialTheme.colorScheme.onSecondary,
                    fontSize = 54.sp
                ),
            )
        }
    }
}