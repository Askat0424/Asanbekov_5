package com.example.asanbekov_5.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.asanbekov_5.remote.LoveModel


@Database(entities = [LoveModel::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun loveDao(): LoveDao

}