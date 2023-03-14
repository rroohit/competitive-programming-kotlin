package a_main

import kotlin.math.roundToInt

fun main() {

    val list = intArrayOf(1,2,3)


    val a = list.size/2
    println(a)
}

//inline fun <ResultType, RequestType, NewToken> networkRequestHandler(
//    crossinline loadFromLocalDB: suspend () -> ResultType?,
//    crossinline loadFromNetwork: suspend () -> RequestType,
//    crossinline saveToLocalDB: suspend (RequestType) -> Unit,
//    crossinline onTokenExpire: suspend () -> NewToken,
//    crossinline refreshNetworkData: suspend (NewToken) -> RequestType
//) = flow {
//
//    // 1. Load data from local DB
//    val localData = loadFromLocalDB()
//
//    // 2. If local data is available, emit it as a Resource.Cached
//    if (localData != null) emit(Resource.Cached(localData))
//
//    try {
//        // 3. If local data is not available, load data from the network
//        val networkData = loadFromNetwork()
//
//        // 4. Save data to local DB
//        saveToLocalDB(networkData)
//
//        // 5. Emit data as a Resource.Success
//        emit(Resource.Success(loadFromLocalDB()))
//    } catch (e: Exception) {
//        if (e is TokenExpiredException) {
//            // 6. Handle token expiration
//            val newToken = onTokenExpire()
//            val networkData = refreshNetworkData(newToken)
//            saveToLocalDB(networkData)
//            emit(Resource.Success(loadFromLocalDB()))
//        } else {
//            // 7. Handle other errors
//            emit(Resource.Error(e))
//        }
//    }
//}


