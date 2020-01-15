package com.example.sampletranscript

import com.example.sampletranscript.constants.ApiKey
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


class NetworkService {
    private var mInstance: NetworkService? = null
    private val BASE_URL = "https://lingua-robot.p.rapidapi.com/language/v1/en/entries/"
    private var mRetrofit: Retrofit? = null

    private fun NetworkService(): NetworkService? {
        val logging = HttpLoggingInterceptor()
        logging.setLevel(HttpLoggingInterceptor.Level.BODY)
        val httpClient = OkHttpClient.Builder()

        httpClient.addInterceptor { chain ->
            val original = chain.request()
            val requestBuilder = original.newBuilder()
                //.header("X-RapidAPI-Key", ApiKey)
                .addHeader("X-RapidAPI-Host", "lingua-robot.p.rapidapi.com")
                .addHeader("X-RapidAPI-Key", ApiKey)

            val request = requestBuilder.build()
            chain.proceed(request)
        }
        httpClient.connectTimeout(30, TimeUnit.SECONDS)
        httpClient.readTimeout(30, TimeUnit.SECONDS)

        httpClient.addNetworkInterceptor(logging)

        mRetrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(httpClient.build())
            .build()
        return this
    }

    fun getInstance(): NetworkService? {
        if (mInstance == null) {
            mInstance = NetworkService()
        }
        return mInstance
    }

    fun getTranscriptApi(): TranscriptApi? {
        return mRetrofit!!.create<TranscriptApi>(
            TranscriptApi::class.java)
    }


}