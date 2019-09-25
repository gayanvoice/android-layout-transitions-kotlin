package layout.transitions.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import layout.transitions.library.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = Intent(this, LoadActivity::class.java)

        val buttonView: Button = findViewById(R.id.buttonView)
        buttonView.setOnClickListener {

            startActivity(intent)
            val transitions = Transitions(this@MainActivity)
            transitions.setAnimation(Slide().InRight())

        }

    }
}
