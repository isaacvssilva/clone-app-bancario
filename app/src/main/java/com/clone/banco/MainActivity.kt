package com.clone.banco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    //lateinit -> atributo que ainda nao foi inicializado
    private lateinit var rvList: RecyclerView
    private val adapter = MenuItemAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*metodo inicial -> quando o android criar uma tela, este metodo vai ser chamado*/
        iniciaView()
        setItemsLista()
    }
    private fun iniciaView() {
        rvList = findViewById(R.id.rv_list)
        rvList.adapter = adapter

    }
    private fun setItemsLista() {

        adapter.setItensList(
            arrayListOf(
                MenuItemModel(
                    "cartões"
                ),
                MenuItemModel(
                    "meus comprovantes"
                ),
                MenuItemModel(
                    "investimentos"
                ),
                MenuItemModel(
                    "portabilidade de salário"
                ),
                MenuItemModel(
                    "crédito"
                ),
                MenuItemModel(
                    "poupança"
                )
            )
        )
    }
}