package com.rumiapp.rumi.moviedata;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Busra on 1.03.2018.
 */

public class Movies {

    public static void insertFakeData(SQLiteDatabase db) {
        if (db == null) {
            return;
        }

        //create a list of fake guests
        List<ContentValues> list = new ArrayList<ContentValues>();

        ContentValues cv = new ContentValues();
        cv.put(MovieData.MovieDataEntry.COLUMN_MOVIE_NAME, "Rumi: Poet of the Heart ");
        cv.put(MovieData.MovieDataEntry.COLUMN_MOVIE_AUTHOR, "Haydn Reiss");
        cv.put(MovieData.MovieDataEntry.COLUMN_MOVIE_PUBLISH_YEAR,1998);
        list.add(cv);


        cv = new ContentValues();
        cv.put(MovieData.MovieDataEntry.COLUMN_MOVIE_NAME, "Mevlana Celaleddin-i Rumi:\n" +
                "Askin dansi ");
        cv.put(MovieData.MovieDataEntry.COLUMN_MOVIE_AUTHOR, "Kürsat Kizbaz");
        cv.put(MovieData.MovieDataEntry.COLUMN_MOVIE_PUBLISH_YEAR,2008);
        list.add(cv);

        cv = new ContentValues();
        cv.put(MovieData.MovieDataEntry.COLUMN_MOVIE_NAME, "RUMI\n" +
                "Leonardo Dicaprio\n" +
                " will play a leading role.");
        cv.put(MovieData.MovieDataEntry.COLUMN_MOVIE_AUTHOR, "Unknown");
        cv.put(MovieData.MovieDataEntry.COLUMN_MOVIE_PUBLISH_YEAR,0000);
        list.add(cv);

        //insert all guests in one transaction
        try
        {
            db.beginTransaction();
            //clear the table first
            db.delete (MovieData.MovieDataEntry.TABLE_NAME,null,null);
            //go through the list and add one by one
            for(ContentValues c:list){
                db.insert(MovieData.MovieDataEntry.TABLE_NAME, null, c);
            }
            db.setTransactionSuccessful();
        }
        catch (SQLException e) {
            //too bad :(
        }
        finally
        {
            db.endTransaction();
        }


    }
}
