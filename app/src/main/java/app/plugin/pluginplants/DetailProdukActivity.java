package app.plugin.pluginplants;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetailProdukActivity extends AppCompatActivity {

    private ImageView backPress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_produk);

        backPress = findViewById(R.id.backPress);
        backPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailProdukActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void addBeli(View view){
        Intent intent = new Intent(DetailProdukActivity.this, RegisterActivity.class);
        startActivity(intent);
    }

    public void addKeranjang(View view){
        Intent intent = new Intent(DetailProdukActivity.this, KeranjangActivity.class);
        startActivity(intent);
    }
}
