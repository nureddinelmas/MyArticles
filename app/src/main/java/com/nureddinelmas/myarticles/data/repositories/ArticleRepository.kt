package com.nureddinelmas.myarticles.data.repositories

import com.nureddinelmas.myarticles.data.ArticleDao
import com.nureddinelmas.myarticles.data.models.ArticleModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ArticleRepository @Inject constructor(private val articleDao: ArticleDao) {
	
	val getAllArticles: Flow<List<ArticleModel>> = articleDao.getAllArticles()
	val sortByLowPriority : Flow<List<ArticleModel>> = articleDao.sortByLowPriority()
	val sortByHighPriority : Flow<List<ArticleModel>> = articleDao.sortByHighPriority()
	
	fun getAllArticle(articleId: Int): Flow<ArticleModel> {
		return articleDao.getSelectedArticle(articleId)
	}
	
	suspend fun addArticle(articleModel: ArticleModel) {
		articleDao.addArticle(articleModel)
	}
	
	suspend fun updateArticle(articleModel: ArticleModel) {
		articleDao.updateArticle(articleModel)
	}
	
	suspend fun deleteArticle(articleModel: ArticleModel) {
		articleDao.deleteArticle(articleModel)
	}
	
	suspend fun deleteAllArticles() {
		articleDao.deleteAllArticle()
	}
	
	suspend fun searchDatabase(searchQuery: String) : Flow<List<ArticleModel>> {
		return articleDao.searchDatabase(searchQuery)
	}
}