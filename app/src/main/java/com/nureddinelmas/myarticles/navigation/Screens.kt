package com.nureddinelmas.myarticles.navigation

import androidx.navigation.NavController
import com.nureddinelmas.myarticles.util.Action
import com.nureddinelmas.myarticles.util.Constants.LIST_SCREEN

class Screens(navController: NavController) {
	val list : (Action) -> Unit = { action ->
		navController.navigate("list/${action.name}"){
			popUpTo(LIST_SCREEN){
				inclusive = true
			}
		}
		
	}
	
	
	val article : (Int) -> Unit = { articleId ->
		navController.navigate("article/$articleId")
	}
}