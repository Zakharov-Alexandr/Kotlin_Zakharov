package com.example.kotlin_zakharov

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    private var number: Int = 3
    private var number2: Int = 5
    private var text: String = "Я <купил> 2 пирожка, в столовой <остался> 1 пирожок."
    private var tvText: TextView? = null; //создали переменную для TextView
    private var tvText2: TextView? = null;
    private var tvText3: TextView? = null;
    private var tvText4: TextView? = null;

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //отображение нужного слоя
        tvText = findViewById(R.id.tvTextView2) // связали переменную и компонент
            //отобразить содержимое переменной tvText на компоненте tvTextView2
        tvText?.setText(text)
        tvText2?.setText(text)
        tvText3?.setText(text)
        tvText4?.setText(text)
        var subText: String = text.substringAfter('<')
        var subText2: String = subText.substringBefore('>')
        var subText3: String = text.substringAfter('<')
        var subText4: String = subText.substringBefore('>')
        tvText?.setText(subText)
        tvText?.setText(subText2)
        tvText?.setText(subText3)
        tvText?.setText(subText4)
    }


}