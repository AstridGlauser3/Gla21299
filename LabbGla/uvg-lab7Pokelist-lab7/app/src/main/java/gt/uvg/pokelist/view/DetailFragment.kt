package gt.uvg.pokelist.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import gt.uvg.pokelist.databinding.FragmentDetailBinding
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.squareup.picasso.Picasso


class DetailFragment : Fragment() {
    val arg: DetailFragmentArgs by navArgs()
    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        Picasso.get().load(arg.front).into(binding.imageView2)
        Picasso.get().load(arg.back).into(binding.imageView3)
        Picasso.get().load(arg.backShiny).into(binding.imageView5)
        Picasso.get().load(arg.frontShiny).into(binding.imageView4)
   binding.progressBar2.visibility = View.GONE
        binding.DertailLayout.visibility = View.VISIBLE

    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}