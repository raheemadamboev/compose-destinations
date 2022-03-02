package xyz.teamgravity.composedestinations.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class UserModel(
    val mail: String,
    val userId: String,
    val password: Long
) : Parcelable
