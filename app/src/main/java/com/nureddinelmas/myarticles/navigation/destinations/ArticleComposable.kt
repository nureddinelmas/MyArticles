package com.nureddinelmas.myarticles.navigation.destinations

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.nureddinelmas.myarticles.util.Action
import com.nureddinelmas.myarticles.util.Constants


fun NavGraphBuilder.articleComposable(
	navigateToListScreen : (Action) -> Unit
){
	composable(route = Constants.LIST_SCREEN,
	arguments = listOf(navArgument(Constants.ARTICLE_ARGUMENT_KEY){
		type = NavType.IntType
	})
	){
	
	}
}