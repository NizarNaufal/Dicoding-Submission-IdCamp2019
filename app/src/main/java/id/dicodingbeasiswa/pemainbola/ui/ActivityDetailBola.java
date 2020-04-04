package id.dicodingbeasiswa.pemainbola.ui;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import id.dicodingbeasiswa.pemainbola.R;

public class ActivityDetailBola extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_presiden);

        TextView dataName = findViewById(R.id.text_title);
        TextView dataDetail = findViewById(R.id.text_description);
        ImageView imageView = findViewById(R.id.image_content);

        Bundle bundle = this.getIntent().getExtras();

        String nama = getIntent().getStringExtra("text");
        String detail = getIntent().getStringExtra("detail");
        int img = bundle.getInt("photo");
        imageView.setImageResource(img);

        String textName = "" +nama;
        dataName.setText(textName);

        String textDetail = "" +detail;
        dataDetail.setText(textDetail);

    }
}
