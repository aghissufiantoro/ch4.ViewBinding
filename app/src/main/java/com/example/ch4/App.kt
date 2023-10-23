package com.example.ch4

import android.app.Application
import com.example.ch4.data.AppDatabase
import com.google.firebase.crashlytics.internal.common.AppData

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        AppDatabase.getInstance(this)
    }
}