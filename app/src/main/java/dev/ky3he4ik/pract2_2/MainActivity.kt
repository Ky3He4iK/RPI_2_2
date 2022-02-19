package dev.ky3he4ik.pract2_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val NCREATE = "Activity CREATED"
    val NSTART = "Activity STARTED"
    val NRESUME = "Activity RESUME"
    val NPAUSE = "Activity PAUSED"
    val NSTOP = "Activity STOPPED"
    val NRESTART = "Activity RESTARTED"
    val NDESTROY = "Activity DESTROYED"

    private fun showToast(text: String, gravity: Int) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).apply {
            setGravity(gravity, 0, 0)
            show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        showToast(NCREATE, Gravity.NO_GRAVITY)
    }

    override fun onStart() {
        super.onStart()
        showToast(NSTART, Gravity.LEFT)
    }

    override fun onResume() {
        super.onResume()
        showToast(NRESUME, Gravity.TOP)
    }

    override fun onPause() {
        super.onPause()
        showToast(NPAUSE, Gravity.RIGHT)
    }

    override fun onStop() {
        super.onStop()
        showToast(NSTOP, Gravity.CENTER)
    }

    override fun onRestart() {
        super.onRestart()
        showToast(NRESTART, Gravity.FILL_HORIZONTAL)
    }

    override fun onDestroy() {
        super.onDestroy()
        showToast(NDESTROY, Gravity.FILL)
    }
}
