package app.plugin.pluginplants;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import eu.long1.spacetablayout.SpaceTabLayout;

public class MainActivity extends AppCompatActivity{
    SpaceTabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(new ShopFragment());
        fragmentList.add(new HomeFragment());
        fragmentList.add(new WikiFragment());
        final CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.id.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (SpaceTabLayout) findViewById(R.id.spaceTabLayout);

        tabLayout.initialize(viewPager, getSupportFragmentManager(),
                fragmentList, savedInstanceState);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        tabLayout.saveState(outState);
        super.onSaveInstanceState(outState);
    }
}
