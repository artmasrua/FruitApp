package com.example.fruitapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.fruitapp.FruitInfo
import com.example.fruitapp.R
import com.example.fruitapp.classes.Fruit
import com.example.fruitapp.classes.FruitsDatabase
import com.example.fruitapp.viewmodel.FruitInfoViewModel

@Composable
fun fruitInfo(id: Int) {
    val viewModel: FruitInfoViewModel = viewModel()
    viewModel.findFruit(id)
    val fruitInfoState = viewModel.uiState.collectAsState().value
    val fruit = fruitInfoState.fruit

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        fruit?.name?.let {
            Text(
                text = it,
                fontSize = 30.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
            )
        }
        fruit?.photo?.let {
            Image(
                painter = painterResource(it),
                contentDescription = "Imagem do fruta ${fruit.name}",
                modifier = Modifier
                    .fillMaxWidth()
                    .size(200.dp)
                    .padding(20.dp)
            )
        }
        fruit?.description?.let {
            Text(
                text = it,
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
            )
        }
    }
}