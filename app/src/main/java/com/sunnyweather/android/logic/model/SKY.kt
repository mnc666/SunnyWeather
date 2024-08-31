package com.sunnyweather.android.logic.model

import com.sunnyweather.android.R

class SKY (val info:String ,val icon : Int, val bg: Int)

private val sky = mapOf(
    "CLEAR_DAY" to SKY("晴", R.drawable.qt2,R.drawable.qt1 ),
    "CLEAR_NIGHT" to SKY("晴", R.drawable.qt2,R.drawable.qt1 ),
    "PARTLY_CLOUDY_DAY" to SKY("多云", R.drawable.dy2,R.drawable.dy1 ),
    "PARTLY_CLOUDY_NIGHT" to SKY("多云", R.drawable.dy2,R.drawable.dy1 ),
    "CLOUDY" to SKY("阴", R.drawable.yt2,R.drawable.yt1 ),
    "WIND" to SKY("大风", R.drawable.df2,R.drawable.df1),
    "LIGHT_RAIN" to SKY("小雨", R.drawable.xy2,R.drawable.xy1),
    "MODERATE_RAIN" to SKY("中雨", R.drawable.zy2,R.drawable.zy1),
    "HEAVY_RAIN" to SKY("大雨", R.drawable.day2,R.drawable.day1),
    "STORM_RAIN" to SKY("暴雨", R.drawable.by2,R.drawable.by1),
    "THUNDER_SHOWER" to SKY("雷阵雨", R.drawable.lzy2,R.drawable.lzy1),
    "SLEET" to SKY("雨夹雪", R.drawable.yjx2,R.drawable.yjx1),
    "LIGHT_SNOW" to SKY("小雪", R.drawable.xx2,R.drawable.xx1),
    "MODERATE_SNOW" to SKY("中雪", R.drawable.zx2,R.drawable.zx1),
    "HEAVY_SNOW" to SKY("大雪", R.drawable.dx2,R.drawable.dx1),
    "STORM_SNOW" to SKY("暴雨", R.drawable.bx2,R.drawable.dx1),
    "HAIL" to SKY("冰雹", R.drawable.bb2,R.drawable.bb1),
    "LIGHT_HAZE" to SKY("轻度雾霾", R.drawable.wm2,R.drawable.wa1),
    "MODERATE_HAZE" to SKY("中度雾霾", R.drawable.wm2,R.drawable.wa1),
    "HEAVY_HAZE" to SKY("大度雾霾", R.drawable.wm2,R.drawable.wa1),
    "FOG" to SKY("雾", R.drawable.w2,R.drawable.w1),
    "DUST" to SKY("浮尘", R.drawable.fc2,R.drawable.fc1),
)

fun getSky(skycon: String) :SKY{
    return sky[skycon] ?: sky["CLEAR_DAY"]!!
}