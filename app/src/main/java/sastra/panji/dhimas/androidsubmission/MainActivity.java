package sastra.panji.dhimas.androidsubmission;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private RecyclerView viewPokemon;
    private ArrayList<Pokemon> list = new ArrayList<>();
    Dialog detailsDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        detailsDialog = new Dialog(this);
        viewPokemon = findViewById(R.id.View_pokemon);
        viewPokemon.setHasFixedSize(true);
        list.addAll(PokemonItem.getListPokemon());

        pokemonList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.about, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.aboutMenu:
                tampilAbout();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void pokemonList() {
        viewPokemon.setLayoutManager(new LinearLayoutManager(this));
        ListPokemon listPokemonnya = new ListPokemon(list);
        viewPokemon.setAdapter(listPokemonnya);

        listPokemonnya.setOnItemClickCallback(new ListPokemon.OnItemClickCallback() {
            @Override
            public void onItemClicked(Pokemon pokemon) {
               // showSelectedHero(pokemon);
                Intent details = new Intent(MainActivity.this, Detailnya.class);
                details.putExtra("Foto",pokemon.getImages());
                details.putExtra("type1",pokemon.getType1());
                details.putExtra("nama",pokemon.getNames());
                details.putExtra("type2", pokemon.getType2());
                details.putExtra("desc",pokemon.getDeskripsi());
                startActivity(details);
            }
        });
    }

    private void showSelectedHero(Pokemon pokemon) {
        ImageView fotoPokemon;
        TextView namaPokemon;
        TextView txtClosed;
        detailsDialog.setContentView(R.layout.dialog_details);
        fotoPokemon = detailsDialog.findViewById(R.id.detailsFoto);
        namaPokemon = detailsDialog.findViewById(R.id.detailsNama);
        txtClosed = detailsDialog.findViewById(R.id.Close);
        namaPokemon.setText(pokemon.getNames());
        Glide.with(this)
                .load(pokemon.getImages())
                .apply(new RequestOptions().override(300, 300))
                .into(fotoPokemon);

        txtClosed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                detailsDialog.dismiss();
            }
        });
        detailsDialog.show();
    }

    private void tampilAbout() {
        Intent about = new Intent(MainActivity.this, About.class);
        startActivity(about);
    }

    private void tampilDetails() {


    }

}
