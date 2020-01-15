package com.example.sampletranscript.data

import com.google.gson.annotations.SerializedName

data class Context (

	@SerializedName("regions") val regions : List<String>
)