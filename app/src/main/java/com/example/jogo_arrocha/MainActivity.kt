package com.example.jogo_arrocha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.jogo_arocha.R


class MainActivity : AppCompatActivity() {

    private lateinit var tvLimMenor: TextView
    private lateinit var tvLimMaior: TextView
    private lateinit var tvStatus: TextView
    private lateinit var etChute: EditText
    private lateinit var btnChutar: Button
    private lateinit var arrocha: Arrocha


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.tvLimMenor = findViewById(R.id.tvLimMenor)
        this.tvLimMaior = findViewById(R.id.tvLimMaior)
        this.tvStatus = findViewById(R.id.tvStatus)
        this.etChute = findViewById(R.id.etChute)
        this.btnChutar = findViewById(R.id.btnChutar)

        this.arrocha = Arrocha(0,100)
//
        this.tvLimMenor.text = this.arrocha.valormenor.toString()
        this.tvLimMaior.text = this.arrocha.valormaior.toString()
        this.tvStatus.text = this.arrocha.status.toString()



    }
}

