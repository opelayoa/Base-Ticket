package mx.com.tiendas3b.ticketdoctorexpress.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import mx.com.tiendas3b.ticketdoctorexpress.R;
import mx.com.tiendas3b.ticketdoctorexpress.utils.Tools;

public class MainActivity extends AppCompatActivity {

    protected TabLayout tabLayout;
    protected final static int FRAGMENT_NEW_TICKET = 1;
    protected final static int FRAGMENT_SEARCH_TICKET = 2;

    protected  static Typeface typeface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initToolbar();
        initComponent();

    }

    private void initToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_menu);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Ticket Doctor Express");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Tools.setSystemBarColor(this);



    }

    private void initComponent() {
        ViewPager viewPager = findViewById(R.id.view_pager);
        setupViewPager(viewPager);

        tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        SectionsPagerAdapter adapter = new SectionsPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(PlaceholderFragment.newInstance(1), getResources().getString(R.string.ic_plus_circle));
        adapter.addFragment(PlaceholderFragment.newInstance(2), getResources().getString(R.string.ic_list));
        viewPager.setAdapter(adapter);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        } else {
            Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    public static class PlaceholderFragment extends Fragment {
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_tabs_basic, container, false);
            Button go = rootView.findViewById(R.id.go);
            go.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getActivity(), CreateTicketActivity.class);
                    getActivity().startActivity(intent);
                }
            });
            int sectionNumber = getArguments().getInt(ARG_SECTION_NUMBER);
            configureRedFragment(rootView, sectionNumber);
            return rootView;
        }

        @SuppressLint("WrongViewCast")
        private void configureRedFragment(View rootView, int sectionNumber) {
            int red = getResources().getColor(R.color.colorPrimary);
            int white = getResources().getColor(R.color.white);
            Drawable backgroundWhite =  getResources().getDrawable(R.drawable.background_rounded);
            Drawable backgroundRed =  getResources().getDrawable(R.drawable.background_rounded_primary);

            if ((sectionNumber % 2) == 0) {
                rootView.findViewById(R.id.layout).setBackgroundColor(getResources().getColor(R.color.white));
                ((AppCompatTextView) rootView.findViewById(R.id.icon)).setTextColor(red);
                ((AppCompatTextView) rootView.findViewById(R.id.title)).setText("Lista de tickets");
                ((AppCompatTextView) rootView.findViewById(R.id.title)).setTextColor(red);
                rootView.findViewById(R.id.go).setBackground(backgroundRed);
                Button go = rootView.findViewById(R.id.go);
                go.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Intent intent = new Intent(MainActivity.this, CreateTicketActivity.class);
                        // startActivity(intent);

                    }
                });
                go.setTextColor(white);

            } else {
                rootView.findViewById(R.id.layout).setBackgroundColor(red);
                ((AppCompatTextView) rootView.findViewById(R.id.icon)).setTextColor(white);
                ((AppCompatTextView) rootView.findViewById(R.id.title)).setText("Crear tickets");
                ((AppCompatTextView) rootView.findViewById(R.id.title)).setTextColor(white);

            }
        }
    }

    private class SectionsPagerAdapter extends FragmentPagerAdapter {

        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public SectionsPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}
