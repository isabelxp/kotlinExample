package com.capps.kotlinpractica

data class MediaItem(val title: String, val url: String, val type: Type){
    enum class Type { PHOTO, VIDEO}
}

