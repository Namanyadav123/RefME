package io.app.hasura.imad.namanyadav123.mydtu;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewConfiguration;

import java.lang.reflect.Field;

public class HomeActivity extends AppCompatActivity {
    private static final String TAG = "HomeActivity";
    private SectionPageAdapter mSectionPageAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG, "onCreate:Starting.");

        mSectionPageAdapter = new SectionPageAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        try {
            ViewConfiguration config = ViewConfiguration.get(this);
            Field menuKeyField = ViewConfiguration.class.getDeclaredField("sHasPermanentMenuKey");
            if(menuKeyField != null) {
                menuKeyField.setAccessible(true);
                menuKeyField.setBoolean(config, false);
            }
        } catch (Exception ex) {
            // Ignore
        }
    }


    private void setupViewPager(ViewPager viewPager) {

        SectionPageAdapter adapter = new SectionPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new FirstFragment(), "COURSES");
        adapter.addFragment(new SecondFragment(), "DTU MAPS");
        adapter.addFragment(new ThirdFragment(), "CALENDAR");
        adapter.addFragment(new CreditsFragment(), "DTU MESS");
        viewPager.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {


        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        int id = item.getItemId();

        switch (id) {

            case R.id.dtu:


                        String url2 = "http://www.dtu.ac.in/Web/About/history.php/";
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url2));
                        startActivity(i);
                          break;



            case R.id.dtu2:
                Intent i1=new Intent(HomeActivity.this,Developers.class);
                startActivity(i1);
                break;

            case R.id.dtu3:
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_SUBJECT,"Developer Mail ID:- namy86.dtu@gmail.com");

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
                break;
        }

        return true;
    }
//    FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//    fab.setOnClickListener(View.OnClickListener(){
//@Override
//        public void onClick(View view) {
//            Intent Email = new Intent(Intent.ACTION_SEND);
//            Email.setType("text/email");
//            Email.putExtra(Intent.EXTRA_EMAIL,
//                    new String[]{"namanyadav0007@gmail.com"});  //developer 's email
//            Email.putExtra(Intent.EXTRA_SUBJECT,
//                    "Query/Complain"); // Email 's Subject
//            Email.putExtra(Intent.EXTRA_TEXT, "Dear Naman Yadav," + "");  //Email 's Greeting text
//            startActivity(Intent.createChooser(Email, "Send Feedback:"));
//        }
//    });


    }