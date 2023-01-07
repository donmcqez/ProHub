package com.tikay.prohub.core.network.interceptors

import android.content.Context
import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkCapabilities
import android.os.Build
import dagger.hilt.android.qualifiers.ApplicationContext
import okhttp3.Interceptor
import okhttp3.Response
import java.io.IOException
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class NetworkStatusInterceptor @Inject constructor(
    @ApplicationContext val context: Context,
//    private val connectivityManager: ConnectivityManager
) : Interceptor, ConnectivityManager.NetworkCallback() {

    private var online = false

    //    private val connectivityManager2 = context.getSystemService<ConnectivityManager>()
//    private val wifiManager = context.applicationContext.getSystemService<WifiManager>()
    private val manager = context
        .getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

    init {
        if (Build.VERSION.SDK_INT >= 24) {
            manager.registerDefaultNetworkCallback(this)
        }
    }

    private fun isNetworkConnected(): Boolean {
//        val networkCapabilities1 = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//            manager.activeNetwork ?: return false
//        } else {
//            return false
//        }
        val networkCapabilities = manager.activeNetwork ?: return false
        val activeNetwork =
            manager.getNetworkCapabilities(networkCapabilities) ?: return false

        return when {
            activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
            activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
            activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> true
            else -> false
        }
    }

    override fun intercept(chain: Interceptor.Chain): Response {
        online = isNetworkConnected()

        if (online) {
            return chain.proceed(chain.request())
        } else {
            throw IOException("Internet connection is unavailable")
        }
    }

    override fun onCapabilitiesChanged(
        network: Network,
        capabilities: NetworkCapabilities,
    ) {
        online = if (capabilities.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET)) {
            true
        } else capabilities.hasCapability(NetworkCapabilities.TRANSPORT_WIFI)
    }
}
