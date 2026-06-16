# MyPariwisata – Android Tourism App

## Indonesian Version

MyPariwisata adalah aplikasi Android berbasis Kotlin yang menampilkan katalog destinasi wisata pantai. Project ini dibuat untuk menunjukkan kemampuan pengembangan Android native menggunakan XML layout, local database, dan arsitektur sederhana berbasis MVVM ringan.

## Fitur Utama
- Login dan registrasi pengguna menggunakan Room Database
- Daftar destinasi wisata pantai
- Search dan filter destinasi
- Halaman detail destinasi wisata
- Navigasi lokasi menggunakan Google Maps melalui Intent eksternal
- Halaman profil sederhana menggunakan local preferences

## Tech Stack
- Kotlin
- Android XML Layout
- ViewBinding
- Room Database
- RecyclerView
- ViewModel
- Repository Pattern sederhana
- Kotlin Coroutines
- Material Design Components
- GitHub Actions

## Cara Build Project
### Build Lokal
```bash
./gradlew clean assembleDebug
```

### Build via GitHub Actions
Project ini dapat dibuild otomatis menggunakan GitHub Actions dan Android Studio.

## Output Build
- APK tersedia melalui GitHub Actions artifact
- APK demo dapat diunggah ke GitHub Release
- Tidak membutuhkan backend server

## Catatan
- Tidak menggunakan Firebase atau backend API
- Semua data destinasi disimpan secara lokal/static
- Data user disimpan menggunakan Room Database
- Login hanya simulasi autentikasi lokal
- Project ini dibuat untuk kebutuhan portfolio

---

## English Version

MyPariwisata is a Kotlin-based Android application that displays a catalog of beach tourism destinations. This project is developed to demonstrate native Android development skills using XML layouts, local database, and a lightweight MVVM architecture approach.

## Key Features
- User login and registration using Room Database
- Beach tourism destination listing
- Search and filter functionality
- Destination detail page
- External navigation using Google Maps Intent
- Simple user profile using local preferences

## Tech Stack
- Kotlin
- Android XML Layout
- ViewBinding
- Room Database
- RecyclerView
- ViewModel
- Simple Repository Pattern
- Kotlin Coroutines
- Material Design Components
- GitHub Actions

## How to Build
### Local Build
```bash
./gradlew clean assembleDebug
```

### GitHub Actions Build
This project can be built automatically using GitHub Actions and Android Studio.

## Build Output
- APK available through GitHub Actions artifact
- Demo APK can be uploaded to GitHub Release
- No backend server required

## Notes
- No Firebase or external backend API is used
- Destination data is stored locally/static
- User data is stored using Room Database
- Authentication is a local simulation only
- This project is intended for portfolio purposes
