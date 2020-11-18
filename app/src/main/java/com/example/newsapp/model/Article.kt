package com.example.newsapp.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

//A table in our database
@Entity(
    tableName = "articles"

)
data class Article(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    val author: String,
    val content: String,
    val description: String,
    val publishedAt: String,

    //Room can only understand primitive classes, so we need to tell ROOM how to convert this type
    val source: Source,
    val title: String,
    val url: String,
    val urlToImage: String

) : Serializable