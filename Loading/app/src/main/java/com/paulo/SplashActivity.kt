package com.paulo

import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.cardview.widget.CardView
import com.paulo.loading.MainActivity
import com.paulo.loading.R
import com.paulo.utils.Utils
import kotlinx.android.synthetic.main.activity_main.*


class SplashActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT:Long=3000 // 3 sec
    private val handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        handler.post(runnable)



        Handler().postDelayed({
            // This method will be executed once the timer is over
            // Start your app main activity

            startActivity(Intent(this,MainActivity::class.java))

            // close this activity
            finish()
        }, SPLASH_TIME_OUT)
    }

    private val runnable: Runnable
        get() = Runnable {
            Utils().anim(anim_1, 2f, 2f, .1f, 950, .3f, .3f, 1f)
            Utils().anim(anim_2, 1.5f, 1.5f, .2f, 850, .7f, .7f, 1f)
            Utils().myScale( me_card,.7f, .7f, 500, handler, runnable).start()
        }

}
