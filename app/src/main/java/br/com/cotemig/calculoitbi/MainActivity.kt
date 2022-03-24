package br.com.cotemig.calculoitbi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var btnCalcular = findViewById<Button>(R.id.btnCalcular)

        btnCalcular.setOnClickListener {

            calcularClick()
        }
    }

    fun calcularClick(){

        var cidade = findViewById<EditText>(R.id.cidade)
        var valorImovel = findViewById<EditText>(R.id.valor_imovel)
        var valor = valorImovel.text.toString().toDouble()

        var result:Double = 0.0

            when(cidade.text.toString()){
            "1" -> result = valor * 0.03
            "2" -> result = valor * 0.0275
            "3" -> result = valor * 0.02
        }

        var intent = Intent(this, ResultadoActivity::class.java)
        intent.putExtra("valorITBI", result)
        startActivity(intent)
    }
}