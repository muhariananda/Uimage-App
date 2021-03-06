package id.muhariananda.uimage.data.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ProfileImageUrl(
    val large: String,
    val medium: String,
    val small: String
): Parcelable