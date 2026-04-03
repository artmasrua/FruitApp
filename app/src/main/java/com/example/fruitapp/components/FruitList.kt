package com.example.fruitapp.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.fruitapp.classes.FruitsDatabase
import com.example.fruitapp.classes.FruitsDatabase.findAll
import com.example.fruitapp.viewmodel.FruitListViewModel
import com.example.fruitapp.classes.Fruit
@Composable
fun FruitList(padding: PaddingValues, navController: NavController) {
    val viewModel: FruitListViewModel = viewModel()
    val fruitListState = viewModel.uiState.collectAsState().value

    LazyColumn(
        modifier = Modifier.padding(padding)
    ) {
        item {
            Text(
                "Frutas",
                fontSize = 30.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
            )
        }

        items(fruitListState.fruits) {fruit ->
            FruitCard(fruit, navController)
        }

    }
}