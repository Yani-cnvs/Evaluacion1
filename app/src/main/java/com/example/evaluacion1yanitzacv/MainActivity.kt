package com.example.evaluacion1yanitzacv

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.lang.Integer.sum

class MainActivity : AppCompatActivity() {
    private lateinit var botonIngresar: Button
    private lateinit var CantidadCazuelaEt: EditText
    private lateinit var CantidadPastelEt: EditText
    private lateinit var TotalTv: TextView
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        botonIngresar   = findViewById(R.id.IngresarPedidoBtn)
        CantidadCazuelaEt = findViewById(R.id.CantidadCazuelaEt)
        CantidadPastelEt = findViewById(R.id.CantidadPastelEt)
        TotalTv         = findViewById(R.id.Total)

        botonIngresar.setOnClickListener {
            val cantidadCazuela = CantidadCazuelaEt.text.toString().toIntOrNull()
            val cantidadPastel = CantidadPastelEt.text.toString().toIntOrNull()

            if (cantidadCazuela != null && cantidadPastel != null) {
                val total = sum(cantidadCazuela, cantidadPastel)
                TotalTv.text = "El total es: $total"
            }
        }
    }
}