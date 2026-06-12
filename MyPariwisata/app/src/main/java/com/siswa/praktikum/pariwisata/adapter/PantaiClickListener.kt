package com.siswa.praktikum.pariwisata.adapter

import android.view.View
import com.siswa.praktikum.pariwisata.model.Pantai

interface PantaiClickListener {

    fun onPantaiClicked(view: View, p: Pantai)
}