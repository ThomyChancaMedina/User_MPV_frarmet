package com.example.thomychanca.finalthomy.util;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.realm.Realm;
import io.realm.RealmConfiguration;

import com.example.thomychanca.finalthomy.R;
import com.example.thomychanca.finalthomy.util.adapter.SectionsPagerAdapter;
import com.facebook.stetho.Stetho;

import com.example.thomychanca.finalthomy.util.logging.CrashRepostingTree;
import com.facebook.stetho.Stetho;
import com.uphyca.stetho_realm.RealmInspectorModulesProvider;

import timber.log.Timber;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements MainView {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.tabs)
    TabLayout tabs;
    @BindView(R.id.appbar)
    AppBarLayout appbar;
    @BindView(R.id.vp_container)
    ViewPager vpContainer;
    @BindView(R.id.fab)
    FloatingActionButton fab;
    @BindView(R.id.main_content)
    CoordinatorLayout mainContent;

    private SectionsPagerAdapter mSectionsPagerAdapter;

    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        presenter = new MainPresenterImpl(this);
        setSupportActionBar(toolbar);
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        vpContainer.setAdapter(mSectionsPagerAdapter);

        setupTabs();
    }

    private void setupTabs() {
        List<Integer> icons = new ArrayList<>();
        icons.add(2);
        icons.add(1);
        icons.add(3);
     /*   icons.add(R.drawable.ic_toolbar_user);
        icons.add(R.drawable.ic_toolbar_user);
        icons.add(R.drawable.ic_toolbar_user);*/
        tabs.setupWithViewPager(vpContainer);
        for (int i = 0; i < tabs.getTabCount(); i++) {
            if (icons.get(i) != null) {
                tabs.getTabAt(i).setIcon(icons.get(i));
            }
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @OnClick(R.id.fab)
    public void onFabClicked() {
        Timber.i("e[_] Funciona el mvp");
    }

}