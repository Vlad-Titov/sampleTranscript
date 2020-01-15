package com.example.sampletranscript

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sampletranscript.data.Transcript
import io.reactivex.annotations.NonNull
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        NetworkService().getInstance()
            ?.getTranscriptApi()
            ?.getPostWithWord("example")
            ?.enqueue(object : Callback<Transcript?> {
                override fun onResponse(@NonNull call: Call<Transcript?>?, @NonNull response: Response<Transcript?>) {
                    val post: Transcript? = response.body()
                }

                override fun onFailure(@NonNull call: Call<Transcript?>?, @NonNull t: Throwable) {
                    t.printStackTrace()
                }
            })
    }
}
