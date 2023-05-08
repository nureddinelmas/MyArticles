package com.nureddinelmas.myarticles.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.nureddinelmas.myarticles.util.Constants.DATABASE_TABLE


@Entity(tableName = DATABASE_TABLE)
data class ArticleModel(
	@PrimaryKey(autoGenerate = true)
	                   val id: Int = 0,
                       val title: String,
                       val description: String,
                       val priority: Priority
){

}
