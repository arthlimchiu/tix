package com.arthlimchiu.core.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.arthlimchiu.core.local.movies.dao.MovieDao
import com.arthlimchiu.core.local.movies.entity.MovieEntity

@Database(entities = [MovieEntity::class], version = 1, exportSchema = false)
abstract class TixDatabase : RoomDatabase() {

    abstract fun movieDao(): MovieDao

    companion object {
        @Volatile private var instance: TixDatabase? = null

        fun getInstance(context: Context): TixDatabase {
            return instance ?: synchronized(this) {
                instance ?: buildDatabase(context).also { instance = it }
            }
        }

        private fun buildDatabase(context: Context): TixDatabase {
            return Room
                .databaseBuilder(context, TixDatabase::class.java, "tix-db")
                .fallbackToDestructiveMigration() // Don't use this for production and instead use migrations
                .build()
        }
    }
}