package com.example.ch4.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.ch4.data.dao.CartDao
import com.example.ch4.data.dao.CartEntity

@Database(
    entities = [CartEntity::class],
    version = 3,
    exportSchema = true
)
abstract class AppDatabase : RoomDatabase(){
    abstract fun cartDao(): CartDao
    companion object{
        private const val DB_NAME = "FooodApp.db"

        @Volatile
        private var INSTANCE: AppDatabase? = null
        fun getInstance(context: Context): AppDatabase{
            return (INSTANCE ?: synchronized(this){

                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    DB_NAME
                )
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                instance

            }) as AppDatabase
        }
    }
}