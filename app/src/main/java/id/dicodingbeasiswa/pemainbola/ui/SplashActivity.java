package id.dicodingbeasiswa.pemainbola.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.greenfrvr.rubberloader.RubberLoaderView;
import id.dicodingbeasiswa.pemainbola.R;

public class SplashActivity extends AppCompatActivity {
    private int loading_guys= 4000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        ( (RubberLoaderView) findViewById(R.id.loader1)).startLoading();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },loading_guys);
    }
}
