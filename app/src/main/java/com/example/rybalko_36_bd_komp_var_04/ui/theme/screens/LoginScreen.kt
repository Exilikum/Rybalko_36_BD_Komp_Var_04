package com.example.rybalko_36_bd_komp_var_04.ui.theme.screens

import androidx.compose.foundation.Image
import com.example.rybalko_36_bd_komp_var_04.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.layout.ContentScale
import androidx.compose.foundation.BorderStroke
import androidx.compose.material3.HorizontalDivider // Новий Divider

// Додайте змінну DividerGray (або використайте з теми)
val DividerGray = Color(0xFFDADADA)

@Composable
fun LoginScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        // 1. Фон-зображення
        Image(
            painter = painterResource(id = R.drawable.forest_bridge),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.matchParentSize()
        )

        // 2. Напівпрозорий оверлей
        Box(
            modifier = Modifier
                .matchParentSize()
                .background(Color.Black.copy(alpha = .45f))
        )

        // 3. Форма авторизації
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .padding(16.dp)
        ) {
            Text(
                text = "Log In",
                style = MaterialTheme.typography.headlineMedium,
                color = Color.White,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            OutlinedTextField(
                value = "",
                onValueChange = { },
                placeholder = { Text("Email") },
                singleLine = true,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White, RoundedCornerShape(4.dp))
            )

            Spacer(Modifier.height(8.dp))

            OutlinedTextField(
                value = "",
                onValueChange = { },
                placeholder = { Text("Password") },
                singleLine = true,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White, RoundedCornerShape(4.dp)),
                visualTransformation = PasswordVisualTransformation()
            )

            Spacer(Modifier.height(12.dp))

            // Кнопка Log In
            Button(
                onClick = { /* TODO */ },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary) // Замість PurpleButton
            ) { Text("LOG IN") }

            // Роздільник OR
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(vertical = 12.dp)
            ) {
                HorizontalDivider(Modifier.weight(1f), color = DividerGray)
                Text("  OR  ", color = Color.White)
                HorizontalDivider(Modifier.weight(1f), color = DividerGray)
            }

            OutlinedButton(
                onClick = { /* TODO */ },
                modifier = Modifier.fillMaxWidth(),
                border = BorderStroke(1.dp, Color.White),
                colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.White)
            ) { Text("SIGN UP") }

            Spacer(Modifier.height(16.dp))
        }
    }
}
