package com.example.ch4.db_orm

import androidx.room.PrimaryKey
import java.util.UUID

data class Makanan (
    @PrimaryKey val id: String? = UUID.randomUUID().toString(),
    val position: Int,
    val name: String?,
    val price: String?,
    val imgUrl: String?,
    val desc: String?
)