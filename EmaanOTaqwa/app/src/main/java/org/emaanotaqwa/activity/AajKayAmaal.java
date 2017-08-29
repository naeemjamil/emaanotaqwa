package org.emaanotaqwa.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import org.emaanotaqwa.R;

import java.util.Locale;

public class AajKayAmaal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Locale appLoc = new Locale("ur");
        Locale.setDefault(appLoc);
        Configuration appConfig = new Configuration();
        appConfig.locale = appLoc;
        getBaseContext().getResources().updateConfiguration(appConfig,
                getBaseContext().getResources().getDisplayMetrics());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aaj_kay_kmaal);
    }

    public void openAajKiDuain(View view) {
        Intent intent = new Intent(this, AajKiDuain.class);
        /*EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);*/
        startActivity(intent);
    }
}
