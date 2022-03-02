package xyz.teamgravity.composedestinations.presentation.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.ramcosta.composedestinations.annotation.Destination

@Destination
@Composable
fun ProfileScreen(
    navController: NavController,
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
        Spacer(modifier = Modifier.height(10.dp))
        Row(modifier = Modifier.fillMaxWidth()) {
            Button(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 10.dp),
                onClick = {
                    navController.navigate("war/${true}")
                }
            ) {
                Text(text = "I want war!")
            }
            Button(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 10.dp),
                onClick = {
                    navController.navigate("war/${false}")
                }
            ) {
                Text(text = "I want peace!")
            }
        }
    }
}