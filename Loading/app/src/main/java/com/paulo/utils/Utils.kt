package com.paulo.utils

import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.os.Handler
import androidx.appcompat.widget.AppCompatImageView
import androidx.cardview.widget.CardView

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
    fun myScale(card: CardView, scaleX : Float, scaleY: Float, duration: Long, handler: Handler, runnable: Runnable): ObjectAnimator {
        val scale: ObjectAnimator = ObjectAnimator.ofPropertyValuesHolder(
            card,
            PropertyValuesHolder.ofFloat("scaleX", scaleX),
            PropertyValuesHolder.ofFloat("scaleY", scaleY)
        )
        scale.duration = duration
        scale.repeatCount = ObjectAnimator.INFINITE
        scale.repeatMode = ObjectAnimator.REVERSE
        handler.postDelayed( runnable, 1000)
        return scale
    }
}