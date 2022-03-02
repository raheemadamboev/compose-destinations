package xyz.teamgravity.composedestinations.presentation.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ProfileScreen(
    mail: String,
    userId: String,
    password: Long
) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "mail: $mail")
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "userId: $userId")
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "password: $password")
    }
}