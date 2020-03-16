package com.paulo.utils

import androidx.appcompat.widget.AppCompatImageView

class Utils{

     fun anim(
        anim: AppCompatImageView,
        x: Float,
        y: Float,
        alpha: Float,
        duration: Long,
        scaleX: Float,
        scaleY: Float,
        scaleAlpha: Float
    ) {
        anim.animate()
            .scaleX(x)
            .scaleY(y)
            .alpha(alpha)
            .setDuration(duration)
            .withEndAction {
                anim.scaleX = scaleX
                anim.scaleY = scaleY
                anim.alpha = scaleAlpha
            }
    }
}