package com.capps.kotlinpractica


import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isInvisible
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.capps.kotlinpractica.databinding.ViewMediaItemBinding
import kotlinx.android.synthetic.main.view_media_item.view.*



class MediaAdapter(private val items: List<MediaItem>, private val listener: (MediaItem) -> Unit):
    RecyclerView.Adapter<MediaAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      val view = parent.inflate(R.layout.view_media_item)

      return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)

        holder.itemView.setOnClickListener { listener(item) }
    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){

        private val binding = ViewMediaItemBinding.bind(view)

        fun bind(mediaItem: MediaItem) {

            with(binding){

                mediatitle.text = mediaItem.title

                mediathumb.loadUrl(mediaItem.url)

                mediaVideoIndicator.visibility = when(mediaItem.type){
                    MediaItem.Type.PHOTO -> View.GONE
                    MediaItem.Type.VIDEO -> View.VISIBLE
                }
            }


            itemView.setOnClickListener{
                showToast("Hola")
            }


        }
    }
}