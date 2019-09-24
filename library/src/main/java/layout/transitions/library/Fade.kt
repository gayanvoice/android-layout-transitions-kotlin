package layout.transitions.library

class Fade {
    fun In(): Array<Int>{
        return arrayOf(R.anim.fade_in, R.anim.fade_out)
    }

    fun InUp(): Array<Int>{
        return arrayOf(R.anim.fade_in_up, R.anim.fade_out_down)
    }

    fun InDown(): Array<Int>{
        return arrayOf(R.anim.fade_in_down, R.anim.fade_out_up)
    }

    fun InLeft(): Array<Int>{
        return arrayOf(R.anim.fade_in_left, R.anim.fade_out_right)
    }

    fun InRight(): Array<Int>{
        return arrayOf(R.anim.fade_in_right, R.anim.fade_out_left)
    }



}