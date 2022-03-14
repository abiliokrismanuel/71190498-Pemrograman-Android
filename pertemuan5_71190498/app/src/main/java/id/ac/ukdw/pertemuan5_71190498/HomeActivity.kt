package id.ac.ukdw.pertemuan5_71190498

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val nama = intent.getStringExtra("nama")

        val halaman2 = findViewById<TextView>(R.id.halaman2)
        halaman2.text = "Halo Selamat Datang \n${nama}"
    }
}