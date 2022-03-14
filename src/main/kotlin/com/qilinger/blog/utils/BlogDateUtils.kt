package com.qilinger.blog.utils


import java.util.*

class BlogDateUtils {

    public fun reduce(cur: Date, last: Date): String {
        val t = cur.time - last.time
        val day: Long = t / (24 * 60 * 60 * 1000)
        val hour: Long = t / (60 * 60 * 1000) - day * 24
        val min: Long = t / (60 * 1000) - day * 24 * 60 - hour * 60
        val s: Long = t / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60
        val result = "相差了" + day + "天" + hour + "小时" + min + "分钟" + s + "秒"
        return result
    }
}