package layout.transitions.library

class Slide {

    fun InUp(): Array<Int>{
        return arrayOf(R.anim.slide_in_up, R.anim.slide_out_up)
    }

    fun InDown(): Array<Int>{
        return arrayOf(R.anim.slide_in_down, R.anim.slide_out_down)
    }

    fun InLeft(): Array<Int>{
        return arrayOf(R.anim.slide_in_left, R.anim.slide_out_right)
    }

    fun InRight(): Array<Int>{
        return arrayOf(R.anim.slide_in_right, R.anim.slide_out_left)
    }



}