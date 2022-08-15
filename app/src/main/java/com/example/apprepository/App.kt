package com.example.apprepository

import android.app.Application
import com.example.apprepository.data.di.DataModule
import com.example.apprepository.domain.di.DomainModule
import com.example.apprepository.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}