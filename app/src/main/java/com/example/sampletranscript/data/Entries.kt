package com.example.sampletranscript.data

import com.google.gson.annotations.SerializedName

data class Entries (

	@SerializedName("entry") val entry : String,
	@SerializedName("pronunciations") val pronunciations : List<Pronunciations>,
	@SerializedName("interpretations") val interpretations : List<Interpretations>,
	@SerializedName("lexemes") val lexemes : List<Lexemes>,
	@SerializedName("license") val license : License,
	@SerializedName("sourceUrls") val sourceUrls : List<String>
)