package com.example.sampletranscript

import com.example.sampletranscript.data.Transcript
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface TranscriptApi {
    @GET("/{word}")
    fun getPostWithWord(@Path("word") word: String): Call<Transcript>?
}