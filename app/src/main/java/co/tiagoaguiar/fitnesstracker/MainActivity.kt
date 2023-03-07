package co.tiagoaguiar.fitnesstracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    private lateinit var btnloguin: Button
    private lateinit var btncadastrar: TextView
    private lateinit var btnrecuperar: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnloguin = findViewById(R.id.btn_loguin)
        btnloguin.setOnClickListener {
            val i = Intent(this, MainItem::class.java )
            startActivity(i)
        }
        btncadastrar = findViewById(R.id.cadastro)
        btncadastrar.setOnClickListener {
            val i = Intent(this, Casdatrar::class.java )
            startActivity(i)
        }
        btnrecuperar = findViewById(R.id.recuperar)
        btnrecuperar.setOnClickListener {
            val i = Intent(this, RecuperarSenha::class.java )
            startActivity(i)
        }


    }
}