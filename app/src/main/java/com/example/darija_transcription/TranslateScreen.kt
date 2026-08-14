package com.example.darija_transcription

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.filled.SwapHoriz
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TranslateScreen() {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = { /* Hna ghan-zidou l-micro mn be3d */ }) {
                Icon(Icons.Default.Mic, contentDescription = "Sjjel Sawt")
            }
        },
        floatingActionButtonPosition = FabPosition.Center
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            // 1. L-blassa dyal khtiyar les langues
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("English", style = MaterialTheme.typography.titleMedium)
                Icon(Icons.Default.SwapHoriz, contentDescription = "Beddel")
                Text("Darija", style = MaterialTheme.typography.titleMedium)
            }

            Spacer(modifier = Modifier.height(32.dp))

            // 2. Texte li tsme3 (Source)
            Text("Transcription", style = MaterialTheme.typography.labelMedium)
            OutlinedTextField(
                value = "Hello, how are you doing today?", // Hardcoded text
                onValueChange = {},
                modifier = Modifier.fillMaxWidth(),
                readOnly = true
            )

            Spacer(modifier = Modifier.height(16.dp))

            // 3. Tarjama (Darija)
            Text("Tarjama", style = MaterialTheme.typography.labelMedium)
            OutlinedTextField(
                value = "Salam, labas 3lik lyouma?", // Hardcoded text
                onValueChange = {},
                modifier = Modifier.fillMaxWidth(),
                readOnly = true
            )
        }
    }
}

