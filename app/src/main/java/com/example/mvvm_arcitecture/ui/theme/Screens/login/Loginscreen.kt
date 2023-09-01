package com.example.mvvm_arcitecture.ui.theme.Screens.login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.mvvm_arcitecture.navigation.ROUT_REGISTER

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Loginscreen(navController: NavController){
    var email by remember{ mutableStateOf(TextFieldValue(""))    }
    var pass by remember{ mutableStateOf(TextFieldValue(""))    }
    Column (modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "Login Here",
            color = Color.Black,
            fontFamily = FontFamily.Monospace,
            fontSize = 20.sp
        )
        OutlinedTextField(value = email, onValueChange = {email =it} )
        OutlinedTextField(value = pass, onValueChange = {pass =it} )
        Button(onClick = {
        },
            colors =ButtonDefaults.buttonColors(Color.Cyan),
            shape = CircleShape
        ){
        Text(text = "Login",
            fontSize = 28.sp,
            fontFamily = FontFamily.Monospace)
        }
        Button(onClick = {
            navController.navigate(ROUT_REGISTER)
        },
            colors = ButtonDefaults.buttonColors(Color.Black),
            shape = CircleShape) {
            Text(text = "No account ? Register Here",
                fontSize = 28.sp,
            fontFamily=FontFamily.Serif)
        }
    }
}
