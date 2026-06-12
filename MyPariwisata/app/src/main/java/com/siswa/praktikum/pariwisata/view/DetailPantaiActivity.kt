package com.siswa.praktikum.pariwisata.view

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.siswa.praktikum.pariwisata.databinding.ActivityDetailPantaiBinding


class DetailPantaiActivity : AppCompatActivity() {

    lateinit var uiBinding: ActivityDetailPantaiBinding
    var LAT: Double = 0.0
    var LON: Double = 0.0
    var NAMA: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        uiBinding = ActivityDetailPantaiBinding.inflate(layoutInflater)
        setContentView(uiBinding.root)

        LAT = intent.getDoubleExtra("LAT", 0.0)
        LON = intent.getDoubleExtra("LON", 0.0)
        NAMA = intent.getStringExtra("NAMA").toString()

        uiBinding.tvNamaPantai.setText(NAMA)
        uiBinding.tvDeskripsiPantai.setText(intent.getStringExtra("DESKRIPSI"))
        uiBinding.imgPantai.setImageResource(intent.getIntExtra("GAMBAR", 0))


        uiBinding.btnPeta.setOnClickListener {
            val geoUri = "http://maps.google.com/maps?q=loc:${LAT},${LON} (${NAMA})"
            val mapIntent = Intent(Intent.ACTION_VIEW, Uri.parse(geoUri))
            startActivity(mapIntent)
        }

    }
}