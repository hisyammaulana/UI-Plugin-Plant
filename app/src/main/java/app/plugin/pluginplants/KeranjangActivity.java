package app.plugin.pluginplants;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class KeranjangActivity extends AppCompatActivity {

    private ImageView backPress;
    private Button beli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keranjang);

        beli = findViewById(R.id.beli);
        beli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KeranjangActivity.this, PengirimanActivity.class);
                startActivity(intent);
            }
        });

        backPress = (ImageView) findViewById(R.id.backPress);
        backPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KeranjangActivity.this, DetailProdukActivity.class);
                startActivity(intent);
            }
        });
    }

    public void beli(){

    }
}

