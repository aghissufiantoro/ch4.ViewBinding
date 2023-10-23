package com.example.ch4.model

import com.google.firebase.auth.FirebaseUser
import java.net.URL

data class User(
    val fullName: String,
    val photoUrl: String,
    val email: String
)

fun FirebaseUser?.toUser(): User? = if (this != null) User(
    fullName = this.displayName.orEmpty(),
    photoUrl = this.photoUrl.toString(),
    email = this.email.orEmpty(),
) else null