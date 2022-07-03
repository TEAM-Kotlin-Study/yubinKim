package com.example.tiltsensor

import android.app.Activity
import android.content.ContentValues.TAG
import android.content.Context
import android.content.pm.ActivityInfo
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.WindowManager.LayoutParams as WindowManagerLayoutParams

class MainActivity : AppCompatActivity(), SensorEventListener {

    private val sensorManager by lazy {
        getSystemService(Context.SENSOR_SERVICE) as SensorManager
    }

    private lateinit var tiltView: TiltView

    override fun onCreate(savedInstanceState: Bundle?) {
        //화면이 꺼지지 않게 하기
        window.addFlags(WindowManagerLayoutParams.FLAG_KEEP_SCREEN_ON) //windowmanage.~~ 이 아닌?
        //가로모드로 고정
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        super.onCreate(savedInstanceState)

        tiltView = TiltView(this)
        setContentView(tiltView)
    }
    override fun onResume() {
        super.onResume()
        sensorManager.registerListener(this,
            sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
            SensorManager.SENSOR_DELAY_NORMAL)
    }

    override fun onSensorChanged(event: SensorEvent?) {
        event?.let {
            Log.d(TAG, "onSensorChanged" +
                    "x: ${event.values[0]}, y : ${event.values[1]}, z : ${event.values}")
            tiltView.onSensorEvent(event)
        }
    }

    override fun onAccuracyChanged(p0: Sensor?, p1: Int) {
    }
    override fun onPause() {
        super.onPause()
        sensorManager.unregisterListener(this)
    }

}
