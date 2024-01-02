package com.vmtechllc.design

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.Card
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vmtechllc.design.ui.theme.DesignTheme

class RestaurantsScreen {
       // @Preview(showBackground = true)
    @Composable
    fun RestaurantsScreen() {
        RestaurantsScreen()
    }
    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview(){
        DesignTheme{
            RestaurantsScreen()
        }
    }
    //Building a restaurant element layout
    @Composable
    fun RestaurantScreen(){
        RestaurantItem()
    }
    @Composable
    fun RestaurantItem() {
        Card(modifier = Modifier.padding(8.dp)) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(8.dp)
            ) {
                RestaurantIcon(
                    Icons.Filled.Place,
                    Modifier.weight(0.15f)
                )
                RestaurantDetails(Modifier.weight(0.85f))
            }
        }
    }

    @Composable
    private fun RestaurantIcon(icon: ImageVector, modifier: Modifier) {
        Image(
            imageVector = icon,
            contentDescription = "Restaurant icon",
            modifier = modifier.padding(8.dp)
        )
    }

    @Composable
    private fun RestaurantDetails(modifier: Modifier) {
        Column(modifier = modifier) {
            Text(text = "Alfredo's Dishes ", style = MaterialTheme.typography.bodyMedium)
            CompositionLocalProvider (){
                Text(
                    text = "At Alfredo's ... seafood dishes.",
                    style = MaterialTheme.typography.bodyMedium)
            }
        }
    }

}