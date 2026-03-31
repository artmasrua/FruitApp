package com.example.fruitapp.model

import com.example.fruitapp.classes.Fruit
import com.example.fruitapp.classes.FruitsDatabase

data class FruitListState(
    val fruits: List<Fruit> = FruitsDatabase.findAll()
)