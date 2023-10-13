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

}


val db = RoomDatabaseBuilder(
    DEFAULT_BUFFER_SIZE,
    AppDatabase::class.java, "my-database"
)

fun RoomDatabaseBuilder(applcationContext: Any, java: Class<AppDatabase>, s: String): Any {
    TODO("Not yet implemented")
}
