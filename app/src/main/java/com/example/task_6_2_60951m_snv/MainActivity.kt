package com.example.task_6_2_60951m_snv

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var buttonAllow: Button
    private lateinit var buttonShow: Button
    private lateinit var buttonClose: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonAllow = findViewById(R.id.buttonAllow)
        buttonShow = findViewById(R.id.buttonShow)
        buttonClose = findViewById(R.id.buttonClose)

        // Кнопка «Разрешить» — делает активной кнопку «Показать»
        buttonAllow.setOnClickListener {
            buttonShow.isEnabled = true
        }

        // Кнопка «Показать» — делает видимой кнопку «Закрыть»
        buttonShow.setOnClickListener {
            buttonClose.visibility = android.view.View.VISIBLE
            buttonClose.isEnabled = true
        }

        // Кнопка «Закрыть» — закрывает приложение
        buttonClose.setOnClickListener {
            finish()
        }
    }
}