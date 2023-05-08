package com.nureddinelmas.myarticles.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.nureddinelmas.myarticles.navigation.destinations.articleComposable
import com.nureddinelmas.myarticles.navigation.destinations.listComposable
import com.nureddinelmas.myarticles.util.Constants.LIST_SCREEN


@Composable
fun SetupNavigation(navController: NavHostController){
	val screen = remember(navController){
		Screens(navController)
	}
	
	NavHost(navController = navController, startDestination = LIST_SCREEN){
		listComposable(
			navigateToArticleScreen = screen.article
		)
		
		articleComposable(
			navigateToListScreen = screen.list
		)
	}
}