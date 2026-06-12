package com.siswa.praktikum.pariwisata.view

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.saadahmedsoft.popupdialog.PopupDialog
import com.saadahmedsoft.popupdialog.Styles
import com.saadahmedsoft.popupdialog.listener.OnDialogButtonClickListener
import com.siswa.praktikum.pariwisata.databinding.ActivityRegisterBinding
import com.siswa.praktikum.pariwisata.viewmodel.RegisterViewModel


class RegisterActivity : AppCompatActivity() {

    lateinit var uiBinding: ActivityRegisterBinding
    lateinit var registerViewModel: RegisterViewModel

    lateinit var strName: String
    lateinit var strEmail: String
    lateinit var strPassword: String
    lateinit var strRepassword: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        uiBinding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(uiBinding.root)

        registerViewModel = ViewModelProvider(this).get(RegisterViewModel::class.java)

        uiBinding.btnRegister.setOnClickListener {
            strName = uiBinding.edtName.text.toString().trim()
            strPassword = uiBinding.edtPassword.text.toString().trim()
            strRepassword = uiBinding.edtRepassword.text.toString().trim()
            strEmail = uiBinding.edtEmail.text.toString().trim()

            if (!strName.isEmpty() && !strEmail.isEmpty() && !strPassword.isEmpty() && !strRepassword.isEmpty()){
                if (strPassword.equals(strRepassword)) {
                    registerViewModel.register(this, strName, strEmail, strPassword)

                    PopupDialog.getInstance(this)
                        .setStyle(Styles.SUCCESS)
                        .setHeading("Pariwisata")
                        .setDescription("Pendaftaran berhasil. Silakan login.")
                        .setCancelable(true)
                        .setDismissButtonText("OK")
                        .showDialog(object : OnDialogButtonClickListener() {
                            override fun onDismissClicked(dialog: Dialog) {
                                super.onDismissClicked(dialog)
                            }
                        })
                } else {
                    PopupDialog.getInstance(this)
                        .setStyle(Styles.FAILED)
                        .setHeading("Pariwisata")
                        .setDescription("Pendaftaran gagal. Password tidak sama.")
                        .setCancelable(true)
                        .setDismissButtonText("OK")
                        .showDialog(object : OnDialogButtonClickListener() {
                            override fun onDismissClicked(dialog: Dialog) {
                                super.onDismissClicked(dialog)
                            }
                        })
                }
            } else {
                PopupDialog.getInstance(this)
                    .setStyle(Styles.FAILED)
                    .setHeading("Pariwisata")
                    .setDescription("Pendaftaran gagal. Pastikan semua data sudah diisi.")
                    .setCancelable(true)
                    .setDismissButtonText("OK")
                    .showDialog(object : OnDialogButtonClickListener() {
                        override fun onDismissClicked(dialog: Dialog) {
                            super.onDismissClicked(dialog)
                        }
                    })
            }
        }
    }
}