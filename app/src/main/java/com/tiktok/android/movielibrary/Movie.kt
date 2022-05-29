package com.tiktok.android.movielibrary

import android.icu.number.IntegerWidth
import java.text.DecimalFormat

data class Movie(
    val adult: Boolean,
    val backdrop_path: String,
    val genre_ids: Array<String>,
    val id: String,
    val original_language: String,
    val original_title: String,
    val overview: String,
    val popularity: DecimalFormat,
    val poster_path: String,
    val release_date: String,
    val title: String,
    val video: Boolean,
    val vote_average: DecimalFormat,
    val vote_count: IntegerWidth
)
