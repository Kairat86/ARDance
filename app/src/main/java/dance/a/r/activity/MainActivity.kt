package dance.a.r.activity

import android.content.Context
import android.opengl.GLSurfaceView
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import dance.a.r.renderer.ARenderer

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ARSurfaceView(this))
    }

    class ARSurfaceView(context: Context) : GLSurfaceView(context) {
        init {
            setEGLContextClientVersion(2)
            setRenderer(ARenderer())
            renderMode = RENDERMODE_WHEN_DIRTY
        }
    }
}
