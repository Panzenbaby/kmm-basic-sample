package com.jetbrains.kmm.shared

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class Repository {

    fun createFlow(): Flow<String> = flow {
        for (i in 0 .. 10) {
            emit("$i")
            kotlinx.coroutines.delay(1000)
        }

    }.flowOn(Dispatchers.IO)
}