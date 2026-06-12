package com.siswa.praktikum.pariwisata.repository

import com.siswa.praktikum.pariwisata.R
import com.siswa.praktikum.pariwisata.model.Pantai

class PantaiRepository {

    companion object {
        private lateinit var listPantai: ArrayList<Pantai>

        fun getPantaiList() : ArrayList<Pantai> {
            listPantai = ArrayList<Pantai>()

            listPantai.add(Pantai(R.drawable.batu_hiu,"Batu Hiu","Pantai Batu Hiu adalah destinasi wisata alam yang menawarkan keindahan laut lepas Samudera Hindia dari bukit karang. Pantai Batu Hiu kerap disebut sebagai Tanah Lot-nya Jawa Barat karena memiliki batu karang yang menjorok ke tengah laut seperti halnya Tanah Lot di Pulau Bali. Selain itu, terdapat sebuah batu karang di tengah laut yang bentuknya menyerupai ikan hiu. Dari sinilah istilah nama Pantai Batu Hiu berasal.",-7.6984, -108.5176))
            listPantai.add(Pantai(R.drawable.batu_karas, "Batu Karas","Berjarak 33 Km dari Pangandaran, Pantai Batukaras dapat ditempuh selama sekitar 50 menit menggunakan kendaraan pribadi. Fasilitas pendukung yang ada di Pantai Batukaras diantaranya adalah tempat parkir, mushola, kamar mandi, warung makanan minuman, restaurant seafood, penginapan, penyewaan papan selancar dan ban renang serta sarana permainan banana boat.",-7.7377, -108.4976))
            listPantai.add(Pantai(R.drawable.pangandaran,"Pangandaran","Pantai Pangandaran memiliki bentangan pantai yang cukup luas. Pantai ini telah menjadi objek wisata Pangandaran sejak tahun 2012. Pangandaran merupakan bagian dari selatan Pulau Jawa yang terkenal karena ombak besarnya. Namun pantainya landai dengan rentang waktu antara pasang lautnya yang relatif lama.",-7.6876, -108.6387))
            listPantai.add(Pantai(R.drawable.santolo,"Santolo","Pantai Santolo berada di daerah Kecamatan Cikelet, Garut, Jawa Barat. Untuk sampai kesini dari pusat Kota Garut memerlukan waktu sekitar 3,5 jam. Jalanan menuju pantai ini tidak begitu bagus, karena banyak jalan berlubang dan cukup sempit.",-7.6501, -107.6876))
            listPantai.add(Pantai(R.drawable.karang_hawu,"Karang Hawu","Pantai ini di sebut Karang Hawu, karena di areal pantai ini ada sebuah karang yang menjorok ke laut dan memiliki lubang di beberapa bagiannya yang berbentuk menyerupai tungku (atau hawu dalam bahasa sunda). Karena itu, pantai ini kemudian dinamakan Pantai Karang Hawu",-6.9572, -106.4657))
            listPantai.add(Pantai(R.drawable.karang_tawulan,"Karang Tawulan","Pantai Karang Tawulan merupakan salah satu rekomendasi tujuan wisata bahari di Tasikmalaya. Pantai ini berlokasi di kawasan Cimanuk, Kalapagenep, Cikalong, Tasikmalaya, Jawa Barat. Letak pantai ini cukup strategis. Pasalnya, Pantai Karang Tawulan bisa diakses dari dua kabupaten sekaligus.",-7.8134, -108.2998))
            listPantai.add(Pantai(R.drawable.pasir_putih,"Pasir Putih","Pantai Pasir Putih menawarkan keindahan eksotis di sisi barat Cagar Alam Penanjung. Kawasan ini memiliki pasir putih, berbeda dengan pantai lain di Pangandaran yang berwarna kecokelatan. Daya tarik utama Pantai Pasir Putih adalah nuansa alami yang masih terjaga dengan baik karena berada di kawasan konservasi.",-7.42,-108.39))
            listPantai.add(Pantai(R.drawable.ranca_buaya,"Ranca Buaya","Pantai Rancabuaya merupakan pantai yang memiliki karakteritik batu karang dan berbatasan langsung dengan laut Samudera Hindia. Sehingga, pantai memiliki ombak yang besar. Kawasan pantai semakin menarik dengan adanya ikan-ikan kecil yang bersembunyi dibalik karang.",-7.5295, -107.4801))
            listPantai.add(Pantai(R.drawable.timur_pangandaran,"Timur Pangandaran","Pantai yang merupakan primadona di Jawa Barat ini terletak di Desa Pananjung Kecamatan Pangandaran dengan jarak sekitar 92 km arah selatan kota Ciamis, memiliki berbagai keistimewaan seperti:\n" +
                    "dapat melihat terbit dan tenggelamnya matahari dari satu tempat yang sama, pantainya landai dengan air yang jernih serta jarak antara pasang dan surut relatif lama sehingga memungkinkan kita untuk berenang dengan aman.",-7.7023, -108.6583))
            listPantai.add(Pantai(R.drawable.ujung_genteng,"Ujung Genteng","Sebutan ini diambil dari lokasinya yang berada di ujung pulau dan menyerupai gunting. Pada awalnya, Pantai Ujung Genteng bukanlah sebuah desa melainkan daerah atau tempat rekreasi pantai.\n" +
                    "Karena ada pemecahan, akhirnya tempat ini berubah menjadi desa.",-7.3614, -106.4020))

            return listPantai
        }
    }

}