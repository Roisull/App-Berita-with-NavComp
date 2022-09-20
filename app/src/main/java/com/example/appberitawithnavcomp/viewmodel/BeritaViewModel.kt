package com.example.appberitawithnavcomp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.appberitawithnavcomp.R
import com.example.appberitawithnavcomp.model.ListImage
import com.example.appberitawithnavcomp.model.ModelBerita

class BeritaViewModel: ViewModel() {

    val listBerita : MutableLiveData<MutableList<ModelBerita>> = MutableLiveData()

    private val berita = "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur"
    private val berita2 = "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur"
    private val berita3 = "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur"

    // make list data from model ModelBerita.kt
    private val listDataBerita = mutableListOf(
        ModelBerita("berita 1", berita,"isul", "15/09/01", mutableListOf(ListImage(R.drawable.image_berita))),
        ModelBerita("berita 1", berita2,"isul", "15/09/01", mutableListOf(ListImage(R.drawable.image_berita))),
        ModelBerita("berita 1", berita3,"isul", "15/09/01", mutableListOf(ListImage(R.drawable.image_berita))),
        ModelBerita("berita 1", berita,"isul", "15/09/01", mutableListOf(ListImage(R.drawable.image_berita))),
        ModelBerita("berita 1", berita2,"isul", "15/09/01", mutableListOf(ListImage(R.drawable.image_berita))),
        ModelBerita("berita 1", berita3,"isul", "15/09/01", mutableListOf(ListImage(R.drawable.image_berita))),
        ModelBerita("berita 1", berita,"isul", "15/09/01", mutableListOf(ListImage(R.drawable.image_berita))),
        ModelBerita("berita 1", berita2,"isul", "15/09/01", mutableListOf(ListImage(R.drawable.image_berita))),
    )

    fun getData(){
        listBerita.value = listDataBerita
    }
}