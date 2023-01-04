package com.niqr.firebasechat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.niqr.auth.ui.AuthScreen
import com.niqr.core_ui.theme.FirebaseChatTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirebaseChatTheme {
                // A surface container using the 'background' color from the theme
                AuthScreen()
            }
        }
    }
}