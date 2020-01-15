package com.example.sampletranscript.data

import com.google.gson.annotations.SerializedName

data class Lexemes (

	@SerializedName("lemma") val lemma : String,
	@SerializedName("partOfSpeech") val partOfSpeech : String,
	@SerializedName("senses") val senses : List<Senses>,
	@SerializedName("forms") val forms : List<Forms>
)