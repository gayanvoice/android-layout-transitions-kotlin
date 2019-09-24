package layout.transitions.library

import android.app.Activity
import android.content.Context


class Transitions(private val context: Context) {

    fun getLayouts(animIn: Int, animOut: Int) {
        (context as Activity).overridePendingTransition(animIn, animOut)
    }

}
