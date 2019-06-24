package com.example.countapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button;
import android.widget.TextView;
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var count_number: Int = 0
        setContentView(R.layout.activity_main)
        //countTextViewのインスタンスを取得
        val countTextView = findViewById<TextView>(R.id.number)

        //Buttonの処理を追記
        plus.setOnClickListener {
            count_number += 1
            countTextView.setText(count_number.toString())
        }
        minus.setOnClickListener {
            count_number -= 1
            countTextView.setText(count_number.toString())
        }
        clear.setOnClickListener {
            count_number = 0
            countTextView.setText(count_number.toString())
        }
        kakeru.setOnClickListener {
            count_number *= 2
            countTextView.setText(count_number.toString())
        }
        waru.setOnClickListener {
            count_number /= 2
            countTextView.setText(count_number.toString())
        }
    }
}
