package com.rumiapp.rumi.moviedata;

import android.content.Context;
import android.database.Cursor;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.rumiapp.rumi.R;

/**
 * Created by Busra on 1.03.2018.
 */

public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.MovieViewHolder> {

    private static final String TAG = MovieListAdapter.class.getSimpleName();

    private Cursor mCursor;
    private Context mContext;

    final private ListItemClickListener mOnClickListener;

    public interface ListItemClickListener{
        void onListItemClick(int clickedItemIndex);
    }




    public MovieListAdapter(Context context,Cursor cursor,ListItemClickListener listener){
        this.mContext = context;
        this.mCursor =cursor;
        mOnClickListener = listener;
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Get the RecyclerView item layout
        boolean shouldAttachToParentImmediately = false;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.movie_list, parent,shouldAttachToParentImmediately);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        if(!mCursor.moveToPosition(position))
            return;

        String movieName = mCursor.getString(mCursor.getColumnIndex(MovieData.MovieDataEntry.COLUMN_MOVIE_NAME));
        String authorName = mCursor.getString(mCursor.getColumnIndex(MovieData.MovieDataEntry.COLUMN_MOVIE_AUTHOR));
        int publishYear = mCursor.getInt(mCursor.getColumnIndex(MovieData.MovieDataEntry.COLUMN_MOVIE_PUBLISH_YEAR));


        holder.movieNameTextView.setText(movieName);
        /*holder.authorNameTextView.setText(authorName);
        holder.bookTypeTextView.setText(bookType);*/


    }

    @Override
    public int getItemCount() {
        return mCursor.getCount();
    }

    class MovieViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener{
        TextView movieNameTextView;
        TextView movieAuthorTextView;
        TextView moviePublishYear;


        public MovieViewHolder(View itemView){
            super(itemView);
            movieNameTextView = itemView.findViewById(R.id.tv_moviename);
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View view) {
            int clickedPosition = getAdapterPosition();
            mOnClickListener.onListItemClick(clickedPosition);
        }
    }
}

