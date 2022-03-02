package xyz.teamgravity.composedestinations.presentation.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import xyz.teamgravity.composedestinations.data.model.UserModel
import xyz.teamgravity.composedestinations.presentation.screen.destinations.WarScreenDestination

@Destination
@Composable
fun ProfileScreen(
    navigator: DestinationsNavigator,
    user: UserModel
) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "mail: ${user.mail}")
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "userId: ${user.userId}")
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "password: ${user.password}")
        Spacer(modifier = Modifier.height(10.dp))
        Row(modifier = Modifier.fillMaxWidth()) {
            Button(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 10.dp),
                onClick = {
                    navigator.navigate(WarScreenDestination(war = true))
                }
            ) {
                Text(text = "I want war!")
            }
            Button(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 10.dp),
                onClick = {
                    navigator.navigate(WarScreenDestination(war = false))
                }
            ) {
                Text(text = "I want peace!")
            }
        }
    }
}