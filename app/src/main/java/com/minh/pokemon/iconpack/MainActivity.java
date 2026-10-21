package com.minh.pokemon.iconpack;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "Pokemon Icon Pack đã sẵn sàng! Hãy áp dụng qua Launcher hoặc Theme Park.", Toast.LENGTH_LONG).show();
        finish();
    }
}
