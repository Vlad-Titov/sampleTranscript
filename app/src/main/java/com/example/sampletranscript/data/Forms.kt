package com.example.sampletranscript.data

import com.google.gson.annotations.SerializedName

data class Forms (

	@SerializedName("form") val form : String,
	@SerializedName("grammar") val grammar : List<Grammar>
)