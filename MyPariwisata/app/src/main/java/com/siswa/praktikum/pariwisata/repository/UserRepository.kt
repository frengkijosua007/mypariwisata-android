package com.siswa.praktikum.pariwisata.repository

import android.content.Context
import com.siswa.praktikum.pariwisata.db.PariwisataDB
import com.siswa.praktikum.pariwisata.model.User
import androidx.lifecycle.LiveData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

class UserRepository {
    companion object {

        var db: PariwisataDB? = null

        var userModel: LiveData<User>? = null

        fun initDB(context: Context) : PariwisataDB {
            return PariwisataDB.getClient(context)
        }

        fun insertData(context: Context, name: String, email: String, password: String) {
            db = initDB(context)

            CoroutineScope(IO).launch {
                val newUser = User(0, name, email, password)
                db!!.dao().register(newUser)
            }
        }

        fun getLoginDetails(context: Context, email: String, password: String) : LiveData<User>? {
            db = initDB(context)
            userModel = db!!.dao().getLoginDetails(email, password)

            return userModel
        }
    }
}