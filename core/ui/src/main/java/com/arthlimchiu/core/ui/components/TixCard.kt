package com.arthlimchiu.core.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import coil.compose.AsyncImage

@Composable
fun TixCard(
    imageUrl: String,
    modifier: Modifier = Modifier
) {
    AsyncImage(
        model = imageUrl,
        contentDescription = null,
        modifier = modifier,
        contentScale = ContentScale.Crop
    )
}