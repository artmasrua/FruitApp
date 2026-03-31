package com.example.fruitapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.fruitapp.FruitInfo
import com.example.fruitapp.R
import com.example.fruitapp.classes.Fruit
import com.example.fruitapp.ui.theme.FruitAppTheme
import com.example.fruitapp.viewmodel.FruitListViewModel

@Composable
fun FruitCard(fruit: Fruit, navController: NavController) {
    Card(
        onClick = {navController.navigate(FruitInfo(id = fruit.id))},
        elevation = CardDefaults.cardElevation(
            defaultElevation = 8.dp
        ),
        modifier = Modifier
            .background(Color.Gray)
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(fruit.photo),
            contentDescription = "Imagem do fruta ${fruit.name}",
            modifier = Modifier
                .fillMaxWidth()
                .size(200.dp)
                .padding(20.dp)
        )
        Text(
            text = fruit.name,
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
        )
        Text(
            text = "Clique para saber mais",
            fontSize = 15.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
        )
    }
}

//@Preview (showBackground = true, showSystemUi = false)
//@Composable
//fun teste() {
//    val fruit = Fruit(
//        id = 1,
//        name = "Abacate",
//        description = "O abacate, também conhecido como pera-abacate, é o fruto comestível do abacateiro (nome científico: Persea americana), uma árvore da família da Lauraceae nativa do México e da América do Sul, hoje extensamente cultivada em regiões tropicais e subtropicais, inclusive nas Ilhas Canárias, na Ilha da Madeira e na Sicília.",
//        photo = R.drawable.abacate
//    )
//
//    FruitCard(fruit)
//}