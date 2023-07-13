package com.devkraken.portfolio.ui.features.technologies.pages

sealed class PagerState {
    companion object {
        const val pages = 2
        fun getPage(state: Int) : PagerState {
            return when(state) {
                1 -> return Android
                2 -> return Flutter
                else -> {
                    Android
                }
            }
        }
    }

    object Android : PagerState()
    object Flutter : PagerState()
}
