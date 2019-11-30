package com.example.recipe

import com.google.firebase.database.Exclude


class RecipeSource{
    var imageUri : String? = null
    var name : String? = null
    var description: String? = null
    var materials : List<String>? = null

    constructor(description: String, imageUri: String, materials: List<String>, name: String) {
        this.description = description
        this.imageUri = imageUri
        this.materials = materials
        this.name = name
    }

    @Exclude
    fun toMap(): Map<String, Any?> {
        return mapOf(
            "imageUri" to imageUri,
            "name" to name,
            "description" to description,
            "materialsList" to materials
        )
    }

}


