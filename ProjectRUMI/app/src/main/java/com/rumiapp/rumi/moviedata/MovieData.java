package com.rumiapp.rumi.moviedata;

import android.provider.BaseColumns;

/**
 * Created by Busra on 1.03.2018.
 */

public class MovieData {

    public static final class MovieDataEntry implements BaseColumns {
        public static final String TABLE_NAME = "movies";
        public static final String COLUMN_MOVIE_NAME = "movieName";
        public static final String COLUMN_MOVIE_AUTHOR = "movieAuthor";
        public static final String COLUMN_MOVIE_PUBLISH_YEAR = "moviePublish";
    }
}
