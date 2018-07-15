package com.rumiapp.rumi.bookdata;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.widget.Toast;

import com.rumiapp.rumi.R;

public class RumisBook extends AppCompatActivity
        implements BooksListAdapter.ListItemClickListener {

    private BooksListAdapter mAdapter;
    private Toast mToast;
    private SQLiteDatabase mDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumis_book);

        RecyclerView bookslistRecyclerView;

        bookslistRecyclerView = this.findViewById(R.id.all_books_list_view);

        bookslistRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        RumiBookDataHelper dbHelper = new RumiBookDataHelper(this);

        mDb = dbHelper.getWritableDatabase();
        Books.insertFakeData(mDb);
        Cursor cursor = getAllBooks();


        mAdapter = new BooksListAdapter(this,cursor,this);

        bookslistRecyclerView.setAdapter(mAdapter);
    }

    private Cursor getAllBooks(){
        return mDb.query(
                RumiBookData.RumiBookEntry.TABLE_NAME,
                null,
                null,
                null,
                null,
                null,
                RumiBookData.RumiBookEntry.COLUMN_PUBLISH_YEAR
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

        switch (clickedItemIndex){
            case 0:
                urlAsString = "https://g.co/kgs/tXjBc4";
                openWebPage(urlAsString);
                break;

            case 1:
                urlAsString = "https://g.co/kgs/2BuA24";
                openWebPage(urlAsString);
                break;
            case 2:
                urlAsString = "https://g.co/kgs/uB2vJy";
                openWebPage(urlAsString);
                break;

            case 3:
                urlAsString = "https://g.co/kgs/ze5H5s";
                openWebPage(urlAsString);
                break;

            case 4:
                urlAsString = "https://g.co/kgs/6Y3Qjp";
                openWebPage(urlAsString);
                break;

            case 5:
                urlAsString = "https://g.co/kgs/KGBSiS";
                openWebPage(urlAsString);
                break;

            case 6:
                urlAsString = "https://g.co/kgs/CTSsTG";
                openWebPage(urlAsString);
                break;

            case 7:
                urlAsString = "https://g.co/kgs/v54mLZ";
                openWebPage(urlAsString);
                break;

            case 8:
                urlAsString = "https://g.co/kgs/yUYGXD";
                openWebPage(urlAsString);
                break;

            case 9:
                urlAsString = "https://g.co/kgs/9A6MWR";
                openWebPage(urlAsString);
                break;

            case 10:
                urlAsString = "https://g.co/kgs/nX2EHk";
                openWebPage(urlAsString);
                break;

            case 11:
                urlAsString = "https://g.co/kgs/z2bfpU";
                openWebPage(urlAsString);
                break;

            case 12:
                urlAsString = "https://g.co/kgs/CkbM5E";
                openWebPage(urlAsString);
                break;

            case 13:
                urlAsString = "https://g.co/kgs/dhi62w";
                openWebPage(urlAsString);
                break;

            case 14:
                urlAsString = "https://g.co/kgs/fhRDpU";
                openWebPage(urlAsString);
                break;

            case 15:
                urlAsString = "https://g.co/kgs/R241p9";
                openWebPage(urlAsString);
                break;

            case 16:
                urlAsString = "https://g.co/kgs/bHMhGB";
                openWebPage(urlAsString);
                break;

            case 17:
                urlAsString = "https://g.co/kgs/mMTKU2";
                openWebPage(urlAsString);
                break;

            case 18:
                urlAsString = "https://g.co/kgs/BD5pbp";
                openWebPage(urlAsString);
                break;

            case 19:
                urlAsString = "https://g.co/kgs/CoUQsZ";
                openWebPage(urlAsString);
                break;

            case 20:
                urlAsString = "https://g.co/kgs/GPXAzK";
                openWebPage(urlAsString);
                break;

            case 21:
                urlAsString = "https://g.co/kgs/QX99zc";
                openWebPage(urlAsString);
                break;

            case 22:
                urlAsString = "https://g.co/kgs/iphwXD";
                openWebPage(urlAsString);
                break;

            case 23:
                urlAsString = "https://g.co/kgs/hXi5uq";
                openWebPage(urlAsString);
                break;

            case 24:
                urlAsString = "https://g.co/kgs/PPScX7";
                openWebPage(urlAsString);
                break;

            case 25:
                urlAsString = "https://g.co/kgs/hsAMj2";
                openWebPage(urlAsString);
                break;

            default:
                urlAsString = "https://www.amazon.com/Books-Rumi/s?ie=UTF8&page=1&rh=n%3A283155%2Cp_27%3ARumi";
                openWebPage(urlAsString);
                break;
        }
        //mToast.show();
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
