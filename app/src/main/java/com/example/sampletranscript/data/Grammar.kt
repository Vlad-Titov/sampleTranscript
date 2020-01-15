package com.example.sampletranscript.data

import com.google.gson.annotations.SerializedName

data class Grammar (

	@SerializedName("person") val person : List<String>,
	@SerializedName("number") val number : List<String>,
	@SerializedName("verbForm") val verbForm : List<String>,
	@SerializedName("tense") val tense : List<String>,
	@SerializedName("mood") val mood : List<String>
)