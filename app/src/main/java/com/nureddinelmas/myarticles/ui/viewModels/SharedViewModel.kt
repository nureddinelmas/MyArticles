package com.nureddinelmas.myarticles.ui.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nureddinelmas.myarticles.data.models.ArticleModel
import com.nureddinelmas.myarticles.data.repositories.ArticleRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

class SharedViewModel @Inject constructor(private val repository: ArticleRepository) : ViewModel(){
	
	private val _allArticles = MutableStateFlow<List<ArticleModel>>(emptyList())
	
	val allArticle : StateFlow<List<ArticleModel>> = _allArticles
	
	fun getAllTask() {
		viewModelScope.launch {
			repository.getAllArticles.collect{
				_allArticles.value = it
			}
		}
	}
}