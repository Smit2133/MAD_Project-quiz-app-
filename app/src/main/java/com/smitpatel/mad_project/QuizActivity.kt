package com.smitpatel.mad_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.smitpatel.mad_project.databinding.ActivityLoginBinding
import com.smitpatel.mad_project.databinding.ActivityQuizBinding

class QuizActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuizBinding
    private lateinit var list :ArrayList<QuestionModel>
    private var count:Int=0
    private var score=0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)
        list=ArrayList<QuestionModel>()
        list.add(QuestionModel("Who is the PM of India","Modi","Rahul","Parth","Smit","Smit"))
        list.add(QuestionModel("Who is the PM of India","Modi","Rahul","Parth","Smit1","Smit1"))
        list.add(QuestionModel("Who is the PM of India","Modi","Rahul","Parth","Smit2","Smit2"))
        list.add(QuestionModel("Who is the PM of India","Modi","Rahul","Parth","Smit3","Smit3"))
        binding.question.setText(list.get(0).Question)
        binding.option1.setText(list.get(0).option1)
        binding.option2.setText(list.get(0).option2)
        binding.option3.setText(list.get(0).option3)
        binding.option4.setText(list.get(0).option4)
        binding.option1.setOnClickListener{
            nextData(binding.option1.text.toString())
        }
        binding.option2.setOnClickListener{
            nextData(binding.option2.text.toString())
        }
        binding.option3.setOnClickListener{     nextData(binding.option3.text.toString())}
        binding.option4.setOnClickListener{     nextData(binding.option4.text.toString())}
    }
    private fun nextData(i:String){
        if(count<list.size) {
            if (list.get(count).ans.equals(i)) {
                score++
            }
        }
count++
        if(count>=list.size)
        {
          Toast.makeText(this@QuizActivity,score.toString(),Toast.LENGTH_LONG).show()
        }
        else{
        binding.question.setText(list.get(count).Question)
        binding.option1.setText(list.get(count).option1)
        binding.option2.setText(list.get(count).option2)
        binding.option3.setText(list.get(count).option3)
        binding.option4.setText(list.get(count).option4)
    }
}}