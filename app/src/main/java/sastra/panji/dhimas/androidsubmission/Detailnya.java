package sastra.panji.dhimas.androidsubmission;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class Detailnya extends AppCompatActivity {

    private Pokemon pokemon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailnya);
        ActionBar actionBar = getSupportActionBar();

        actionBar.setTitle("Details");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Intent intent = getIntent();
        ImageView dtl_foto = findViewById(R.id.detailsFoto);
        TextView dtl_name = findViewById(R.id.detailsNama);
        TextView dtl_type1 = findViewById(R.id.dtl_typePokemon);
        TextView dtl_type2 = findViewById(R.id.dtl_typePokemon2);
        TextView isiDeskripsi = findViewById(R.id.IsiDeskripsi);

        Glide.with(this)
                .load(intent.getStringExtra("Foto"))
                .apply(new RequestOptions().override(300, 300))
                .into(dtl_foto);
        dtl_name.setText(intent.getStringExtra("nama"));
        dtl_type1.setText(intent.getStringExtra("type1"));
        if (intent.getStringExtra("type2").equals("")) {
            dtl_type2.setVisibility(View.INVISIBLE);
        } else {
            dtl_type2.setText(intent.getStringExtra("type2"));
        }
        isiDeskripsi.setText(intent.getStringExtra("desc"));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                this.finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
