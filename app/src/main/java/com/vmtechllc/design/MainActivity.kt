package com.vmtechllc.design

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vmtechllc.design.ui.theme.DesignTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DesignTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DesignTheme {
        Greeting("Android")
    }
}

@Preview(showBackground = true)
@Composable
fun FriendlyMessage(){
    Text(text = "Greetings!", fontStyle = FontStyle.Italic, fontFamily = FontFamily.SansSerif, color = Color.Blue, fontWeight = FontWeight.Bold)
}
@Preview
@Composable
fun ClickableButton(){
    Button(
        onClick = {/* callback */}, 
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Cyan,
            contentColor = Color.Magenta),
        shape = MaterialTheme.shapes.small
    ) { Text(text = "Click here")}
}
@Preview
@Composable
fun NameInput(){
    val textState = remember {
        mutableStateOf("")
    }
    TextField(value = textState.value, onValueChange = {newValue -> textState.value = newValue},
        label = { Text(text = "Your name")})
}
@Preview(showBackground = true)
@Composable
fun BeautifulImage(){
    Image(painter = painterResource(R.drawable.ic_launcher_foreground), contentDescription = "My App Icon", contentScale = ContentScale.Fit)
}
@Preview
@Composable
fun ColoredBox(){
    Box(modifier = Modifier.size(120.dp).background(Color.DarkGray).padding(16.dp).clip(
        RoundedCornerShape(size = 20.dp)).background(Color.Cyan))
}

