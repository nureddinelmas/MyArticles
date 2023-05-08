package com.nureddinelmas.myarticles

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.nureddinelmas.myarticles.navigation.SetupNavigation
import com.nureddinelmas.myarticles.ui.theme.MyArticlesTheme
import dagger.hilt.android.AndroidEntryPoint


/*
*CONTEXT
The Readly app has various kinds of content on offer.
* The magazine is most popular among them, but the app also recommends individual articles that it thinks the user will find interesting.
* These articles are opened in a custom reader view with various features to make the reading experience more pleasant and immersive.

The TASK
We want to add a new app feature that lets users bookmark an article to easily come back to it later.
* The user should be able to see a list of all the articles that they have bookmarked and open any of them.
*  The bookmarked articles should be kept on the device and survive the app being restarted
* but do not have to be synced to other devices or survive the app being re-installed. */



@AndroidEntryPoint
class MainActivity : ComponentActivity() {
	
	private lateinit var navController : NavHostController
	override fun onCreate(savedInstanceState: Bundle?) {
		
		
		super.onCreate(savedInstanceState)
		setContent {
			MyArticlesTheme {
				navController = rememberNavController()
				SetupNavigation(navController = navController)
			}
		}
	}
}

