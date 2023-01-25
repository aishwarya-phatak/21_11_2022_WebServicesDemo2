package com.example.a21_11_2022_webservicesdemo2

import com.google.gson.annotations.SerializedName

class UsersResponse (
    @SerializedName("page")
    var pageNumber : Int,
    @SerializedName("per_page")
    var userPerPage : Int,
    @SerializedName("total")
    var userCount : Int,
    @SerializedName("total_pages")
    var totalPages : Int,
    @SerializedName("data")
    var users : ArrayList<User>
    )
{
    override fun toString(): String {
        return "page = $pageNumber -- userPerPage = $userPerPage -- userCount = $userCount -- totalPages = $totalPages"
    }
}