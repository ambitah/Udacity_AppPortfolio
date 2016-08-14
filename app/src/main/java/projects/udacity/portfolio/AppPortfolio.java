package projects.udacity.portfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AppPortfolio extends AppCompatActivity {

    Button popularMovies;
    Button stockHawk;
    Button buildBigger;
    Button appMaterial;
    Button goUbiquitous;
    Button capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_portfolio);

        popularMovies = (Button) findViewById(R.id.button_popular_movies);
        stockHawk = (Button) findViewById(R.id.stock_hawk);
        buildBigger = (Button) findViewById(R.id.build_it_bigger);
        appMaterial = (Button) findViewById(R.id.app_material);
        goUbiquitous = (Button) findViewById(R.id.go_ubiquitous);
        capstone = (Button) findViewById(R.id.capstone);
    }

    public void onPopClicked(View v){
        Toast.makeText(AppPortfolio.this, "This button launches Popular Movies App", Toast.LENGTH_SHORT).show();
    }

    public void onStockClicked(View v){
        Toast.makeText(AppPortfolio.this, "This button launches Stock Hawk App", Toast.LENGTH_SHORT).show();
    }

    public void onBuildClicked(View v){
        Toast.makeText(AppPortfolio.this, "This button launches Build It Bigger App", Toast.LENGTH_SHORT).show();
    }

    public void onMaterialClicked(View v){
        Toast.makeText(AppPortfolio.this, "This button launches Make Your App Material App", Toast.LENGTH_SHORT).show();
    }

    public void onUbiClicked(View v){
        Toast.makeText(AppPortfolio.this, "This button launches Go Ubiquitous App", Toast.LENGTH_SHORT).show();
    }

    public void onCapstoneClicked(View v){
        Toast.makeText(AppPortfolio.this, "This button launches Capstone App", Toast.LENGTH_SHORT).show();
    }
}
