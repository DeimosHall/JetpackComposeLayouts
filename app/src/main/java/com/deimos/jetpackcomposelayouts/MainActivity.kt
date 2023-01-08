package com.deimos.jetpackcomposelayouts

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.deimos.jetpackcomposelayouts.ui.theme.JetpackComposeLayoutsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeLayoutsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MyComplexLayout()
                }
            }
        }
    }
}

@Composable
fun MyStateExample() {

    // rememberSaveable saves the state even if the screen is rotated
    //var counter = rememberSaveable { mutableStateOf(0) }
    var counter by rememberSaveable { mutableStateOf(0) }

    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { counter += 1 }) {
            Text(text = "Button")
        }
        Text(text = "Counter: ${counter}")
    }
}

@Composable
fun MyBox() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Box(
            modifier = Modifier
                .width(300.dp)
                .height(300.dp)
                .background(Color.Cyan)
                .padding(15.dp),
            Alignment.CenterEnd
        ) {
            Button(onClick = { }) {
                Text(text = "Button")
            }
        }
    }
}

@Composable
fun MyColumn() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            text = "Text 1",
            Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Color.Cyan)
        )
        Text(
            text = "Text 1",
            Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Color.Cyan)
        )
        Text(
            text = "Text 1",
            Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Color.Cyan)
        )
        Text(
            text = "Text 1",
            Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Color.Cyan)
        )
        Text(
            text = "Text 1",
            Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Color.Cyan)
        )
        Text(
            text = "Text 1",
            Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Color.Cyan)
        )
        Text(
            text = "Text 1",
            Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Color.Cyan)
        )
        Text(
            text = "Text 1",
            Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Color.Cyan)
        )
        Text(
            text = "Text 1",
            Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Color.Cyan)
        )
        Text(
            text = "Text 1",
            Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Color.Cyan)
        )
        Text(
            text = "Text 1",
            Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Color.Cyan)
        )
        Text(
            text = "Text 1",
            Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Color.Cyan)
        )
        Text(
            text = "Text 1",
            Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Color.Cyan)
        )
        Text(
            text = "Text 1",
            Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Color.Cyan)
        )
        Text(
            text = "Text 1",
            Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Color.Cyan)
        )
        Text(
            text = "Text 1",
            Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Color.Cyan)
        )
        Text(
            text = "Text 1",
            Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Color.Cyan)
        )
        Text(
            text = "Text 1",
            Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Color.Cyan)
        )
        Text(
            text = "Text 1",
            Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Color.Cyan)
        )
        Text(
            text = "Text 1",
            Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Color.Cyan)
        )
        Text(
            text = "Text 1",
            Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Color.Cyan)
        )
        Text(
            text = "Text 1",
            Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Color.Cyan)
        )
    }
}

@Composable
fun MyRow() {
    Row(Modifier.fillMaxSize(), horizontalArrangement = Arrangement.SpaceBetween) {
        Text(text = "Text", Modifier.height(15.dp))
        Text(text = "Text", Modifier.height(15.dp))
        Text(text = "Text", Modifier.height(15.dp))
    }
}

@Composable
fun MyComplexLayout() {
    Column(Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Green),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Example 1", fontSize = 30.sp)
        }

        Row(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(20.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .background(Color.Gray)
                    .weight(1f),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Text 1", fontSize = 30.sp)
            }
            Spacer(modifier = Modifier.width(20.dp))
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .background(Color.LightGray)
                    .weight(1f),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Text 2", fontSize = 30.sp)
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Red),
            contentAlignment = Alignment.BottomCenter
        ) {
            Text(text = "Example 2", fontSize = 30.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeLayoutsTheme {
        MyStateExample()
    }
}