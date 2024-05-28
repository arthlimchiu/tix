package com.arthlimchiu.core.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TixSection(
    modifier: Modifier = Modifier,
    title: String = "",
    content: @Composable () -> Unit
) {
    Column(modifier = modifier) {
        if (title.isNotBlank()) {
            Text(
                text = title,
                modifier = Modifier.padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 8.dp),
                style = MaterialTheme.typography.titleMedium
            )
        }
        content()
    }
}