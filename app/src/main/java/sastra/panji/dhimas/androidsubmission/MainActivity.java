package sastra.panji.dhimas.androidsubmission;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private RecyclerView viewPokemon;
    private ArrayList<Pokemon> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewPokemon= findViewById(R.id.View_pokemon);
        viewPokemon.setHasFixedSize(true);
        list.addAll(PokemonItem.getListPokemon());

        pokemonList();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.about, menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void pokemonList(){
        viewPokemon.setLayoutManager(new LinearLayoutManager(this));
        ListPokemon listPokemonnya = new ListPokemon(list);
        viewPokemon.setAdapter(listPokemonnya);

        listPokemonnya.setOnItemClickCallback(new ListPokemon.OnItemClickCallback() {
            @Override
            public void onItemClicked(Pokemon pokemon) {
                showSelectedHero(pokemon);
            }
        });
    }
    private void showSelectedHero(Pokemon pokemon) {
        Toast.makeText(this, "Kamu memilih " + pokemon.getNames(), Toast.LENGTH_SHORT).show();
    }

}
