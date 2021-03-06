package xyz.teamgravity.composedestinations.presentation.screen

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.ramcosta.composedestinations.annotation.Destination

@Destination
@Composable
fun WarScreen(
    war: Boolean
) {
    Text(text = "War: $war")
}