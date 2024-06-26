package com.pronaycoding.blanket_mobile.nav

import androidx.compose.runtime.Composable
import androidx.media3.exoplayer.ExoPlayer
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pronaycoding.blanket_mobile.ui.about.AboutScreen
import com.pronaycoding.blanket_mobile.ui.homeScreen.CardItems
import com.pronaycoding.blanket_mobile.ui.homeScreen.Dashboard
import com.pronaycoding.blanket_mobile.ui.homeScreen.DrawerItems
//import com.pronaycoding.blanket_mobile.ui.homeScreen.MainScreen
import com.pronaycoding.blanket_mobile.ui.settings.SettingsScreen

@Composable
fun Navigation(
    cardItems: List<CardItems>,
    drawerItems: List<DrawerItems>,
    audioPlayer : ExoPlayer
) {
    val navController: NavHostController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.Home.name) {
        composable(Routes.Home.name) {
            Dashboard(cardLists = cardItems, drawerItems = drawerItems,
                navigateTo = {
                    navController.navigate(it)
                },
//                audioPlayer = audioPlayer
            )
        }

        composable(Routes.Settings.name) {
            SettingsScreen(
                onBackArrowClicked = {
                    navController.navigateUp()
                }
            )
        }

        composable(Routes.AboutUs.name){
            AboutScreen(
                onBackPressed = {
                    navController.navigateUp()
                }
            )
        }
    }

}