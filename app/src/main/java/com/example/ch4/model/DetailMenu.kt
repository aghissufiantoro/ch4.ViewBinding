package com.example.ch4.model

import android.os.Parcel
import android.os.Parcelable
import androidx.versionedparcelable.VersionedParcelize
import java.util.UUID

@VersionedParcelize
data class DetailMenu(
    val id: String? = UUID.randomUUID().toString(),
    val position: Int,
    val name: String?,
    val price: String?,
    val imgUrl: String?,
    val desc: String?
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(id)
        parcel.writeInt(position)
        parcel.writeString(name)
        parcel.writeString(price)
        parcel.writeString(imgUrl)
        parcel.writeString(desc)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<DetailMenu> {
        override fun createFromParcel(parcel: Parcel): DetailMenu {
            return DetailMenu(parcel)
        }

        override fun newArray(size: Int): Array<DetailMenu?> {
            return arrayOfNulls(size)
        }
    }
}