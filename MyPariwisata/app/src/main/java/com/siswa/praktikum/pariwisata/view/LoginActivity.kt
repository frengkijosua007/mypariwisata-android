package com.siswa.praktikum.pariwisata.view

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.pixplicity.easyprefs.library.Prefs
import com.saadahmedsoft.popupdialog.PopupDialog
import com.saadahmedsoft.popupdialog.Styles
import com.saadahmedsoft.popupdialog.listener.OnDialogButtonClickListener
import com.siswa.praktikum.pariwisata.R
import com.siswa.praktikum.pariwisata.databinding.ActivityLoginBinding
import com.siswa.praktikum.pariwisata.viewmodel.LoginViewModel

class LoginActivity : AppCompatActivity() {

    lateinit var uiBinding: ActivityLoginBinding
    lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        uiBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(uiBinding.root)

        loginViewModel = ViewModelProvider(this).get(LoginViewModel::class.java)

        uiBinding.edtEmail.setText("")
        uiBinding.edtPassword.setText("")

        uiBinding.btnLogin.setOnClickListener {
            val strEmail = uiBinding.edtEmail.text.toString().trim()
            val strPass = uiBinding.edtPassword.text.toString().trim()

            if (!strEmail.isEmpty() && !strPass.isEmpty()){
                loginViewModel.getLoginDetails(this@LoginActivity, strEmail, strPass)!!.observe(this@LoginActivity, Observer {
                    if (it == null){
                        PopupDialog.getInstance(this@LoginActivity)
                            .setStyle(Styles.FAILED)
                            .setHeading("Pariwisata")
                            .setDescription("Login gagal. Salah username/password.")
                            .setCancelable(true)
                            .setDismissButtonText("OK")
                            .showDialog(object : OnDialogButtonClickListener() {
                                override fun onDismissClicked(dialog: Dialog) {
                                    super.onDismissClicked(dialog)
                                }
                            })
                    }
                    else {
                        val mainIntent = Intent(this@LoginActivity, MainActivity::class.java)
                        Prefs.putString("EMAIL", it.email)
                        Prefs.putString("NAMA", it.name)
                        startActivity(mainIntent)
                    }
                })
            } else {
                PopupDialog.getInstance(this@LoginActivity)
                    .setStyle(Styles.FAILED)
                    .setHeading("Pariwisata")
                    .setDescription("Pastikan semua data sudah diisi.")
                    .setCancelable(true)
                    .setDismissButtonText("OK")
                    .showDialog(object : OnDialogButtonClickListener() {
                        override fun onDismissClicked(dialog: Dialog) {
                            super.onDismissClicked(dialog)
                        }
                    })
            }
        }

        uiBinding.tvClickToRegister.setOnClickListener {
            val registerIntent = Intent(this@LoginActivity, RegisterActivity::class.java)
            startActivity(registerIntent)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finishActivity(1)
    }
}