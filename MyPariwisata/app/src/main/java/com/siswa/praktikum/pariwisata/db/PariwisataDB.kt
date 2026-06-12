package com.siswa.praktikum.pariwisata.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.siswa.praktikum.pariwisata.model.User

@Database(entities = arrayOf(User::class), version = 1, exportSchema = false)
abstract class PariwisataDB: RoomDatabase() {

    abstract fun dao(): DAOAccess

    companion object {

        @Volatile
        private var INSTANCE: PariwisataDB? = null

        fun getClient(context: Context) : PariwisataDB {

            if (INSTANCE != null) return INSTANCE!!

            synchronized(this) {

                INSTANCE = Room
                    .databaseBuilder(context, PariwisataDB::class.java, "PARIWISATA_DB")
                    .fallbackToDestructiveMigration()
                    .build()

                return INSTANCE!!

            }
        }
    }
}