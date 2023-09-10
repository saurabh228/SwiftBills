package app.swiftbills.data.models

import app.swiftbills.data.utils.currentDateTime
import com.google.firebase.firestore.Exclude

abstract class BaseModel(
    @get:Exclude
    open var id: String = ""
) {
    var createdAt: Long = currentDateTime
    var updatedAt: Long = currentDateTime
}