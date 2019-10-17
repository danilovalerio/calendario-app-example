package com.danilovalerio.calendario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CalendarView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calendarView.setOnDateChangeListener { calendarView: CalendarView, ano: Int, mes: Int, diaDoMes: Int ->
            Log.i("CALEND", ano.toString()+"/"+mes+"/"+diaDoMes)
            textViewDataSelecionada.setText(diaDoMes.toString()+"/"+mes+"/"+ano)
        }
    }
}
