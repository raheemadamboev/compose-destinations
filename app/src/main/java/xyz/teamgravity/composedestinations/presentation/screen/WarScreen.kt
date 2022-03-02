package xyz.teamgravity.composedestinations.presentation.screen

import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun WarScreen(
    war: Boolean
) {
    Text(text = "War: $war")
}