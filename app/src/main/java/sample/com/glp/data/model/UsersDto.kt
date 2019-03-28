package sample.com.glp.data.model

import com.google.gson.annotations.SerializedName

data class UsersDto(
    @SerializedName("data") val results: MutableList<ListModel>
)