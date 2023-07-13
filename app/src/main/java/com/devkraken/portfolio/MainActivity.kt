package com.devkraken.portfolio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.devkraken.portfolio.ui.features.technologies.TechnologiesPage
import com.devkraken.portfolio.ui.theme.PortfolioTheme
import com.devkraken.portfolio.ui.theme.White
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val systemUiController = rememberSystemUiController()
            PortfolioTheme {
                SideEffect {
                    systemUiController.setStatusBarColor(Color.Black)
                }
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Box(
                        Modifier
                            .fillMaxHeight()
                            .background(White)
                    ) {
                        TechnologiesPage()
                    }
                }
            }
        }
    }
}
