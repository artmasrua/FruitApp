package com.example.fruitapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavArgs
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.fruitapp.classes.Fruit
import com.example.fruitapp.components.FruitCard
import com.example.fruitapp.components.fruitInfo
import com.example.fruitapp.ui.theme.FruitAppTheme
import com.example.fruitapp.components.fruitList
import kotlinx.serialization.Serializable

@Serializable
object telaInicial
@Serializable
data class FruitInfo(val id: Int)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()

            NavHost(navController = navController, startDestination = telaInicial) {
                composable<telaInicial> {telaInicial(navController)}
                composable<FruitInfo> {fruitInfo(1)}
            }
            FruitAppTheme {
                telaInicial(navController)
            }
        }
    }
}

@Composable
fun telaInicial(navController: NavController) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        fruitList(innerPadding, navController)
    }
}
