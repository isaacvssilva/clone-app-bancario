package com.clone.banco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    //lateinit -> atributo que ainda nao foi inicializado
    private lateinit var rvList: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*metodo inicial -> quando o android criar uma tela, este metodo vai ser chamado*/
        iniciaView()
    }
    private fun iniciaView() {

    }
}