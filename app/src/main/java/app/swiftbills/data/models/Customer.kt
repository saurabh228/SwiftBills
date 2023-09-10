package app.swiftbills.data.models

import com.google.firebase.firestore.IgnoreExtraProperties

@IgnoreExtraProperties
data class Customer(
    val name: String = "",
    val address: String = "",
    val phone: String = "",
    val email: String = ""
) : BaseModel() {

    fun getCompleteAddress(): String {
        return "$address\nphone: $phone\nemail: $email"
    }
}