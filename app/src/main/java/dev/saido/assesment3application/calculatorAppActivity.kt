package dev.saido.assesment3application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class calculatorAppActivity : AppCompatActivity() {
    lateinit var tilNumber1:TextInputLayout
    lateinit var tilNumber2:TextInputLayout
    lateinit var etNum1:TextInputEditText
    lateinit var etNum2:TextInputEditText
    lateinit var btnAdd:Button
    lateinit var btnSubtract:Button
    lateinit var btnModulus:Button
    lateinit var btnDivision:Button
    lateinit var tvView:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator_app)
        tilNumber1 = findViewById(R.id.tilNumber1)
        tilNumber2 = findViewById(R.id.tilNumber2)
        etNum1=findViewById(R.id.etNum1)
        etNum2=findViewById(R.id.etNum1)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnModulus = findViewById(R.id.btnModulus)
        btnDivision = findViewById(R.id.btnDivision)
        tvView = findViewById(R.id.tvView)
        btnAdd.setOnClickListener {
            val num1 = etNum1.text.toString()
            val num2 = etNum2.text.toString()
            subtraction(num1.toInt(), num2.toInt())

        }

        btnSubtract.setOnClickListener {
            val num1 = etNum1.text.toString()
            val num2 = etNum2.text.toString()
            subtraction(num1.toInt(), num2.toInt())
        }

        btnModulus.setOnClickListener {
            val num1 = etNum1.text.toString()
            val num2 = etNum2.text.toString()

            modulus(num1.toInt(), num2.toInt())

        }

        btnDivision.setOnClickListener {
            val num1 = etNum1.text.toString()
            val num2 = etNum2.text.toString()

            division(num1.toInt(), num2.toInt())

        }
    }


    fun addittion(num1:Int, num2:Int){
        val num = num1+num2
        tvView.text= num.toString()
    }

    fun subtraction(num1:Int, num2:Int){
        val num = num1-num2
        tvView.text = num.toString()
    }

    fun modulus(num1:Int, num2:Int){
        val num = num1%num2
        tvView.text = num.toString()
    }

    fun division(num1:Int, num2:Int){
        val num = num1/num2
        tvView.text = num.toString()
    }

}






