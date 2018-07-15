package com.rumiapp.rumi.moviedata;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.widget.Toast;

import com.rumiapp.rumi.R;

public class rumisphilosophy extends AppCompatActivity
        implements MovieListAdapter.ListItemClickListener{

    private MovieListAdapter mAdapter;
    private Toast mToast;
    private SQLiteDatabase mDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumisphilosophy);


        RecyclerView movielistRecyclerView;

        movielistRecyclerView = this.findViewById(R.id.all_movies_list_view);

        movielistRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        MovieDataHelper dbHelper = new MovieDataHelper(this);

        mDb = dbHelper.getWritableDatabase();
        Movies.insertFakeData(mDb);
        Cursor cursor = getAllMovies();


        mAdapter = new MovieListAdapter(this,cursor,this);

        movielistRecyclerView.setAdapter(mAdapter);
    }

    private Cursor getAllMovies(){
        return mDb.query(
                MovieData.MovieDataEntry.TABLE_NAME,
                null,
                null,
                null,
                null,
                null,
                null
        );
    }


    @Override
    public void onListItemClick(int clickedItemIndex) {

        String urlAsString;
        if (mToast != null) {
            mToast.cancel();
        }

        //String toastMessage = "Item #" + clickedItemIndex + " clicked.";
        //mToast = Toast.makeText(this, toastMessage, Toast.LENGTH_LONG);

        switch (clickedItemIndex) {
            case 0:
                urlAsString = "http://www.imdb.com/title/tt0194322/";
                openWebPage(urlAsString);
                break;

            case 1:
                urlAsString = "http://www.imdb.com/title/tt1768705/";
                openWebPage(urlAsString);
                break;

            case 2:
                urlAsString = "https://www.youtube.com/watch?v=xJsEu1NXIKA";
                openWebPage(urlAsString);
                break;

            default:
                String toastMessage = "Please click one of them.";
                mToast = Toast.makeText(this, toastMessage, Toast.LENGTH_LONG);
                mToast.show();
                //openWebPage(urlAsString);
                break;
        }
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
