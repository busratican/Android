package com.rumiapp.rumi.wordsdata;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/**
 * Created by Busra on 25.01.2018.
 */

public class RumiWordDataHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "words.db";
    private static final int DATABASE_VERSION = 3;

    public RumiWordDataHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        // Create a table to hold waitlist data
        final String SQL_CREATE_RUMISWORD_TABLE = "CREATE TABLE " + RumiWordData.RumiWordEntry.TABLE_NAME + " (" +
                RumiWordData.RumiWordEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                RumiWordData.RumiWordEntry.COLUMN_WORD_TYPE + " TEXT NOT NULL, " +
                RumiWordData.RumiWordEntry.COLUMN_RUMI_WORD + " TEXT NOT NULL" +
                "); ";

        sqLiteDatabase.execSQL(SQL_CREATE_RUMISWORD_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + RumiWordData.RumiWordEntry.TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
}
