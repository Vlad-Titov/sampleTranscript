package com.example.sampletranscript.data

import com.google.gson.annotations.SerializedName

data class NormalizedLemmas (

	@SerializedName("lemma") val lemma : String
)