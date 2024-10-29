package ibanez.pppb1.tugasp9pppb1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import ibanez.pppb1.tugasp9pppb1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapterMovie = MovieAdapter(this, generateDummy()) { movie ->
            val intent = Intent(this, SecondActivity::class.java).apply {
                putExtra("MOVIE_TITLE", movie.movieTitle)
                putExtra("MOVIE_DURATION", movie.movieDuration)
                putExtra("MOVIE_AGE_RATING", movie.movieAgeRating)
                putExtra("MOVIE_GENRE", movie.movieGenre)
                putExtra("MOVIE_SYNOPSIS", movie.movieSynopsis)
                putExtra("MOVIE_POSTER", movie.moviePoster)
            }
            startActivity(intent)

        }

        binding.rvMovie.apply {
            adapter = adapterMovie
            layoutManager = GridLayoutManager(this@MainActivity, 2)
        }
    }

    private fun generateDummy(): List<Movie> {
        return listOf(
            Movie(
                movieTitle = "Venom",
                movieDuration = "1h 52m",
                movieGenre = "Action",
                movieAgeRating = "13+",
                movieSynopsis = "Journalist Eddie Brock is trying to take down Carlton Drake, the notorious and brilliant founder of the Life Foundation. While investigating one of Drake's experiments, Eddie's body merges with the alien Venom -- leaving him with superhuman strength and power. Twisted, dark and fueled by rage, Venom tries to control the new and dangerous abilities that Eddie finds so intoxicating.",
                moviePoster = R.drawable.venom_poster
            ),
            Movie(
                movieTitle = "Inside Out 2",
                movieDuration = "1h 36m",
                movieGenre = "Animation",
                movieAgeRating = "SU",
                movieSynopsis = "Joy, Sadness, Anger, Fear and Disgust have been running a successful operation by all accounts. However, when Anxiety shows up, they aren't sure how to feel.",
                moviePoster = R.drawable.inside_out_2_poster
            ),
            Movie(
                movieTitle = "Sumala",
                movieDuration = "1h 53m",
                movieGenre = "Horror",
                movieAgeRating = "17+",
                movieSynopsis = "Sumala adalah nama yang ditakuti oleh penduduk di sebuah desa di Kabupaten Semarang. Pada tahun 1948, Sulastri, seorang istri kaya yang putus asa karena belum dikaruniai anak, membuat perjanjian dengan iblis untuk bisa hamil. Ia melahirkan anak kembar, tetapi suaminya, Soedjiman, membunuh salah satu bayi yang cacat dan buruk rupa, melanggar perjanjian tersebut. Akibatnya, anak yang selamat, Kumala, tumbuh dengan kondisi cacat dan mengalami perlakuan buruk dari orang-orang di sekitarnya. Hingga akhirnya, Sumala, kembaran Kumala yang telah mati, kembali untuk membalas dendam pada mereka yang telah menyakiti Kumala.",
                moviePoster = R.drawable.sumala_poster
            ),
            Movie(
                movieTitle = "Ancika 1995",
                movieDuration = "1h 40m",
                movieGenre = "Romance",
                movieAgeRating = "13+",
                movieSynopsis = "Ancika Mehrunisa Rabu, merupakan siswi kelas 3 SMA yang terobsesi dengan pendidikan dan ilmu pengetahuan. Kehidupannya lebih banyak dihabiskan dengan belajar, dan mengerjakan tugas di rumah. Ancika merasa kehidupan remaja seperti teman-temannya tidak cocok baginya, hingga Ia bertemu dengan Dilan.",
                moviePoster = R.drawable.ancika_poster
            )
        )
    }
}
