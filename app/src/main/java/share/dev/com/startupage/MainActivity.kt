package share.dev.com.startupage

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //no need to ask for the view from id kotlin has already implemented the classes to do this
        btnGetMyAge.setOnClickListener{
            //fire when button is clicked
            //values coming from textviews have to be vonverted into Strings frist to be able to play with them after
            var yearofBirth : Int = etDOB.text.toString().toInt()
            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
            val myAge : Int = currentYear - yearofBirth
            tvAge.text = "Your age is $myAge years"

        }
    }
}
