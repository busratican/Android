package com.rumiapp.rumi.bookdata;

/**
 * Created by Busra on 1.03.2018.
 */

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Busra on 25.01.2018.
 */

public class Books {
    public static void insertFakeData(SQLiteDatabase db) {
        if (db == null) {
            return;
        }
        //create a list of fake guests
        List<ContentValues> list = new ArrayList<ContentValues>();

        ContentValues cv = new ContentValues();
        cv.put(RumiBookData.RumiBookEntry.COLUMN_NAME, "The Essential Rumi");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_AUTHOR, "Mevlânâ Celâleddîn-i Rûmî,");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_PUBLISH_YEAR,1961);
        cv.put(RumiBookData.RumiBookEntry.COLUMN_TYPE,"Poem");
        list.add(cv);

        cv = new ContentValues();
        cv.put(RumiBookData.RumiBookEntry.COLUMN_NAME, "Mesnevî-i Şerîf");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_AUTHOR, "Mevlânâ Celâleddîn-i Rûmî,");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_PUBLISH_YEAR,2014);
        cv.put(RumiBookData.RumiBookEntry.COLUMN_TYPE,"Poem");
        list.add(cv);

        cv = new ContentValues();
        cv.put(RumiBookData.RumiBookEntry.COLUMN_NAME, "The Illuminated Rumi");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_AUTHOR, "Mevlânâ Celâleddîn-i Rûmî,");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_PUBLISH_YEAR,1997);
        cv.put(RumiBookData.RumiBookEntry.COLUMN_TYPE,"Poem");
        list.add(cv);

        cv = new ContentValues();
        cv.put(RumiBookData.RumiBookEntry.COLUMN_NAME, "The Love Poems of Rumi");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_AUTHOR, "Mevlânâ Celâleddîn-i Rûmî,");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_PUBLISH_YEAR,1998);
        cv.put(RumiBookData.RumiBookEntry.COLUMN_TYPE,"Poem");
        list.add(cv);

        cv = new ContentValues();
        cv.put(RumiBookData.RumiBookEntry.COLUMN_NAME, "The Rumi Collection");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_AUTHOR, "Mevlânâ Celâleddîn-i Rûmî,");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_PUBLISH_YEAR,1998);
        cv.put(RumiBookData.RumiBookEntry.COLUMN_TYPE,"Poem");
        list.add(cv);

        cv = new ContentValues();
        cv.put(RumiBookData.RumiBookEntry.COLUMN_NAME, "Mystical poems of Rūmī");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_AUTHOR, "Mevlânâ Celâleddîn-i Rûmî,");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_PUBLISH_YEAR,1968);
        cv.put(RumiBookData.RumiBookEntry.COLUMN_TYPE,"Poem");
        list.add(cv);

        cv = new ContentValues();
        cv.put(RumiBookData.RumiBookEntry.COLUMN_NAME, "The Sufi path of love");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_AUTHOR, "Mevlânâ Celâleddîn-i Rûmî,");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_PUBLISH_YEAR,1983);
        cv.put(RumiBookData.RumiBookEntry.COLUMN_TYPE,"Poem");
        list.add(cv);

        cv = new ContentValues();
        cv.put(RumiBookData.RumiBookEntry.COLUMN_NAME, "Rumi: Poet and Mystic");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_AUTHOR, "Mevlânâ Celâleddîn-i Rûmî,");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_PUBLISH_YEAR,1111);
        cv.put(RumiBookData.RumiBookEntry.COLUMN_TYPE,"Poem,Biography");
        list.add(cv);

        cv = new ContentValues();
        cv.put(RumiBookData.RumiBookEntry.COLUMN_NAME, "The pocket Rumi");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_AUTHOR, "Mevlânâ Celâleddîn-i Rûmî,");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_PUBLISH_YEAR,2001);
        cv.put(RumiBookData.RumiBookEntry.COLUMN_TYPE,"Poem");
        list.add(cv);

        cv = new ContentValues();
        cv.put(RumiBookData.RumiBookEntry.COLUMN_NAME, "Love Is a Stranger");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_AUTHOR, "Mevlânâ Celâleddîn-i Rûmî,");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_PUBLISH_YEAR,1993);
        cv.put(RumiBookData.RumiBookEntry.COLUMN_TYPE,"Poem");
        list.add(cv);

        cv = new ContentValues();
        cv.put(RumiBookData.RumiBookEntry.COLUMN_NAME, "This Longing: Poetry, Teaching Stories, and Selected Letters");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_AUTHOR, "Mevlânâ Celâleddîn-i Rûmî,");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_PUBLISH_YEAR,1111);
        cv.put(RumiBookData.RumiBookEntry.COLUMN_TYPE,"Poem");
        list.add(cv);

        cv = new ContentValues();
        cv.put(RumiBookData.RumiBookEntry.COLUMN_NAME, "Rumi and Islam");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_AUTHOR, "Mevlânâ Celâleddîn-i Rûmî,");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_PUBLISH_YEAR,2004);
        cv.put(RumiBookData.RumiBookEntry.COLUMN_TYPE,"article");
        list.add(cv);

        cv = new ContentValues();
        cv.put(RumiBookData.RumiBookEntry.COLUMN_NAME, "Hush, Don't Say Anything to God");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_AUTHOR, "Mevlânâ Celâleddîn-i Rûmî,");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_PUBLISH_YEAR,2000);
        cv.put(RumiBookData.RumiBookEntry.COLUMN_TYPE,"poem");
        list.add(cv);

        cv = new ContentValues();
        cv.put(RumiBookData.RumiBookEntry.COLUMN_NAME, "The Soul of Rumi: A New Collection of Ecstatic Poems");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_AUTHOR, "Mevlânâ Celâleddîn-i Rûmî,");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_PUBLISH_YEAR,1111);
        cv.put(RumiBookData.RumiBookEntry.COLUMN_TYPE,"poem");
        list.add(cv);

        cv = new ContentValues();
        cv.put(RumiBookData.RumiBookEntry.COLUMN_NAME, "The Illustrated Rumi");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_AUTHOR, "Mevlânâ Celâleddîn-i Rûmî,");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_PUBLISH_YEAR,2000);
        cv.put(RumiBookData.RumiBookEntry.COLUMN_TYPE,"poem");
        list.add(cv);

        cv = new ContentValues();
        cv.put(RumiBookData.RumiBookEntry.COLUMN_NAME, "Love's Ripening");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_AUTHOR, "Mevlânâ Celâleddîn-i Rûmî,");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_PUBLISH_YEAR,2008);
        cv.put(RumiBookData.RumiBookEntry.COLUMN_TYPE,"poem");
        list.add(cv);

        cv = new ContentValues();
        cv.put(RumiBookData.RumiBookEntry.COLUMN_NAME, "Discourses of Rūmī");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_AUTHOR, "Mevlânâ Celâleddîn-i Rûmî,");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_PUBLISH_YEAR,1111);
        cv.put(RumiBookData.RumiBookEntry.COLUMN_TYPE,"poem");
        list.add(cv);

        cv = new ContentValues();
        cv.put(RumiBookData.RumiBookEntry.COLUMN_NAME, "The Masnavi");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_AUTHOR, "Mevlânâ Celâleddîn-i Rûmî,");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_PUBLISH_YEAR,1278);
        cv.put(RumiBookData.RumiBookEntry.COLUMN_TYPE,"poem,sacred text");
        list.add(cv);

        cv = new ContentValues();
        cv.put(RumiBookData.RumiBookEntry.COLUMN_NAME, "Feeling the Shoulder of the Lion: Poetry and Teaching Stories of Rumi");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_AUTHOR, "Mevlânâ Celâleddîn-i Rûmî,");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_PUBLISH_YEAR,1991);
        cv.put(RumiBookData.RumiBookEntry.COLUMN_TYPE,"poem");
        list.add(cv);

        cv = new ContentValues();
        cv.put(RumiBookData.RumiBookEntry.COLUMN_NAME, "The Purity of Desire: 100 Poems of Rumi");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_AUTHOR, "Mevlânâ Celâleddîn-i Rûmî,");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_PUBLISH_YEAR,1111);
        cv.put(RumiBookData.RumiBookEntry.COLUMN_TYPE,"poem");
        list.add(cv);

        cv = new ContentValues();
        cv.put(RumiBookData.RumiBookEntry.COLUMN_NAME, "Spiritual Verses");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_AUTHOR, "Mevlânâ Celâleddîn-i Rûmî,");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_PUBLISH_YEAR,1278);
        cv.put(RumiBookData.RumiBookEntry.COLUMN_TYPE,"poem");
        list.add(cv);

        cv = new ContentValues();
        cv.put(RumiBookData.RumiBookEntry.COLUMN_NAME, "Rumi: A Spiritual Treasury");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_AUTHOR, "Mevlânâ Celâleddîn-i Rûmî,");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_PUBLISH_YEAR,1278);
        cv.put(RumiBookData.RumiBookEntry.COLUMN_TYPE,"poem");
        list.add(cv);

        cv = new ContentValues();
        cv.put(RumiBookData.RumiBookEntry.COLUMN_NAME, "Tales from the Masnavi");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_AUTHOR, "Mevlânâ Celâleddîn-i Rûmî,");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_PUBLISH_YEAR,1961);
        cv.put(RumiBookData.RumiBookEntry.COLUMN_TYPE,"poem,editing");
        list.add(cv);

        cv = new ContentValues();
        cv.put(RumiBookData.RumiBookEntry.COLUMN_NAME, "Love: The Joy That Wounds");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_AUTHOR, "Mevlânâ Celâleddîn-i Rûmî,");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_PUBLISH_YEAR,2005);
        cv.put(RumiBookData.RumiBookEntry.COLUMN_TYPE,"poem");
        list.add(cv);

        cv = new ContentValues();
        cv.put(RumiBookData.RumiBookEntry.COLUMN_NAME, "A Rumi Anthology");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_AUTHOR, "Mevlânâ Celâleddîn-i Rûmî,");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_PUBLISH_YEAR,1111);
        cv.put(RumiBookData.RumiBookEntry.COLUMN_TYPE,"poem");
        list.add(cv);


        cv = new ContentValues();
        cv.put(RumiBookData.RumiBookEntry.COLUMN_NAME, "The Persian mystics");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_AUTHOR, "Mevlânâ Celâleddîn-i Rûmî,");
        cv.put(RumiBookData.RumiBookEntry.COLUMN_PUBLISH_YEAR,1907);
        cv.put(RumiBookData.RumiBookEntry.COLUMN_TYPE,"poem,editing");
        list.add(cv);

        //insert all guests in one transaction
        try
        {
            db.beginTransaction();
            //clear the table first
            db.delete (RumiBookData.RumiBookEntry.TABLE_NAME,null,null);
            //go through the list and add one by one
            for(ContentValues c:list){
                db.insert(RumiBookData.RumiBookEntry.TABLE_NAME, null, c);
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
