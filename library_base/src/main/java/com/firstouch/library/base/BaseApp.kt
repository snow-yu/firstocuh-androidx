package com.firstouch.library.base

import android.app.Application

/**
 * ===============================
 * app全局应用管理
 * @author jiaxue
 * @date 2/2/21 11:05 AM
 * ================================
 */
class BaseApp: Application() {

    companion object {
        lateinit var instance: BaseApp
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

}