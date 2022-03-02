package xyz.teamgravity.composedestinations.presentation.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import xyz.teamgravity.composedestinations.data.model.UserModel
import xyz.teamgravity.composedestinations.presentation.screen.destinations.ProfileScreenDestination

@Destination(start = true)
@Composable
fun LoginScreen(
    navigator: DestinationsNavigator
) {
    var mail by remember { mutableStateOf("") }
    var userId by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = mail,
            onValueChange = {
                mail = it
            },
            placeholder = {
                Text(text = "mail")
            }
        )
        Spacer(modifier = Modifier.height(16.dp))
        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = userId,
            onValueChange = {
                userId = it
            },
            placeholder = {
                Text(text = "userId")
            }
        )
        Spacer(modifier = Modifier.height(16.dp))
        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = password,
            onValueChange = {
                password = it
            },
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.NumberPassword),
            placeholder = {
                Text(text = "password")
            }
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                navigator.navigate(
                    direction = ProfileScreenDestination(
                        user = UserModel(
                            mail = mail,
                            userId = userId,
                            password = password.toLong()
                        )
                    )
                )
            }
        ) {
            Text(text = "Login")
        }
    }
}