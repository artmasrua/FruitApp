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
import androidx.navigation.toRoute
import com.example.fruitapp.classes.Fruit
import com.example.fruitapp.components.FruitCard
import com.example.fruitapp.components.FruitInfo
import com.example.fruitapp.ui.theme.FruitAppTheme
import com.example.fruitapp.components.FruitList
import kotlinx.serialization.Serializable

@Serializable
object TelaInicial
@Serializable
data class FruitInfoRoute(val id: Int)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FruitInfo(id = 1)
//            val navController = rememberNavController()
//
//            NavHost(navController = navController, startDestination = TelaInicial) {
//                composable<TelaInicial> {TelaInicial(navController)}
//                composable<FruitInfoRoute> { backStackEntry ->
//                    val fruit: FruitInfoRoute = backStackEntry.toRoute()
//                    FruitInfo(fruit.id)
//                }
//            }
//            FruitAppTheme {
//                TelaInicial(navController)
//            }
        }
    }
}

@Composable
fun TelaInicial(navController: NavController) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        FruitList(innerPadding, navController)
    }
}
