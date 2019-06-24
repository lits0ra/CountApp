package com.example.countapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button;
import android.widget.TextView;
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //変数の宣言
    var count_number: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //countTextViewのインスタンスを取得
        val countTextView = findViewById<TextView>(R.id.number)

        //Buttonの処理を追記

        //足し算
        plus.setOnClickListener {
            count_number += 1
            countTextView.setText(count_number.toString())
        }

        //引き算
        minus.setOnClickListener {
            count_number -= 1
            countTextView.setText(count_number.toString())
        }

        //変数初期化
        clear.setOnClickListener {
            count_number = 0
            countTextView.setText(count_number.toString())
        }

        //掛け算
        kakeru.setOnClickListener {
            count_number *= 2
            countTextView.setText(count_number.toString())
        }

        //割り算
        waru.setOnClickListener {
            count_number /= 2
            countTextView.setText(count_number.toString())
        }
    }
}
