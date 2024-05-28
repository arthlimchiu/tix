package com.arthlimchiu.feature.toprated

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.arthlimchiu.data.MoviesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TopRatedViewModel @Inject constructor(
    private val moviesRepository: MoviesRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(TopRatedUiState())
    val uiState: StateFlow<TopRatedUiState> = _uiState.asStateFlow()

    init {
        viewModelScope.launch {
            moviesRepository
                .getMovies()
                .collect { movies ->
                    _uiState.update { state -> state.copy(movies = movies) }
                }
        }
    }
}