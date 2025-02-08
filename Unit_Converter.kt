package com.example.unitconverter

import android.os.Bundle
import androidx.compose.ui.Alignment
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.unitconverter.ui.theme.UnitConverterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UnitConverterTheme {
                //A Surface Container using the backGround color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                )
                { UnitConverter() }
            }
        }
    }
}
@Composable
fun UnitConverter() {
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text("Unit Converter")
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = "", onValueChange = {
            //here goes what should happen, the value of our OutlinedTextField changes
        })
        Spacer(modifier = Modifier.height(16.dp))
        Row {
            Box {
                Button(onClick = {/*TODO*/ }) {

                    Text("Select")
                    Icon(
                        Icons.Default.ArrowDropDown,
                        contentDescription = "Arrow Down"
                    )
                }
              DropdownMenu(expanded = true, onDismissRequest = {}) {
                  DropdownMenuItem(text = {Text("Centimeter")}, onClick = {
                      /*TODO*/
                  })
                  DropdownMenuItem(text = {Text("Meters")}, onClick = {
                      /*TODO*/
                  })
                  DropdownMenuItem(text = {Text("Feet")}, onClick = {
                      /*TODO*/
                  })
                  DropdownMenuItem(text = {Text("Milimeters")}, onClick = {
                      /*TODO*/
                  })
              }
            }
            Spacer(modifier = Modifier.width(16.dp))
            Box {
                Button(onClick = {/*TODO*/ }) {
                    Text("Select")
                    Icon(
                        Icons.Default.ArrowDropDown,
                        contentDescription = "Arrow Down"
                    )
                }
                DropdownMenu(expanded = true, onDismissRequest = {}) {
                    DropdownMenuItem(text = {Text("Centimeter")}, onClick = {
                        /*TODO*/
                    })
                    DropdownMenuItem(text = {Text("Meters")}, onClick = {
                        /*TODO*/
                    })
                    DropdownMenuItem(text = {Text("Feet")}, onClick = {
                        /*TODO*/
                    })
                    DropdownMenuItem(text = {Text("Milimeters")}, onClick = {
                        /*TODO*/
                    })
                }
            }

        }
        Spacer(modifier = Modifier.height(16.dp))
        Text("Result: ")
    }
}


@Preview(showBackground = true)
@Composable
fun UnitConverterPreview() {
    UnitConverter()
}
