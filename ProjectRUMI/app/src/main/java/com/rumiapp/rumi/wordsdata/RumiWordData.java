package com.rumiapp.rumi.wordsdata;

import android.provider.BaseColumns;

/**
 * Created by Busra on 1.03.2018.
 */

public class RumiWordData {

    public static final class RumiWordEntry implements BaseColumns {
        public static final String TABLE_NAME = "words";
        public static final String COLUMN_WORD_TYPE = "wordType";
        public static final String COLUMN_RUMI_WORD = "wordRumi";
    }
}
