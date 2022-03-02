package xyz.teamgravity.composedestinations.presentation.screen

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "login"
    ) {
        composable(route = "login") {
            LoginScreen(navController = navController)
        }
        composable(
            route = "profile/{mail}/{userId}/{password}",
            arguments = listOf(
                navArgument(name = "mail") {
                    type = NavType.StringType
                },
                navArgument(name = "userId") {
                    type = NavType.StringType
                },
                navArgument(name = "password") {
                    type = NavType.LongType
                }
            )
        ) {
            val mail = it.arguments?.getString("mail")!!
            val userId = it.arguments?.getString("userId")!!
            val password = it.arguments?.getLong("password")!!

            ProfileScreen(
                navController = navController,
                mail = mail,
                userId = userId,
                password = password
            )
        }
        composable(route = "war/{war}",
            arguments = listOf(
                navArgument("war") {
                    type = NavType.BoolType
                    defaultValue = false
                }
            )) {
            val war = it.arguments?.getBoolean("war")!!

            WarScreen(war = war)
        }
    }
}