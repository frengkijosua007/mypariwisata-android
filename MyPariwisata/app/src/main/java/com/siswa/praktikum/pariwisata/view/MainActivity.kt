package com.siswa.praktikum.pariwisata.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.GridLayoutManager
import com.siswa.praktikum.pariwisata.R
import com.siswa.praktikum.pariwisata.adapter.PantaiAdapter
import com.siswa.praktikum.pariwisata.adapter.PantaiClickListener
import com.siswa.praktikum.pariwisata.databinding.ActivityMainBinding
import com.siswa.praktikum.pariwisata.model.Pantai
import com.siswa.praktikum.pariwisata.repository.PantaiRepository

class MainActivity : AppCompatActivity(), PantaiClickListener {

    lateinit var uiBinding: ActivityMainBinding
    lateinit var listPantai: ArrayList<Pantai>
    lateinit var pantaiAdapter: PantaiAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        uiBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(uiBinding.root)

        listPantai = PantaiRepository.getPantaiList()

        pantaiAdapter = PantaiAdapter(listPantai)
        pantaiAdapter.clickListener = this
        val glm = GridLayoutManager(this@MainActivity, 2)

        uiBinding.rvPantai.layoutManager = glm
        uiBinding.rvPantai.adapter = pantaiAdapter

        uiBinding.sv.setOnQueryTextListener(object : SearchView.OnQueryTextListener,
            android.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(what: String): Boolean {
                pantaiAdapter.filter.filter(what)
                return false
            }
        })

        uiBinding.bottomNav.setOnNavigationItemReselectedListener {
            when (it.itemId){
                R.id.mnuInfo -> {
                    showInfo()
                }
            }
            true
        }
    }

    override fun onPantaiClicked(view: View, p: Pantai) {
        val detailIntent = Intent(this@MainActivity, DetailPantaiActivity::class.java)
        detailIntent.putExtra("NAMA", p.nama)
        detailIntent.putExtra("DESKRIPSI", p.deskripsi)
        detailIntent.putExtra("GAMBAR", p.gambar)
        detailIntent.putExtra("LAT", p.lat)
        detailIntent.putExtra("LON", p.lon)
        startActivity(detailIntent)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.mnuInfo -> {
                showInfo()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    fun showInfo(){
        val aboutIntent = Intent(this@MainActivity, AboutActivity::class.java)
        startActivity(aboutIntent)
    }
}