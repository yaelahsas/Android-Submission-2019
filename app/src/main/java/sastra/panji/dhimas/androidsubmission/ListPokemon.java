package sastra.panji.dhimas.androidsubmission;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListPokemon extends RecyclerView.Adapter<ListPokemon.ListViewHolder> {
    private OnItemClickCallback onItemClickCallback;
    private ArrayList<Pokemon> listPokemon;

    public ListPokemon(ArrayList<Pokemon> list) {
        this.listPokemon = list;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_pokemon, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Pokemon pokemon = listPokemon.get(position);
        Glide.with(holder.itemView.getContext())
                .load(pokemon.getImages())
                .apply(new RequestOptions().override(300, 300))
                .into(holder.imgPhoto);
        holder.tvName.setText(pokemon.getNames());
        holder.tvType1.setText(pokemon.getType1());


        holder.tvType2.setText(pokemon.getType2());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listPokemon.get(holder.getAdapterPosition()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return listPokemon.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName;
        TextView tvType1;
        TextView tvType2;

        //For Details
        ImageView dtlimgPhoto;
        TextView dtltvName;
        TextView dtltvType1;
        TextView dtltvType2;
        TextView dtlDesc;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tmp_name);
            tvType1 = itemView.findViewById(R.id.typePokemon);
            tvType2 = itemView.findViewById(R.id.typePokemon2);

            //For Details

            dtlimgPhoto = itemView.findViewById(R.id.detailsFoto);
            dtltvName = itemView.findViewById(R.id.detailsNama);
            dtltvType1 = itemView.findViewById(R.id.dtl_typePokemon);
            dtltvType2 = itemView.findViewById(R.id.dtl_typePokemon2);
            dtlDesc = itemView.findViewById(R.id.IsiDeskripsi);

        }
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public interface OnItemClickCallback {
        void onItemClicked(Pokemon data);
    }


}
