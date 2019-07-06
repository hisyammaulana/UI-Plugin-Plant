package app.plugin.pluginplants;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetailWikiActivity extends AppCompatActivity {

    private ImageView backPress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_wiki);

        backPress =  findViewById(R.id.backPress);
        backPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a =  new Intent(DetailWikiActivity.this, MainActivity.class);
                startActivity(a);
            }
        });
    }
}
