package com.zzq.common.interfaces

abstract class DialogCallback {
    abstract fun confirm()
    open fun cancel(){}
}