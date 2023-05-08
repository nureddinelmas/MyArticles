package com.nureddinelmas.myarticles.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.nureddinelmas.myarticles.data.models.ArticleModel


@Database(entities = [ArticleModel::class], version = 1, exportSchema = false)
abstract class ArticleDatabase : RoomDatabase() {
	abstract fun articleDao() : ArticleDao
}