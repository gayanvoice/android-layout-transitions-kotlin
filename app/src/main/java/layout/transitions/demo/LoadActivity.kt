package layout.transitions.demo

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import layout.transitions.library.Fade
import layout.transitions.library.Transitions

class LoadActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_load)
        val buttonView: Button = findViewById(R.id.buttonView)
        buttonView.setOnClickListener {
            finish()
            val transitions = Transitions(this@LoadActivity)
            transitions.setAnimation(Fade().InDown())
        }
    }
}
