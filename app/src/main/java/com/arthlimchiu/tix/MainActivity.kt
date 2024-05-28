package com.arthlimchiu.tix

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.arthlimchiu.core.ui.theme.TixTheme
import com.arthlimchiu.tix.navigation.TixNavHost
import com.arthlimchiu.tix.ui.components.TixBottomNavigationBar
import com.arthlimchiu.tix.ui.rememberTixAppState
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val appState = rememberTixAppState()

            TixTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    bottomBar = { TixBottomNavigationBar(appState) }
                ) { innerPadding ->
                    TixNavHost(
                        appState = appState,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}