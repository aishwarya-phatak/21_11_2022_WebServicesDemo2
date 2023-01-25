package com.example.a21_11_2022_webservicesdemo2

import android.util.Log
import com.google.gson.Gson
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

class WebUtil {
    companion object{
        fun getUsers(pageNumber : Int) :UsersResponse{
            var getUserApiURL = URL("https://reqres.in/api/users?page=$pageNumber")
            var httpURLConnection = getUserApiURL.openConnection() as HttpURLConnection
            httpURLConnection.requestMethod = "GET"
            httpURLConnection.connect()

            var resReader = InputStreamReader(httpURLConnection.inputStream)
            var gson = Gson()
            var usersResponse = gson.fromJson<UsersResponse>(
                resReader,
                UsersResponse::class.java
            )

            Log.e("tag",usersResponse.toString())

            for(eachUser in usersResponse.users){
                Log.e("tag","Each User --$eachUser")
            }
            return usersResponse
        }
    }
}