package com.cubidevs.vivacolombia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class RegistroTuristicoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_turistico)

        var registrarButton: Button = findViewById(R.id.registrar_button)
        var nombreEditText: EditText = findViewById(R.id.nombre_edit_text)
        var infoTextView: TextView = findViewById(R.id.info_text_view)

    }
}