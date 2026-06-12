package com.siswa.praktikum.pariwisata.viewmodel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.siswa.praktikum.pariwisata.model.User
import com.siswa.praktikum.pariwisata.repository.UserRepository

class LoginViewModel: ViewModel() {

    var liveDataLogin: LiveData<User>? = null

    fun getLoginDetails(context: Context, email: String, password:String) : LiveData<User>? {
        liveDataLogin = UserRepository.getLoginDetails(context, email, password)
        return liveDataLogin
    }
}