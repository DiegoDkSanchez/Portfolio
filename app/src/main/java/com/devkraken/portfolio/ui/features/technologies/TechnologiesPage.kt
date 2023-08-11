package com.devkraken.portfolio.ui.features.technologies

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Modifier
import com.devkraken.portfolio.ui.features.technologies.pages.android.AndroidPage
import com.devkraken.portfolio.ui.features.technologies.pages.PagerState
import com.devkraken.portfolio.ui.features.technologies.pages.flutter.FlutterPage
import kotlinx.coroutines.flow.collect

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TechnologiesPage() {
    val pagerState = rememberPagerState(pageCount = { PagerState.pages })

    LaunchedEffect (pagerState) {
        snapshotFlow { pagerState.currentPage }.collect { page ->
            println("SIMON LE DISTE") 
        }
    }

    HorizontalPager(state = pagerState) { page ->
        val backgroundColor = when(PagerState.getPage(page)) {
            PagerState.Android -> MaterialTheme.colorScheme.secondary
            PagerState.Flutter -> MaterialTheme.colorScheme.tertiary
        }
        Box (Modifier.background(backgroundColor)) {
            when (PagerState.getPage(page)) {
                PagerState.Android -> {
                    AndroidPage()
                }
                PagerState.Flutter -> {
                    FlutterPage()
                }
            }
        }
    }
}
