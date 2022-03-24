package br.com.cotemig.calculoitbi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text
import java.text.NumberFormat
import java.util.*

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        var itbi = intent.getDoubleExtra("valorITBI", 0.0)
        var resultado = findViewById<TextView>(R.id.resultado)

        var f = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("pt-br"))

        resultado.text = f.format(itbi)

        var btnVoltar = findViewById<Button>(R.id.btnVoltar)

        btnVoltar.setOnClickListener {

            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}