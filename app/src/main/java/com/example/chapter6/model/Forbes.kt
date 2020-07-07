package com.example.chapter6.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Forbes (
    var name: String = "",
    var description: String = "",
    var photo: Int = 0
) : Parcelable