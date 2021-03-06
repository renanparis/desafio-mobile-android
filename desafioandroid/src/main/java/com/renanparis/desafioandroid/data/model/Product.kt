package com.renanparis.desafioandroid.data.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity
data class Product(
        
        @PrimaryKey
        val name: String = "",
        val quantity: Int = 0,
        val stock: Int = 0,
        val image_url: String = "",
        val price: Int = 0,
        val tax: Int = 0,
        val shipping: Int = 0,
        val description: String = ""
) : Parcelable