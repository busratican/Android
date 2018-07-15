package com.rumiapp.rumi.bookdata;

import android.provider.BaseColumns;

/**
 * Created by Busra on 1.03.2018.
 */

public class RumiBookData {
    public static final class RumiBookEntry implements BaseColumns {
        public static final String TABLE_NAME = "books";
        public static final String COLUMN_NAME = "bookName";
        public static final String COLUMN_AUTHOR = "bookAuthor";
        public static final String COLUMN_TYPE = "bookType";
        public static final String COLUMN_PUBLISH_YEAR = "bookPublish";
    }
}
