package com.siswa.praktikum.pariwisata.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import com.siswa.praktikum.pariwisata.repository.UserRepository

class RegisterViewModel: ViewModel() {
    fun register(context: Context, name: String, email: String, password: String) {
        //LoginRepository.insertData(context, username, password)
        UserRepository.insertData(context, name, email, password)
    }
}