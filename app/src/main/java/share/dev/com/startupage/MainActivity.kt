package share.dev.com.startupage

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.TextUtils
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        //no need to ask for the view from id kotlin has already implemented the classes to do this
//        btnGetMyAge.setOnClickListener{
//            //fire when button is clicked
//            //values coming from textviews have to be vonverted into Strings frist to be able to play with them after
//            var yearofBirth : Int = etDOB.text.toString().toInt()
//            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
//            val myAge : Int = currentYear - yearofBirth
//            tvAge.text = "Your age is $myAge years"
//
//        }
    }

    fun getMyAge(){
        //fire when button is clicked
        //values coming from textviews have to be vonverted into Strings frist to be able to play with them after
        var userYOB : Int = etDOB.text.toString().toInt()

        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val myAge : Int = currentYear - userYOB
        tvAge.text = "Your age is $myAge years"
    }

    //function that validates the Textview before accepting any kind of operation with the objects
    fun validateAgeView(view : View ){
        if(etDOB.text.toString().isNotEmpty()){
            if (TextUtils.isDigitsOnly(etDOB.text.toString()) && etDOB.text.toString().toInt() >0){
                getMyAge()
            }else{
                tvAge.text = "Invalid input"
            }
        }
    }
}
