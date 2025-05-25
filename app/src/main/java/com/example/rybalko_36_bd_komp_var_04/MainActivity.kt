package com.example.rybalko_36_bd_komp_var_04
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface

import com.example.rybalko_36_bd_komp_var_04.ui.theme.screens.LoginScreen
import com.example.rybalko_36_bd_komp_var_04.ui.theme.Rybalko36BDKompVar04Theme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            /* Використовую кастомну тему, що згенерував шаблон */
            Rybalko36BDKompVar04Theme {
                /* Surface синхронізує фон із темою (light/dark) */
                Surface(color = MaterialTheme.colorScheme.background) {
                    /* Показую екран логіну */
                    LoginScreen()
                }
            }
        }
    }
}
