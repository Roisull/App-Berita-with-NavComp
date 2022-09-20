package com.example.appberitawithnavcomp.model

data class ModelBerita(
    val judulBer: String,
    val descBer: String,
    val jurnalisBer: String,
    val tanggalBer: String,
    val image: MutableList<ListImage>
): java.io.Serializable

data class ListImage(
    val images: Int
): java.io.Serializable