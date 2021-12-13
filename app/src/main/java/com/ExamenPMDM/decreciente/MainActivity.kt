package com.ExamenPMDM.decreciente

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton: Button = findViewById(R.id.boton)

        boton.setOnClickListener() {
            pulsar()


        }
        decreciente()
    }
    fun decreciente(){
        var numero:Int = 100;
        for (i in 1..100){
            Log.d("restar" , "Se resta el numero " + numero + "-1")
            numero--
        }
    }
    fun pulsar(){

            Toast.makeText(this, "Pulsaste el boton", Toast.LENGTH_LONG).show()


    }

}