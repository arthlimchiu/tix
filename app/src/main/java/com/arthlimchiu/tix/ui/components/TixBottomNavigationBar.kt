package com.arthlimchiu.tix.ui.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavDestination.Companion.hierarchy
import com.arthlimchiu.tix.ui.TixAppState

@Composable
fun TixBottomNavigationBar(
    appState: TixAppState,
    modifier: Modifier = Modifier
) {
    val currentDestination = appState.currentDestination

    TixBottomNavigationBar(modifier = modifier) {
        appState.topLevelScreens.forEach { screen ->
            NavigationBarItem(
                selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true,
                onClick = { appState.navigateToTopLevelScreen(screen) },
                icon = { Icon(screen.icon, contentDescription = stringResource(screen.textId)) },
                label = { Text(text = stringResource(screen.textId)) }
            )
        }
    }
}

@Composable
fun TixBottomNavigationBar(
    modifier: Modifier = Modifier,
    content: @Composable RowScope.() -> Unit
) {
    NavigationBar(modifier = modifier) {
        content()
    }
}