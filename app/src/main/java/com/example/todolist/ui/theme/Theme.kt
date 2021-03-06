package com.example.todolist.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

private val DarkColorPalette = darkColors(
    surface = Color.Black,
    onSurface = gray1,
    primary = gray1,
    onPrimary = Color.DarkGray
)

private val LightColorPalette = lightColors(
    surface = Color.White,
    onSurface = Color.Black,
    primary = Color.LightGray,
    onPrimary = Navy
)


@Composable
fun ToDoListTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}