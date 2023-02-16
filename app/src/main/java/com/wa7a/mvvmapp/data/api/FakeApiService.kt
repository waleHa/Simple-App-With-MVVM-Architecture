package com.wa7a.mvvmapp.data.api

import com.wa7a.mvvmapp.data.model.Wisdom
import kotlin.random.Random

class FakeApiService {
    private val wisdomList = listOf<Wisdom>(
        Wisdom("To do two things at once is to do neither.", "Publilius Syrus"),
        Wisdom("Storms don't last forever.", "Unknown"),
        Wisdom(
            "Success is stumbling from failure to failure with no loss of enthusiasm.",
            "Winston Churchill",
        )
    )

    fun getRandomWisdom(): Wisdom {
        val random = Random.nextInt(0,wisdomList.size)
//            (Math.random() * wisdomList.size).toInt()
        return wisdomList[random]
    }

//    val client = OkHttpClient()
//    private fun makeJokeRequestUsingOKHTTP(context: Context) {
//        val request = Request.Builder().url("https://zenquotes.io/api/random").build()
//        OkHttpClient().newCall(request).enqueue(object : Callback {
//            override fun onFailure(call: Call, e: IOException) {
//                Toast.makeText(context, "Fail: ${e.message}", Toast.LENGTH_LONG).show()
//            }
//            override fun onResponse(call: Call, response: Response):Wisdom {
//                val jsonString = response.body?.string().toString()
//               return Gson().fromJson(jsonString,Wisdom::class.java)
//            }
//        })
//    }
}