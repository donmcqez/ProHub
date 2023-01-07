package com.tikay.prohub.home

import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.View
import android.view.animation.LinearInterpolator
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.animation.doOnEnd
import androidx.core.animation.doOnStart
import androidx.core.view.WindowCompat
import com.tikay.prohub.core.design.theme.ProHubTheme
import dagger.hilt.android.AndroidEntryPoint
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.tikay.prohub.core.design.util.changeSystemBarsColor
import com.tikay.prohub.core.design.util.getSystemAnimationDuration

@AndroidEntryPoint
class MainActivity :  ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setupSystemSplashScreen()

        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            ProHubTheme {
                Home(onOpenSettings = ::openSettings)
            }
        }
    }

    private fun openSettings() {
//        startActivity(Intent(this, SettingsActivity::class.java))
    }

    private fun setupSystemSplashScreen() {
        installSplashScreen().setOnExitAnimationListener { splashScreenView ->
            val fadeAnim = ObjectAnimator.ofFloat(
                splashScreenView.view,
                View.ALPHA,
                1f,
                0f
            )

            with(fadeAnim) {
                interpolator = LinearInterpolator()
                duration = getSystemAnimationDuration().toLong()
                doOnStart { changeSystemBarsColor() }
                doOnEnd { splashScreenView.remove() }
                start()
            }
        }
    }
}