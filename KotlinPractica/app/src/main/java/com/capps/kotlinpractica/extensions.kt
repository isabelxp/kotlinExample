package com.capps.kotlinpractica

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


//--------- Funcion de extensiones ------
//--- no tienes que usar dos constructores

fun Context.showToast(text: String, length: Int = Toast.LENGTH_SHORT){
    Toast.makeText(this, text, length).show()
}

fun RecyclerView.ViewHolder.showToast(message: String){
    itemView.context.showToast(message)
}

fun ImageView.loadUrl(url:String){
    Glide.with(this).load(url).into(this)
}


fun ViewGroup.inflate(@LayoutRes layoutRes: Int): View{
    return   LayoutInflater
            .from(context)
            .inflate(R.layout.view_media_item, this, false)

}

// Reified +- tipo object en java
// Uso en actividad startActiviy<MainActivity>()

//​Las funciones inline sustituyen la llamada
// a una función por el contenido de esa función cuando el código compila y se genera el bytecode.

inline fun <reified T : Activity> Context.startActivity(){
    val intent = Intent(this, T::class.java)
    startActivity(intent)
}


