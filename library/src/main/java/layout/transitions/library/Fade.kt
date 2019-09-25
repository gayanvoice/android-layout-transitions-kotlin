/*
 * MIT License
 *
 * Copyright (c) 2019 Gayan Kuruppu
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package layout.transitions.library

class Fade {
    fun In(): Array<Int>{
        return arrayOf(R.anim.fade_in, R.anim.fade_out)
    }

    fun InUp(): Array<Int>{
        return arrayOf(R.anim.fade_in_up, R.anim.fade_out_up)
    }

    fun InDown(): Array<Int>{
        return arrayOf(R.anim.fade_in_down, R.anim.fade_out_down)
    }

    fun InLeft(): Array<Int>{
        return arrayOf(R.anim.fade_in_left, R.anim.fade_out_right)
    }

    fun InRight(): Array<Int>{
        return arrayOf(R.anim.fade_in_right, R.anim.fade_out_left)
    }
}