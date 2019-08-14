package sastra.panji.dhimas.androidsubmission;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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

   private void tampilAbout(){
        Intent about = new Intent(MainActivity.this, About.class);
        startActivity(about);
    }

}
