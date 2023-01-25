package com.example.a21_11_2022_webservicesdemo2

import android.os.AsyncTask

class WebThread : AsyncTask<Any?,Any?,UsersResponse?>() {
    override fun doInBackground(vararg params: Any?): UsersResponse? {
        return WebUtil.getUsers(1)
    }

    override fun onPostExecute(result: UsersResponse?) {
        super.onPostExecute(result)
    }
}