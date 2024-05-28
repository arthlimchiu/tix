package com.arthlimchiu.core.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = Primary80,
    onPrimary = OnPrimary20,
    primaryContainer = PrimaryContainer30,
    onPrimaryContainer = OnPrimaryContainer90,
    secondary = Secondary80,
    onSecondary = OnSecondary20,
    secondaryContainer = SecondaryContainer30,
    onSecondaryContainer = OnSecondaryContainer90,
    tertiary = Tertiary80,
    onTertiary = OnTertiary20,
    tertiaryContainer = TertiaryContainer30,
    onTertiaryContainer = OnTertiaryContainer90,
    background = Background6,
    onBackground = OnBackground90,
    surface = Surface6,
    onSurface = OnSurface90
)

private val LightColorScheme = lightColorScheme(
    primary = Primary40,
    onPrimary = OnPrimary100,
    primaryContainer = PrimaryContainer90,
    onPrimaryContainer = OnPrimaryContainer10,
    secondary = Secondary40,
    onSecondary = OnSecondary100,
    secondaryContainer = SecondaryContainer90,
    onSecondaryContainer = OnSecondaryContainer10,
    tertiary = Tertiary40,
    onTertiary = OnTertiary100,
    tertiaryContainer = TertiaryContainer90,
    onTertiaryContainer = OnTertiaryContainer10,
    background = Background98,
    onBackground = OnBackground10,
    surface = Surface98,
    onSurface = OnSurface10
)

@Composable
fun TixTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = DarkColorScheme,
        typography = Typography,
        content = content
    )
}