package com.danilovalerio.calendario

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //definir datas específicas
//        calendarView.state().edit()
//            .setMinimumDate(CalendarDay.from(2019,0,1))
//            .setMaximumDate(CalendarDay.from(2019,11,31))
//            .commit()

        //quando muda o mes exibe o valor
        calendarView.setOnMonthChangedListener({
            widget, date ->
            Log.i("CALEND", date.month.plus(1).toString()+"/"+date.year)
        })

        //Quando muda data exibe o valor
//        calendarView.setOnDateChangedListener({
//            widget, date, selected ->
//            Log.i("CALEND", date.toString())
//        })

//        calendarView.setOnDateChangeListener { calendarView: CalendarView, ano: Int, mes: Int, diaDoMes: Int ->
//            Log.i("CALEND", ano.toString()+"/"+mes+"/"+diaDoMes)
//            textViewDataSelecionada.setText(diaDoMes.toString()+"/"+mes+"/"+ano)
//        }

        //definir valores predefinidos para meses
        val meses = arrayOf<String>("Jan","Fev","Mar","Abril","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez")
        calendarView.setTitleMonths(meses)

        var semanas = arrayOf<String>("Seg","Ter","Qua","Qui","Sex","Sáb","Dom")
        calendarView.setWeekDayLabels(semanas)
    }
}