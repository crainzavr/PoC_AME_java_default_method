package com.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.test.implementationlib.Test

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        runTest()
    }

    private fun runTest() {
        try {
            Test().test()
            Log.d(TAG, "call success")
        } catch (e: AbstractMethodError) {
            Log.d(TAG, "call fail e = $e")
        }
    }

    companion object {
        private const val TAG = "PoC_AME"
    }
}