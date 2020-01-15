package com.example.sampletranscript.data

import com.google.gson.annotations.SerializedName

data class Pronunciations (

	@SerializedName("transcriptions") val transcriptions : List<Transcriptions>,
	@SerializedName("audio") val audio : Audio,
	@SerializedName("context") val context : Context
)