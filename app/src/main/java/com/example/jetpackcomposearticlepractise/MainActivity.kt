package com.example.jetpackcomposearticlepractise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposearticlepractise.ui.theme.SoftballIQTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SoftballIQTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   AppPractise(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun AppPractise(modifier: Modifier = Modifier) {
    val title = stringResource(R.string.title)
    val par1 = stringResource((R.string.par1))
    val par2 = stringResource(R.string.par2)
    val image = painterResource(R.drawable.bg_compose_background)

    Column(modifier = modifier) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillWidth
        )
        Text(
            text = title,
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp
        )
        Text(
            text = par1,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify,
            fontSize = 16.sp
        )
        Text(
            text = par2,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify,
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SoftballIQTheme {
        AppPractise()
    }
}