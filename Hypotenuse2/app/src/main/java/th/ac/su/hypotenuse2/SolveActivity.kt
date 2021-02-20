package th.ac.su.hypotenuse2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SolveActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_solve)

        var tvValA = findViewById<TextView>(R.id.tvA)
        var tvValB = findViewById<TextView>(R.id.tvB)
        var tvValC = findViewById<TextView>(R.id.tvC)

        val a = intent.getStringExtra("aa")
        tvValA.setText(a)

        val b = intent.getStringExtra("bb")
        tvValB.setText(b)

        val c = intent.getStringExtra("cc")
        tvValC.setText(c)


        var btnOkay = findViewById<Button>(R.id.btnOK)
        btnOkay.setOnClickListener {
            var intent = Intent()
            setResult(Activity.RESULT_OK,intent)

            finish()
        }





    }
}