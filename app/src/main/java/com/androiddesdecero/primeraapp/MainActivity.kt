package com.androiddesdecero.primeraapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var edad: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mainActivityBtEnviar.setOnClickListener {
            edad = mainActivityEtEdad.text.toString().toInt()
            if(edad >= 18){
                //TODO -> dar acceso a la aplicacion
                var intent = Intent(this, AccesoOkActivity::class.java)
                intent.putExtra(Constans.EDAD, edad)
                startActivity(intent)
            }else{
                //TODO -> no dar acceso a la aplicacion
                var intent = Intent(this, NoAccesoActivity::class.java)
                startActivity(intent)
            }
        }

    }
}
