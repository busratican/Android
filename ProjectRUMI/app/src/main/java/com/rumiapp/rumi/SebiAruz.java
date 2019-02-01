package com.rumiapp.rumi;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SebiAruz extends AppCompatActivity {

    TextView tv_click_video;
    private Toast mToast;
    String urlAsString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sebi_aruz);

        tv_click_video = findViewById(R.id.tv_click);


        tv_click_video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                urlAsString = "https://www.youtube.com/watch?v=TJF0zmo5r4Q";
                openWebPage(urlAsString);
            }
        });
    }

    private void openWebPage(String url) {
        // COMPLETED (2) Use Uri.parse to parse the String into a Uri
        /*
         * We wanted to demonstrate the Uri.parse method because its usage occurs frequently. You
         * could have just as easily passed in a Uri as the parameter of this method.
         */
        Uri webpage = Uri.parse(url);
        // COMPLETED (3) Create an Intent with Intent.ACTION_VIEW and the webpage Uri as parameters
        /*
         * Here, we create the Intent with the action of ACTION_VIEW. This action allows the user
         * to view particular content. In this case, our webpage URL.
         */
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

        // COMPLETED (4) Verify that this Intent can be launched and then call startActivity
        /*
         * This is a check we perform with every implicit Intent that we launch. In some cases,
         * the device where this code is running might not have an Activity to perform the action
         * with the data we've specified. Without this check, in those cases your app would crash.
         */
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }else{
            mToast = Toast.makeText(this,"Not open URL!",Toast.LENGTH_LONG);
        }
    }
}
