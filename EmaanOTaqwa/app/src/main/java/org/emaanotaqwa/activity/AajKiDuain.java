package org.emaanotaqwa.activity;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.emaanotaqwa.R;
import org.emaanotaqwa.common.DailyDuaPagerAdapter;

public class AajKiDuain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aaj_ki_duain);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        DailyDuaPagerAdapter cpa = new DailyDuaPagerAdapter(this);
        viewPager.setAdapter(cpa);
        viewPager.setCurrentItem(cpa.getCount()-1);
    }
}
