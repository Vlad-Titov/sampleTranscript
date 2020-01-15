package com.example.sampletranscript.data

import com.google.gson.annotations.SerializedName

data class Transcript (

	@SerializedName("entries") val entries : List<Entries>
)