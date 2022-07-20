package com.example.mitapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class calculatorActivity : AppCompatActivity() {
    lateinit var Buttonadd:Button
    lateinit var Buttonsubtract:Button
    lateinit var Buttonproduct:Button
    lateinit var Buttonquotient:Button
    lateinit var textView: TextView
    lateinit var Edt_firstnum:EditText
    lateinit var Edt_secondnum:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        Buttonadd=findViewById(R.id.btn_add)
        Buttonsubtract=findViewById(R.id.btn_subtract)
        Buttonquotient=findViewById(R.id.btn_quotient)
        Buttonproduct=findViewById(R.id.btn_product)
        Edt_firstnum=findViewById(R.id.Edt_firstnum)
        Edt_secondnum=findViewById(R.id.Edt_secondnum)
        textView=findViewById(R.id.textView)

        Buttonadd.setOnClickListener {
            var firstnum=Edt_firstnum.text.toString()
            var secondnum=Edt_secondnum.text.toString()

            if (firstnum.isEmpty() && secondnum.isEmpty()){
                textView.text="Please fill in all details"
            }else{
                var answer=firstnum.toDouble() * secondnum.toDouble()
                textView.text=answer.toString()
            }

        }

        Buttonsubtract.setOnClickListener {
            var firstnum=Edt_firstnum.text.toString()
            var secondnum=Edt_secondnum.text.toString()

            if (firstnum.isEmpty() && secondnum.isEmpty()){
                textView.text="Please fill in all details"
            }else{
                var answer=firstnum.toDouble() * secondnum.toDouble()
                textView.text=answer.toString()
            }

        }

        Buttonproduct.setOnClickListener {
            var firstnum=Edt_firstnum.text.toString()
            var secondnum=Edt_secondnum.text.toString()

            if (firstnum.isEmpty() && secondnum.isEmpty()){
                textView.text="Please fill in all details"
            }else{
                var answer=firstnum.toDouble() * secondnum.toDouble()
                textView.text=answer.toString()
            }

        }

        Buttonquotient.setOnClickListener {
            var firstnum=Edt_firstnum.text.toString()
            var secondnum=Edt_secondnum.text.toString()

            if (firstnum.isEmpty() && secondnum.isEmpty()){
                textView.text="Please fill in all details"
            }else{
                var answer=firstnum.toDouble() * secondnum.toDouble()
                textView.text=answer.toString()
            }

        }

}
}