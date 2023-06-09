package com.nureddinelmas.myarticles.ui.screens.list

import android.annotation.SuppressLint
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.nureddinelmas.myarticles.R


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ListScreen(
	navigateToArticleScreen: (Int) -> Unit
){

Scaffold(
	content = {},
	floatingActionButton = {
	ListFab(onFabClicked = navigateToArticleScreen)
	}
)

}

@Composable
fun ListFab(
	onFabClicked: (Int) -> Unit
){
	FloatingActionButton(
		onClick = {
		onFabClicked(-1)
		}) {
		Icon(
			imageVector = Icons.Filled.Add,
			contentDescription = stringResource(id = R.string.add_button),
		tint = Color.White
		)
	}
}

@Composable
@Preview
private fun ListScreenPreview(){
	ListScreen(navigateToArticleScreen = {})
}