package layout.transitions.library

import android.app.Activity
import android.content.Context


class Transitions(private val context: Context) {

    fun setAnimation(effects: Array<Int>) {
        (context as Activity).overridePendingTransition(effects[0], effects[1])
    }
}
