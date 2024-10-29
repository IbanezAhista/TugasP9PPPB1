package ibanez.pppb1.tugasp9pppb1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ibanez.pppb1.tugasp9pppb1.databinding.ItemDetailBinding
import ibanez.pppb1.tugasp9pppb1.databinding.ItemMovieBinding

class DetailAdapter(private val movieDetails: List<String>) : RecyclerView.Adapter<DetailAdapter.DetailViewHolder>() {

    inner class DetailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val txtDetail: TextView = itemView.findViewById(R.id.txt_movie_synopsis)

        fun bind(detail: String) {
            txtDetail.text = detail
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_detail, parent, false)
        return DetailViewHolder(view)
    }

    override fun onBindViewHolder(holder: DetailViewHolder, position: Int) {
        holder.bind(movieDetails[position])
    }

    override fun getItemCount(): Int {
        return movieDetails.size
    }
}
