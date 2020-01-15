package com.example.sampletranscript.data

import com.google.gson.annotations.SerializedName

data class Interpretations (

	@SerializedName("lemma") val lemma : String,
	@SerializedName("normalizedLemmas") val normalizedLemmas : List<NormalizedLemmas>,
	@SerializedName("partOfSpeech") val partOfSpeech : String,
	@SerializedName("grammar") val grammar : List<Grammar>
)