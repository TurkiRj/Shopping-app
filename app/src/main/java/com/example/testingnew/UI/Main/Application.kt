package com.example.testingnew.UI.Main

import android.app.Application
import com.example.testingnew.Modules.modelViewModule
import com.example.testingnew.Modules.repositoryModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class Application: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@Application)

            modules(modelViewModule, repositoryModule)
        }
    }
}