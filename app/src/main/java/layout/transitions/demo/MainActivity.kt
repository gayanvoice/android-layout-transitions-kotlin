package layout.transitions.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import layout.transitions.library.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = Intent(this, LoadActivity::class.java)

        val textView:TextView = findViewById(R.id.textView)
        textView.setOnClickListener {

            startActivity(intent)

            val transitions = Transitions(this@MainActivity)
            transitions.setAnimation(Fade().InLeft())

        }

    }
}
