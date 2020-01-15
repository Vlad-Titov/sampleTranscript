package com.example.sampletranscript.data

import com.google.gson.annotations.SerializedName

data class Audio (

	@SerializedName("url") val url : String,
	@SerializedName("sourceUrl") val sourceUrl : String
)