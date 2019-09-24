package layout.transitions.library

class Fade {
    fun In(): Array<Int>{
        return arrayOf(R.anim.fade_in, R.anim.fade_out)
    }

    fun Out(): Array<Int>{
        return arrayOf(R.anim.fade_in, R.anim.fade_out)
    }

}