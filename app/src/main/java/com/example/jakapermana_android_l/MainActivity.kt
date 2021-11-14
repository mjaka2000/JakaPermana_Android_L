package com.example.jakapermana_android_l

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val simpanBtn = findViewById<Button>(R.id.simpanBtn)
        val batalBtn = findViewById<Button>(R.id.batalBtn)

        val namaEditText = findViewById<EditText>(R.id.namaEditText)
        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val phoneEditText = findViewById<EditText>(R.id.phoneEditText)
        val tanggalLahirEditText = findViewById<EditText>(R.id.tanggalLahirEditText)
        val jumlahSKSEditText = findViewById<EditText>(R.id.jumlahSKSEditText)

        simpanBtn.setOnClickListener{
            val nama = namaEditText.text.toString()
            val email = emailEditText.text.toString()
            var jumlahSKS = jumlahSKSEditText.text.toString().toInt()
            jumlahSKS = 160 - jumlahSKS
            Toast.makeText(this, "Sisa SKS... $jumlahSKS",Toast.LENGTH_SHORT).show()

            val intent = Intent(this,ResultActivity::class.java)
            intent.putExtra("nama",nama)
            intent.putExtra("email",email)
            intent.putExtra("jumlah_sks",jumlahSKS)
            startActivity(intent)

        }
        batalBtn.setOnClickListener{
            Toast.makeText(this, "Batal...",Toast.LENGTH_SHORT).show()
        }
    }
}