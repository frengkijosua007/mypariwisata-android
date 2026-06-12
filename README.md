# MyPariwisata – Android Tourism App

## Indonesian Version

MyPariwisata adalah aplikasi Android berbasis Kotlin yang menampilkan katalog destinasi wisata pantai. Project ini dibuat sebagai portfolio untuk menunjukkan kemampuan pengembangan Android native menggunakan XML layout, local database, dan arsitektur sederhana berbasis MVVM ringan.

---

## Features

- User Login & Registration menggunakan Room Database (local authentication)
- Daftar destinasi wisata pantai
- Search & filter destinasi
- Detail destinasi wisata
- Navigasi lokasi menggunakan Google Maps (external Intent)
- Profil pengguna sederhana menggunakan Shared Preferences

---

## Tech Stack

- Kotlin
- Android XML Layout
- ViewBinding
- Room Database
- RecyclerView
- MVVM (ViewModel + Repository sederhana)
- Kotlin Coroutines
- Material Design Components

---

## Project Status

This project is a fully working Android portfolio application.

- Build system: GitHub Actions
- Architecture: MVVM (lightweight)
- Database: Room (local storage)
- UI: XML-based Android UI
- Deployment: APK via GitHub Release

## Demo Access

- Source Code: GitHub Repository
- APK Download: GitHub Releases
- CI/CD Build: GitHub Actions


## How to Run Project

### Local Build (requires Android SDK)
```bash
./gradlew clean assembleDebug
