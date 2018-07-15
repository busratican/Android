package com.rumiapp.rumi.bookdata;

/**
 * Created by Busra on 1.03.2018.
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Busra on 25.01.2018.
 */

public class RumiBookDataHelper extends SQLiteOpenHelper {

    // The database name
    private static final String DATABASE_NAME = "books.db";

    // If you change the database schema, you must increment the database version
    private static final int DATABASE_VERSION = 1;

    public RumiBookDataHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        // Create a table to hold waitlist data
        final String SQL_CREATE_BOOKS_TABLE = "CREATE TABLE " + RumiBookData.RumiBookEntry.TABLE_NAME + " (" +
                RumiBookData.RumiBookEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                RumiBookData.RumiBookEntry.COLUMN_NAME + " TEXT NOT NULL, " +
                RumiBookData.RumiBookEntry.COLUMN_AUTHOR + " TEXT NOT NULL, " +
                RumiBookData.RumiBookEntry.COLUMN_PUBLISH_YEAR + " INTEGER NOT NULL, " +
                RumiBookData.RumiBookEntry.COLUMN_TYPE + " TEXT NOT NULL" +
                "); ";

        sqLiteDatabase.execSQL(SQL_CREATE_BOOKS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + RumiBookData.RumiBookEntry.TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
}
