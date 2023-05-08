package com.nureddinelmas.myarticles.data.repositories

import com.nureddinelmas.myarticles.data.ArticleDao
import com.nureddinelmas.myarticles.data.models.ArticleModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ArticleRepository @Inject constructor(private val articleDao: ArticleDao) {
	
	val getAllTask: Flow<List<ArticleModel>> = articleDao.getAllTask()
	val sortByLowPriority : Flow<List<ArticleModel>> = articleDao.sortByLowPriority()
	val sortByHighPriority : Flow<List<ArticleModel>> = articleDao.sortByHighPriority()
	
	fun getSelectedTask(articleId: Int): Flow<ArticleModel> {
		return articleDao.getSelectedArticle(articleId)
	}
	
	suspend fun addTask(articleModel: ArticleModel) {
		articleDao.addArticle(articleModel)
	}
	
	suspend fun updateTask(articleModel: ArticleModel) {
		articleDao.updateArticle(articleModel)
	}
	
	suspend fun deleteTask(articleModel: ArticleModel) {
		articleDao.deleteArticle(articleModel)
	}
	
	suspend fun deleteAllTask() {
		articleDao.deleteAllArticle()
	}
	
	suspend fun searchDatabase(searchQuery: String) : Flow<List<ArticleModel>> {
		return articleDao.searchDatabase(searchQuery)
	}
}