package sample.com.glp.data.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity
data class ListModel (
    @PrimaryKey(autoGenerate = true)

    @SerializedName("id")
    @Expose
    var id: Int? = null,
    @SerializedName("name")
    @Expose
    var name: String? = null,
    @SerializedName("username")
    @Expose
    var username: String? = null,
    @SerializedName("email")
    @Expose
    var email: String? = null,
    @SerializedName("address")
    @Expose
    var address: Address? = null,
    @SerializedName("phone")
    @Expose
    var phone: String? = null,
    @SerializedName("website")
    @Expose
    var website: String? = null,
    @SerializedName("company")
    @Expose
    var company: Company? = null

    )
data class Address (

    @SerializedName("street")
    @Expose
    var street: String? = null,
    @SerializedName("suite")
    @Expose
    var suite: String? = null,
    @SerializedName("city")
    @Expose
    var city: String? = null,
    @SerializedName("zipcode")
    @Expose
    var zipcode: String? = null,
    @SerializedName("geo")
    @Expose
    var geo: Geo? = null

    )


data class Company (

    @SerializedName("name")
    @Expose
    var name: String? = null,
    @SerializedName("catchPhrase")
    @Expose
    var catchPhrase: String? = null,
    @SerializedName("bs")
    @Expose
    var bs: String? = null

)


data class Geo (

    @SerializedName("lat")
    @Expose
    var lat: String? = null,
    @SerializedName("lng")
    @Expose
    var lng: String? = null

    )