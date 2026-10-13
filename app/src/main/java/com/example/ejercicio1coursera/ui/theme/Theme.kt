
package com.example.ejercicio1coursera.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val PuppyColorScheme = lightColorScheme(
    primary = PrimaryColor,
    onPrimary = DarkPrimaryColor,
    primaryContainer = PrimaryColor,
    onPrimaryContainer = DarkPrimaryColor,
    secondary = AccentColor,
    onSecondary = White,
    background = White,
    onBackground = DarkPrimaryColor,
    surface = White,
    onSurface = DarkPrimaryColor
)

@Composable
fun IdentidadCorporativaTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = PuppyColorScheme,
        content = content
    )
}
