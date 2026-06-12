package com.siswa.praktikum.pariwisata.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.siswa.praktikum.pariwisata.model.User

@Dao
interface DAOAccess {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun register(newUser: User)

    @Query("SELECT * FROM tbl_user WHERE email =:email AND password =:password")
    fun getLoginDetails(email: String?, password: String?): LiveData<User>
}