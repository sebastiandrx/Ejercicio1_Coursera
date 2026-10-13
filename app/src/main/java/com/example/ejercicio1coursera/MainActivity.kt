package com.example.ejercicio1coursera

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ejercicio1coursera.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IdentidadCorporativaTheme {
                PuppyScreen()
            }
        }
    }
}

@Composable
fun PuppyScreen() {
    var mensaje by remember {
        mutableStateOf("¡Bienvenido a Puppy!")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(PrimaryColor)
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "🐶",
            fontSize = 90.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "PUPPY",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = DarkPrimaryColor
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = mensaje,
            fontSize = 22.sp,
            fontWeight = FontWeight.Medium,
            color = DarkPrimaryColor,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Cuidamos a nuestros amigos de cuatro patas",
            fontSize = 16.sp,
            color = DarkPrimaryColor,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = {
                mensaje = "¡Gracias por visitar Puppy!"
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = AccentColor,
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "COMENZAR",
                fontSize = 16.sp,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}