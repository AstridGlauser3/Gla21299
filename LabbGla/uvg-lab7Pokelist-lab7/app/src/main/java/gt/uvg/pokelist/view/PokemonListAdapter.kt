package gt.uvg.pokelist.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import androidx.navigation.findNavController
import gt.uvg.pokelist.databinding.ItemPokemonViewBinding
import gt.uvg.pokelist.model.Pokemon
import gt.uvg.pokelist.model.PokemonInit


class PokemonListAdapter(private var pokemonList: List<PokemonInit>  ) : RecyclerView.Adapter<PokemonListAdapter.PokemonListHolder>() {

    inner class PokemonListHolder(val binding: ItemPokemonViewBinding) : RecyclerView.ViewHolder(binding.root){
        var name = binding.pokemonName ;
        var foto = binding.pokemonPhoto;
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonListHolder {
        val binding = ItemPokemonViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PokemonListHolder(binding)
    }

    override fun onBindViewHolder(holder: PokemonListHolder, position: Int) {
        val item = pokemonList.get(position)
        holder.name.text = item.name;
        val temppokemon = Pokemon(position +1,item.name)
        Picasso.get().load(temppokemon.imageUrlFront).resize(100,100)
            .into(holder.foto)
        holder.itemView.setOnClickListener {
            val action =
                MainFragmentDirections.actionMainFragmentToDetailFragment(temppokemon.imageUrlShinnyFront,temppokemon.imageUrlShinnyBack,temppokemon.imageUrlFront,temppokemon.imageUrlBack)
            holder.binding.root.findNavController()
                .navigate(action)
        }
    }

    override fun getItemCount(): Int {
        return pokemonList.size
    }
}