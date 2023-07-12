package com.vaibhavmojidra.androidjetpackcomposedemostaterememberusingpropertydelegates

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.sp
import com.vaibhavmojidra.androidjetpackcomposedemostaterememberusingpropertydelegates.ui.theme.AndroidJetpackComposeDemoStateRememberUsingPropertyDelegatesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidJetpackComposeDemoStateRememberUsingPropertyDelegatesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    stateDemoWithDelegates()
                }
            }
        }
    }
}

@Composable
fun stateDemoWithDelegates(){
    val contxt= LocalContext.current
    var count by remember { mutableStateOf(0) }

    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = {
            count++
            Toast.makeText(contxt,"Count updated to $count",Toast.LENGTH_LONG).show()
        }) {
            Text(text = "Count is $count", fontSize = 26.sp)
            
        }
    }
}
