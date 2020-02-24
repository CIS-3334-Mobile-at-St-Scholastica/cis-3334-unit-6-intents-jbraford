package css.cis3334.intentsperformances;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.GregorianCalendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btn1Web, but1Calendar, btn1Map;
    TextView textViewStatus;
    TextView textViewStatus2;
    TextView textViewStatus3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewStatus = (TextView) findViewById(R.id.textViewStatus);
        textViewStatus2 = (TextView) findViewById(R.id.textViewStatus2);
        textViewStatus3 = (TextView) findViewById(R.id.textViewStatus3);
        setupButtonClickEvents();
        setupButtonClickEvents2();
        setupButtonClickEvents3();



    }


    private void setupButtonClickEvents() {
        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        btn1Web = (Button) findViewById(R.id.button1WebInfo);
        btn1Web.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should display website for performance 1");
                Uri webpage = Uri.parse("http://www.css.edu/about/spotlight-arts-and-lectures.html");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                //check if there is an app to view web pages
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(webIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if (activities.size() > 0){      // found at least one app to view webpages
                    startActivity(webIntent);    // start that app
                }

            }
        });

        /**
         *   Set up button click event listener for the celendar button for the first performance
         *       Use the calendar intent to set an event reminder on the calendar
         */
        but1Calendar = (Button) findViewById(R.id.button1Calendar);
        but1Calendar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should set a calendar event for performance 1");
                Intent calIntent = new Intent(Intent.ACTION_INSERT);
                calIntent.setType("vnd.android.cursor.item/event");
                calIntent.putExtra(CalendarContract.Events.TITLE, "SAL Colloquium 'The Robot Next Door'");
                calIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Tower Hall 4119");
                GregorianCalendar begDate = new GregorianCalendar(2017, 2, 24, 3, 40);
                GregorianCalendar endDate = new GregorianCalendar(2017, 2, 24, 4, 40);
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                        begDate.getTimeInMillis());
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                        endDate.getTimeInMillis());
                //check if there is an app to process calendar info
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(calIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if (activities.size() > 0){      // found at least one app to process calendar
                    startActivity(calIntent);    // start that app
                }


            }
        });

        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        btn1Map = (Button) findViewById(R.id.button1map);
        btn1Map.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should display map for performance 1");
                // Map point based on address
                Uri location = Uri.parse("geo:0,0?q=1200 Kenwood Ave, Duluth, MN");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                //check if there is an app to view map
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(mapIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if (activities.size() > 0){      // found at least one app to view map
                    startActivity(mapIntent);    // start that app
                }

            }
        });



    }
    private void setupButtonClickEvents2() {
        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        btn1Web = (Button) findViewById(R.id.button1WebInfo2);
        btn1Web.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus2.setText("Code should display website for performance 2");
                Uri webpage = Uri.parse("http://www.css.edu/about/spotlight-arts-and-lectures/calendar.html?trumbaEmbed=eventid%3d140362933%26view%3devent%26-childview%3d");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                //check if there is an app to view web pages
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(webIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if (activities.size() > 0) {      // found at least one app to view webpages
                    startActivity(webIntent);    // start that app
                }

            }
        });

        /**
         *   Set up button click event listener for the celendar button for the first performance
         *       Use the calendar intent to set an event reminder on the calendar
         */
        but1Calendar = (Button) findViewById(R.id.button1Calendar2);
        but1Calendar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus2.setText("Code should set a calendar event for performance 2");
                Intent calIntent = new Intent(Intent.ACTION_INSERT);
                calIntent.setType("vnd.android.cursor.item/event");
                calIntent.putExtra(CalendarContract.Events.TITLE, "Building Beyond Bridges CSS Steel Band and World Drumming Ensemble'");
                calIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Mitchell Auditorium");
                GregorianCalendar begDate = new GregorianCalendar(2020, 2, 29, 7, 30);
                GregorianCalendar endDate = new GregorianCalendar(2020, 2, 29, 9, 30);
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                        begDate.getTimeInMillis());
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                        endDate.getTimeInMillis());
                //check if there is an app to process calendar info
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(calIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if (activities.size() > 0) {      // found at least one app to process calendar
                    startActivity(calIntent);    // start that app
                }


            }
        });

        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        btn1Map = (Button) findViewById(R.id.button1map2);
        btn1Map.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus.setText("Code should display map for performance 2");
                // Map point based on address
                Uri location = Uri.parse("geo:0,0?q=1200 Kenwood Ave, Duluth, MN");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                //check if there is an app to view map
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(mapIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if (activities.size() > 0) {      // found at least one app to view map
                    startActivity(mapIntent);    // start that app
                }

            }
        });
    }
    private void setupButtonClickEvents3() {
        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        btn1Web = (Button) findViewById(R.id.button1WebInfo3);
        btn1Web.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus3.setText("Code should display website for performance 3");
                Uri webpage = Uri.parse("http://www.css.edu/about/spotlight-arts-and-lectures/calendar.html?trumbaEmbed=eventid%3d142414440%26view%3devent%26-childview%3d");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                //check if there is an app to view web pages
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(webIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if (activities.size() > 0) {      // found at least one app to view webpages
                    startActivity(webIntent);    // start that app
                }

            }
        });

        /**
         *   Set up button click event listener for the celendar button for the first performance
         *       Use the calendar intent to set an event reminder on the calendar
         */
        but1Calendar = (Button) findViewById(R.id.button1Calendar3);
        but1Calendar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus3.setText("Code should set a calendar event for performance 3");
                Intent calIntent = new Intent(Intent.ACTION_INSERT);
                calIntent.setType("vnd.android.cursor.item/event");
                calIntent.putExtra(CalendarContract.Events.TITLE, "Thistles and Shamrocks");
                calIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Mitchell Auditorium");
                GregorianCalendar begDate = new GregorianCalendar(2020, 3, 6, 7, 0);
                GregorianCalendar endDate = new GregorianCalendar(2020, 3, 6, 9, 0);
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                        begDate.getTimeInMillis());
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                        endDate.getTimeInMillis());
                //check if there is an app to process calendar info
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(calIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if (activities.size() > 0) {      // found at least one app to process calendar
                    startActivity(calIntent);    // start that app
                }


            }
        });

        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        btn1Map = (Button) findViewById(R.id.button1map3);
        btn1Map.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                textViewStatus3.setText("Code should display map for performance 3");
                // Map point based on address
                Uri location = Uri.parse("geo:0,0?q=1200 Kenwood Ave, Duluth, MN");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                //check if there is an app to view map
                PackageManager packageManager = getPackageManager();
                List activities = packageManager.queryIntentActivities(mapIntent,
                        PackageManager.MATCH_DEFAULT_ONLY);
                if (activities.size() > 0) {      // found at least one app to view map
                    startActivity(mapIntent);    // start that app
                }

            }
        });
    }


}
