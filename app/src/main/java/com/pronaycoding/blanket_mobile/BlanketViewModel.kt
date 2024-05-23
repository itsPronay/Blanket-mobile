package com.pronaycoding.blanket_mobile

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.lifecycle.ViewModel


//@HiltViewModel
class BlanketViewModel(
//    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

//    var setMusicValue by savedStateHandle.saveable { mutableStateOf(true) }

    fun getDrawerItems(): List<DrawerItems> {
        return listOf(
            DrawerItems.Home,
            DrawerItems.SourceCode,
            DrawerItems.RequestFeature,
            DrawerItems.About,
            DrawerItems.Settings,
            DrawerItems.Quit,
        )
    }

    fun getCardList(): List<CardItems> {
        return listOf(
            CardItems.Rain,
            CardItems.Wind,
            CardItems.Storm,
            CardItems.Wave,
            CardItems.Stream,
            CardItems.Birds,
            CardItems.SummerNight,

            CardItems.Train,
            CardItems.Boat,
            CardItems.City,

            CardItems.CoffeeShop,
            CardItems.FirePlace,
            CardItems.BusyRestaurant,

            CardItems.PinkNoise,
            CardItems.WhiteNoise,

            CardItems.Custom
        )
    }

}

sealed class CardItems(
    var title: String,
    var icon: Int,
    val audioSource: Int,
    val type: String = "",
    val firstInType: Boolean = false
) {
    /*
     * Nature
     */
    data object Rain : CardItems(
        title = "Rain",
        icon = R.drawable.rain,
        audioSource = R.raw.nature_rain,
        type = "Nature",
        firstInType = true
    )

    data object SummerNight : CardItems(
        title = "Summer night",
        icon = R.drawable.moon,
        audioSource = R.raw.nature_summernight,
        type = "Nature"
    )

    data object Wind : CardItems(
        title = "Wind",
        icon = R.drawable.wind,
        audioSource = R.raw.nature_wind,
        type = "Nature"
    )

    data object Wave : CardItems(
        title = "Waves",
        icon = R.drawable.wave,
        audioSource = R.raw.nature_waves,
        type = "Nature"
    )

    data object Stream : CardItems(
        title = "Stream",
        icon = R.drawable.stream,
        audioSource = R.raw.nature_stream,
        type = "Nature"
    )

    data object Storm : CardItems(
        title = "Storm",
        icon = R.drawable.storm,
        audioSource = R.raw.nature_storm,
        type = "Nature"
    )

    data object Birds : CardItems(
        title = "Birds",
        icon = R.drawable.birds,
        audioSource = R.raw.nature_birds,
        type = "Nature"
    )

    /*
    Travel
     */

    data object Train : CardItems(
        title = "Train",
        icon = R.drawable.train,
        audioSource = R.raw.travel_train,
        type = "Travel",
        firstInType = true
    )

    data object Boat : CardItems(
        title = "Boat",
        icon = R.drawable.sailboat,
        audioSource = R.raw.boat,
        type = "Travel"
    )

    data object City : CardItems(
        title = "City",
        icon = R.drawable.city,
        audioSource = R.raw.travel_city,
        type = "Travel"
    )


    /*
    Interiors
     */
    data object CoffeeShop : CardItems(
        title = "Coffee Shop",
        icon = R.drawable.coffee,
        audioSource = R.raw.interior_coffeeshop,
        type = "Interiors",
        firstInType = true
    )

    data object FirePlace : CardItems(
        title = "Fireplace",
        icon = R.drawable.fireplace,
        audioSource = R.raw.interior_fireplace,
        type = "Interiors"
    )

    data object BusyRestaurant : CardItems(
        title = "Busy Restaurant",
        icon = R.drawable.food_delivery,
        audioSource = R.raw.busy_restaurant,
        type = "Interiors"
    )


    /*
    Noise
     */
    data object PinkNoise : CardItems(
        title = "Pink Noise",
        icon = R.drawable.pink_noise,
        audioSource = R.raw.noise_pink_noise,
        type = "Noise",
        firstInType = true
    )

    data object WhiteNoise : CardItems(
        title = "White Noise",
        icon = R.drawable.white_noise,
        audioSource = R.raw.noise_white_noise,
        type = "Noise"
    )

    /*
    custom
     */
    data object Custom : CardItems(
        title = "",
        icon = R.drawable.white_noise,
        audioSource = R.raw.noise_white_noise,
        type = "Custom"
    )
}


sealed class DrawerItems(
    val title: String,
    val icon: ImageVector
) {
    data object Home : DrawerItems(
        title = "Home",
        icon = Icons.Default.Home
    )

    data object SourceCode : DrawerItems(
        title = "Source code",
        icon = Icons.Filled.Build
    )

    data object About : DrawerItems(
        title = "About",
        icon = Icons.Default.Info
    )

    data object RequestFeature : DrawerItems(
        title = "Request feature",
        icon = Icons.Default.MailOutline
    )

    data object Quit : DrawerItems(
        title = "Quit",
        icon = Icons.Default.ExitToApp
    )

    data object Settings : DrawerItems(
        title = "Settings",
        icon = Icons.Default.Settings
    )


}