package com.example.fruitapp.viewmodel

import androidx.lifecycle.ViewModel
import com.example.fruitapp.classes.Fruit
import com.example.fruitapp.classes.FruitsDatabase
import com.example.fruitapp.model.FruitInfoState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class FruitInfoViewModel: ViewModel() {

    private val _uiState = MutableStateFlow(FruitInfoState(fruit = null))

    val uiState = _uiState.asStateFlow()

    fun findFruit(id: Int) {
        val fruit = FruitsDatabase.findById(id)

        _uiState.update {
            it.copy(fruit = fruit)
        }
    }
}