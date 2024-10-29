package ibanez.pppb1.tugasp9pppb1

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ibanez.pppb1.tugasp9pppb1.databinding.ItemMovieBinding

class MovieAdapter(
    private val context: Context,
    private val listMovie: List<Movie>,
    private val onItemClick: (Movie) -> Unit
) : RecyclerView.Adapter<MovieAdapter.ItemMovieViewHolder>() {

    inner class ItemMovieViewHolder(private val binding: ItemMovieBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(data: Movie) {
            with(binding) {
                txtMovieTitle.text = data.movieTitle
                txtMovieDuration.text = data.movieDuration
                txtMovieAge.text = data.movieAgeRating
                txtMovieGenre.text = data.movieGenre
                imgMoviePoster.setImageResource(data.moviePoster)

                itemView.setOnClickListener { onItemClick(data) }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemMovieViewHolder {
        val binding = ItemMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemMovieViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listMovie.size
    }

    override fun onBindViewHolder(holder: ItemMovieViewHolder, position: Int) {
        val movie = listMovie[position]
        holder.bind(movie)
    }
}
