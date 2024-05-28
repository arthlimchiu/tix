package com.arthlimchiu.core.common.di

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class Dispatcher(val dispatcher: TixDispatchers)

enum class TixDispatchers {
    Default,
    IO
}