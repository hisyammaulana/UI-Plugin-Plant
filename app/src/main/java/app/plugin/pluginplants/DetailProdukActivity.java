package app.plugin.pluginplants;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DetailProdukActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_produk);
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
