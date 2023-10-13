package com.example.ch4.db_orm

import androidx.room.Insert
import androidx.room.Query
import androidx.room.RoomDatabase



abstract class AppDatabase : RoomDatabase() {
    abstract fun makananDAO(): Makanan
}

interface makananDAO{
    @Insert
    suspend fun insertUser(makanan: Makanan)

    @Query("SELECT * FROM Makanan WHERE id = :id")
    suspend fun getMakananById(id: String): Makanan
}


val db = RoomDatabaseBuilder(
    applcationContext,
    AppDatabase::class.java, "my-database"
).build()

fun RoomDatabaseBuilder(applcationContext: Any, java: Class<AppDatabase>, s: String): Any {
    TODO("Not yet implemented")
}

val makanan = Makanan(detailMenu)