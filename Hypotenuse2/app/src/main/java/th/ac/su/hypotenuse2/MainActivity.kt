package th.ac.su.hypotenuse2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Result = findViewById<TextView>(R.id.Cresult)
        val Aval = findViewById<EditText>(R.id.Avalue)
        val Bval = findViewById<EditText>(R.id.Bvalue)
        val Solve = findViewById<Button>(R.id.btnSolve)

        Solve.setOnClickListener {

            var A:Double = Aval.text.toString().toDouble()
            var B:Double = Bval.text.toString().toDouble()
            var C:Double = 0.0

            C = (A*A) + (B*B);
            C = sqrt(C);
            C.toString()

            var intent = Intent(this@MainActivity,SolveActivity::class.java)
            intent.putExtra("aa",A.toString())
            intent.putExtra("bb",B.toString())
            intent.putExtra("cc",C.toString())

            startActivity(intent)

        }

    }
}