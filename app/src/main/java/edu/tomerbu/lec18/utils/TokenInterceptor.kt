package edu.tomerbu.lec18.utils

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class TokenInterceptor(
    private val queryParam: String = "api_key",
    private val queryValue: String = "b3b1492d3e91e9f9403a2989f3031b0c"
) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {

        val original: Request = chain.request()

        val url =
            original
                .url.newBuilder()
                .addQueryParameter(queryParam, queryValue)
                .build()

        //modify the request url:
        val request = original.newBuilder().url(url).build()

        return chain.proceed(request)
    }
}
