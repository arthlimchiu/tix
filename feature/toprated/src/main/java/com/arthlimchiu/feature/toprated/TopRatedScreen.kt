package com.arthlimchiu.feature.toprated

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.arthlimchiu.core.model.Movie
import com.arthlimchiu.core.ui.components.TixCard
import com.arthlimchiu.core.ui.components.TixSection
import com.arthlimchiu.core.ui.components.TixSlider

@Composable
internal fun TopRatedRoute(viewModel: TopRatedViewModel = hiltViewModel()) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    TopRatedScreen(movies = uiState.movies)
}

@Composable
internal fun TopRatedScreen(movies: List<Movie>) {
    if (movies.isNotEmpty()) {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(bottom = 16.dp)
        ) {
            TixSection(title = "Action Movies") {
                TixSlider {
                    items(movies.shuffled(), key = { movie -> movie.id }) { movie ->
                        TixCard(
                            imageUrl = movie.posterUrl,
                            modifier = Modifier
                                .size(width = 112.dp, height = 156.dp)
                                .clip(RoundedCornerShape(4.dp))
                        )
                    }
                }
            }

            TixSection(title = "Hollywood Movies") {
                TixSlider {
                    items(movies.shuffled(), key = { movie -> movie.id }) { movie ->
                        TixCard(
                            imageUrl = movie.posterUrl,
                            modifier = Modifier
                                .size(width = 112.dp, height = 156.dp)
                                .clip(RoundedCornerShape(4.dp))
                        )
                    }
                }
            }

            TixSection(title = "Today's Top Picks for You") {
                TixSlider {
                    items(movies.shuffled(), key = { movie -> movie.id }) { movie ->
                        TixCard(
                            imageUrl = movie.posterUrl,
                            modifier = Modifier
                                .size(width = 112.dp, height = 156.dp)
                                .clip(RoundedCornerShape(4.dp))
                        )
                    }
                }
            }

            TixSection(title = "New on Tix") {
                TixSlider {
                    items(movies.shuffled(), key = { movie -> movie.id }) { movie ->
                        TixCard(
                            imageUrl = movie.posterUrl,
                            modifier = Modifier
                                .size(width = 112.dp, height = 156.dp)
                                .clip(RoundedCornerShape(4.dp))
                        )
                    }
                }
            }

            TixSection(title = "Popular TV Shows") {
                TixSlider {
                    items(movies.shuffled(), key = { movie -> movie.id }) { movie ->
                        TixCard(
                            imageUrl = movie.posterUrl,
                            modifier = Modifier
                                .size(width = 112.dp, height = 156.dp)
                                .clip(RoundedCornerShape(4.dp))
                        )
                    }
                }
            }
        }
    }
}