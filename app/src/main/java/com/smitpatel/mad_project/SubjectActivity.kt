package com.smitpatel.mad_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.TextView


class SubjectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subject)
        var b1 = findViewById<Button>(R.id.MAD)
        var b2 = findViewById<Button>(R.id.CN)
        var b3 = findViewById<Button>(R.id.C)
        var b4 = findViewById<Button>(R.id.CPLASE)
        var b5 = findViewById<Button>(R.id.JAVA)
        var b6 = findViewById<Button>(R.id.OS)
        b1.setOnClickListener() {
            Intent(this@SubjectActivity, QuizActivity::class.java).also { startActivity(it) }
        }
        b1.setOnClickListener() {
            val message = b1.text.toString()
            Intent(this@SubjectActivity, QuizActivity::class.java).also {
                it.putExtra("sub_name", message)
                startActivity(it)
            }
        }

        b2.setOnClickListener() {
            val message = b2.text.toString()
            Intent(this@SubjectActivity, QuizActivity::class.java).also {
                it.putExtra("sub_name", message)
                startActivity(it)
            }
        }
        b3.setOnClickListener() {
            val message = b3.text.toString()
            Intent(this@SubjectActivity, QuizActivity::class.java).also {
                it.putExtra("sub_name", message)
                startActivity(it)
            }
        }
        b4.setOnClickListener() {
            val message = b4.text.toString()
            Intent(this@SubjectActivity, QuizActivity::class.java).also {
                it.putExtra("sub_name", message)
                startActivity(it)
            }
        }
        b5.setOnClickListener() {
            val message = b5.text.toString()
            Intent(this@SubjectActivity, QuizActivity::class.java).also {
                it.putExtra("sub_name", message)
                startActivity(it)
            }
        }
        b6.setOnClickListener() {
            val message = b6.text.toString()
            Intent(this@SubjectActivity, QuizActivity::class.java).also {
                it.putExtra("sub_name", message)
                startActivity(it)
            }
        }
    }


}
