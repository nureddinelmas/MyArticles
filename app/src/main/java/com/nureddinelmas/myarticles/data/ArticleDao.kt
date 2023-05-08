package com.nureddinelmas.myarticles.data

import androidx.room.*
import com.nureddinelmas.myarticles.data.models.ArticleModel
import kotlinx.coroutines.flow.Flow

@Dao
interface ArticleDao {
	
	@Query("SELECT * FROM todo_table ORDER BY 'id' ASC")
	fun getAllTask(): Flow<List<ArticleModel>>
	
	
	@Query("SELECT * FROM todo_table WHERE id=:taskId")
	fun getSelectedArticle(articleId: Int) : Flow<ArticleModel>
	
	@Insert(onConflict = OnConflictStrategy.IGNORE)
	suspend fun addArticle(articleModel: ArticleModel)
	
	
	@Update
	suspend fun updateArticle(articleModel: ArticleModel)
	
	@Delete
	suspend fun deleteArticle(articleModel: ArticleModel)
	
	@Query("DELETE FROM todo_table")
	suspend fun deleteAllArticle()
	
	@Query("SELECT * FROM todo_table WHERE title LIKE :searchQuery OR description LIKE :searchQuery")
	fun searchDatabase(searchQuery: String): Flow<List<ArticleModel>>
	
	
	@Query("SELECT * FROM todo_table ORDER BY CASE WHEN priority LIKE 'L%' THEN 1 WHEN priority LIKE 'M%' THEN 2 WHEN priority LIKE 'H%' THEN 3 END" )
	fun sortByLowPriority(): Flow<List<ArticleModel>>
	
	@Query("SELECT * FROM todo_table ORDER BY CASE WHEN priority LIKE 'H%' THEN 1 WHEN priority LIKE 'M%' THEN 2 WHEN priority LIKE 'L%' THEN 3 END" )
	fun sortByHighPriority(): Flow<List<ArticleModel>>
}