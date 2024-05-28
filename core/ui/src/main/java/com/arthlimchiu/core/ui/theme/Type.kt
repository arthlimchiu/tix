package com.arthlimchiu.core.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.arthlimchiu.core.ui.R

val poppinsFamily = FontFamily(
    Font(R.font.poppins_medium, FontWeight.Medium),
    Font(R.font.poppins_regular, FontWeight.Normal),
    Font(R.font.poppins_bold, FontWeight.Bold)
)

// Set of Material typography styles to start with
val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    displayMedium = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    displaySmall = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 36.sp,
        lineHeight = 44.0.sp,
        letterSpacing = 0.0.sp,
    ),
    headlineLarge = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 33.sp,
        lineHeight = 40.0.sp,
        letterSpacing = 0.0.sp,
    ),
    headlineMedium = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 28.sp,
        lineHeight = 36.0.sp,
        letterSpacing = 0.0.sp,
    ),
    headlineSmall = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 32.sp,
        lineHeight = 32.0.sp,
        letterSpacing = 0.0.sp,
    ),
    titleLarge = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.0.sp,
        letterSpacing = 0.0.sp,
    ),
    titleMedium = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        lineHeight = 24.0.sp,
        letterSpacing = 0.2.sp,
    ),
    titleSmall = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 20.0.sp,
        letterSpacing = 0.1.sp,
    ),
    bodyLarge = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.0.sp,
        letterSpacing = 0.5.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.0.sp,
        letterSpacing = 0.2.sp,
    ),
    bodySmall = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 16.0.sp,
        letterSpacing = 0.4.sp,
    ),
    labelLarge = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 20.0.sp,
        letterSpacing = 0.1.sp,
    ),
    labelMedium = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
        lineHeight = 16.0.sp,
        letterSpacing = 0.5.sp,
    ),
    labelSmall = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.0.sp,
        letterSpacing = 0.5.sp,
    )
)