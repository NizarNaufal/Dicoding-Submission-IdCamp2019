package id.dicodingbeasiswa.pemainbola.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import id.dicodingbeasiswa.pemainbola.R;
import id.dicodingbeasiswa.pemainbola.adapter.PemainListAdapter;
import id.dicodingbeasiswa.pemainbola.datum.BolaDatum;
import id.dicodingbeasiswa.pemainbola.model.BolaModule;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvPresiden;
    private ArrayList<BolaModule> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPresiden = findViewById(R.id.rvPresiden);
        rvPresiden.setHasFixedSize(true);
        list.addAll(BolaDatum.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvPresiden.setLayoutManager(new LinearLayoutManager(this));
        PemainListAdapter pemainListAdapter = new PemainListAdapter(list);
        rvPresiden.setAdapter(pemainListAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        setAbout(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setAbout(int selectedMode){
        switch (selectedMode){
            case R.id.action_about:
                aboutDev();
                break;
        }
    }
    public void aboutDev(){
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }

}