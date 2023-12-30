package com.vmtechllc.design

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
    Box(modifier = Modifier
        .size(120.dp)
        .background(Color.DarkGray)
        .padding(16.dp)
        .clip(
            RoundedCornerShape(size = 20.dp)
        )
        .background(Color.Cyan))
}

@Preview(showBackground = true)
@Composable
fun HorizontalNumbersList(){
    Row (
        horizontalArrangement = Arrangement.Start, //determines children position horizontally relative to each other
        verticalAlignment = Alignment.CenterVertically, // sets how children are positioned vertically within the parent Row
        modifier = Modifier.fillMaxWidth()
    ){
        Text("1", fontSize = 36.sp, fontFamily = FontFamily.SansSerif)
        Text("2", fontSize = 36.sp, fontFamily = FontFamily.SansSerif)
        Text("3", fontSize = 36.sp, fontFamily = FontFamily.SansSerif)
        Text("4", fontSize = 36.sp, fontFamily = FontFamily.SansSerif)
    }
}

@Preview(showBackground = true)
@Composable
fun NamesVerticalList() {
    Column (verticalArrangement = Arrangement.SpaceEvenly, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()){
        Text("John", fontSize =  36.sp)
        Text("Amanda", fontSize =  36.sp)
        Text("Mike", fontSize =  36.sp)
        Text("Albert", fontSize =  36.sp)

    }
}
@Preview
@Composable
fun MyFloatingActionButton(){
    Box{
        Surface (
            modifier = Modifier.size(64.dp),
            color = Color.Magenta,
            shape = CircleShape,
            content = {})
            Text(text = "+", fontSize = 48.sp,
            modifier = Modifier.align(Alignment.Center)) // The "+" can be aligned relative to other components with the Alignment Argument
    }
}


