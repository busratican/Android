package com.rumiapp.rumi.moviedata;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Busra on 1.03.2018.
 */

public class MovieDataHelper extends SQLiteOpenHelper {
    // The database name
    private static final String DATABASE_NAME = "movies.db";

    // If you change the database schema, you must increment the database version
    private static final int DATABASE_VERSION = 2;


    public MovieDataHelper(Context context) {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        // Create a table to hold waitlist data
        final String SQL_CREATE_MOVIES_TABLE = "CREATE TABLE " + MovieData.MovieDataEntry.TABLE_NAME + " (" +
                MovieData.MovieDataEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                MovieData.MovieDataEntry.COLUMN_MOVIE_NAME + " TEXT NOT NULL, " +
                MovieData.MovieDataEntry.COLUMN_MOVIE_AUTHOR + " TEXT , " +
                MovieData.MovieDataEntry.COLUMN_MOVIE_PUBLISH_YEAR + " INTEGER" +
                "); ";

        sqLiteDatabase.execSQL(SQL_CREATE_MOVIES_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + MovieData.MovieDataEntry.TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
}
