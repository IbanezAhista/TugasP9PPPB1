package ibanez.pppb1.tugasp9pppb1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import ibanez.pppb1.tugasp9pppb1.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val movie = Movie(
            movieTitle = intent.getStringExtra("MOVIE_TITLE") ?: "",
            movieDuration = intent.getStringExtra("MOVIE_DURATION") ?: "",
            movieAgeRating = intent.getStringExtra("MOVIE_AGE_RATING") ?: "",
            movieGenre = intent.getStringExtra("MOVIE_GENRE") ?: "",
            movieSynopsis = intent.getStringExtra("MOVIE_SYNOPSIS") ?: "",
            moviePoster = intent.getIntExtra("MOVIE_POSTER", R.drawable.venom_poster)
        )

        binding.moviePoster.setImageResource(movie.moviePoster)
        binding.txtMovieTitle.text = movie.movieTitle
        binding.txtMovieGenre.text = "${movie.movieGenre}"
        binding.txtMovieDuration.text = "${movie.movieDuration}"
        binding.txtMovieAge.text = "${movie.movieAgeRating}"
        binding.txtMovieSynopsis.text = movie.movieSynopsis

        binding.icBack.setOnClickListener {
            onBackPressed()
        }
    }
}
