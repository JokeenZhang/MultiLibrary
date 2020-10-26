package com.zzq.common.ext

import android.util.Log
import androidx.appcompat.app.AppCompatActivity

fun AppCompatActivity.eLog(tag:String = "Activity",msg: String) {
    Log.e(tag, msg)
}