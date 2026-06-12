package com.siswa.praktikum.pariwisata.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pixplicity.easyprefs.library.Prefs
import com.siswa.praktikum.pariwisata.R
import com.siswa.praktikum.pariwisata.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    lateinit var uiBinding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        uiBinding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(uiBinding.root)

        uiBinding.tvNama.setText(Prefs.getString("NAMA"))
        uiBinding.tvEmail.setText(Prefs.getString("EMAIL"))

        uiBinding.btnBack.setOnClickListener {
            finish();
        }
    }
}