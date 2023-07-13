package com.devkraken.portfolio.ui.features.technologies

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import com.devkraken.portfolio.ui.features.technologies.pages.android.AndroidPage
import com.devkraken.portfolio.ui.features.technologies.pages.PagerState

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TechnologiesPage() {
    val pagerState = rememberPagerState(pageCount = { PagerState.pages })

    HorizontalPager(state = pagerState) { page ->
        when (PagerState.getPage(page)) {
            PagerState.Android -> {
                AndroidPage()
            }

            PagerState.Flutter -> {
                AndroidPage()
            }
        }
    }
}
