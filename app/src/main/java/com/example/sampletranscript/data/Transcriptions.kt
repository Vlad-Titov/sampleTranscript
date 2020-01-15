package com.example.sampletranscript.data

import com.google.gson.annotations.SerializedName

data class Transcriptions (

	@SerializedName("transcription") val transcription : String,
	@SerializedName("notation") val notation : String
)