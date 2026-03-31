package com.example.fruitapp.viewmodel

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.fruitapp.classes.FruitsDatabase
import com.example.fruitapp.components.fruitInfo
import com.example.fruitapp.model.FruitListState
import com.example.fruitapp.telaInicial
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.serialization.Serializable



class FruitListViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(FruitListState())

    val uiState = _uiState.asStateFlow()

}