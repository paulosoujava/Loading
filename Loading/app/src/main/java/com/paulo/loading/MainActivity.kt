package com.paulo.loading

import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.widget.AppCompatImageView
import com.paulo.utils.Utils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        handler.post(runnable)
    }

    private val runnable: Runnable
        get() = Runnable {
            Utils().anim(anim_1, 2f, 2f, .1f, 950, .3f, .3f, 1f)
            Utils().anim(anim_2, 1.5f, 1.5f, .2f, 850, .7f, .7f, 1f)

            val scale: ObjectAnimator = ObjectAnimator.ofPropertyValuesHolder(
                me_card,
                PropertyValuesHolder.ofFloat("scaleX", .7f),
                PropertyValuesHolder.ofFloat("scaleY", .7f)
            )
            scale.duration = 500
            scale.repeatCount = ObjectAnimator.INFINITE
            scale.repeatMode = ObjectAnimator.REVERSE
            handler.postDelayed( runnable, 1000)
            scale.start()
        }

    }




