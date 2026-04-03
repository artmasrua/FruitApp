package com.example.fruitapp.viewmodel

import androidx.lifecycle.ViewModel
import com.example.fruitapp.model.FruitListState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow


class FruitListViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(FruitListState())

    val uiState = _uiState.asStateFlow()

}