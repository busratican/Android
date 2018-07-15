package com.rumiapp.rumi.bookdata;

import android.content.Context;
import android.database.Cursor;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.rumiapp.rumi.R;

/**
 * Created by Busra on 25.01.2018.
 */

public class BooksListAdapter extends RecyclerView.Adapter<BooksListAdapter.BooksViewHolder> {

    private static final String TAG = BooksListAdapter.class.getSimpleName();

    private Cursor mCursor;
    private Context mContext;

    final private ListItemClickListener mOnClickListener;

    public interface ListItemClickListener{
        void onListItemClick(int clickedItemIndex);
    }




    public BooksListAdapter(Context context,Cursor cursor,ListItemClickListener listener){
        this.mContext = context;
        this.mCursor =cursor;
        mOnClickListener = listener;
    }

    @Override
    public BooksViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Get the RecyclerView item layout
        boolean shouldAttachToParentImmediately = false;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.books_list, parent,shouldAttachToParentImmediately);
        return new BooksViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BooksViewHolder holder, int position) {
        if(!mCursor.moveToPosition(position))
            return;

        String bookName = mCursor.getString(mCursor.getColumnIndex(RumiBookData.RumiBookEntry.COLUMN_NAME));
        String authorName = mCursor.getString(mCursor.getColumnIndex(RumiBookData.RumiBookEntry.COLUMN_AUTHOR));
        String bookType = mCursor.getString(mCursor.getColumnIndex(RumiBookData.RumiBookEntry.COLUMN_TYPE));
        // int publishYear = mCursor.getInt(mCursor.getColumnIndex(RumiBookData.RumiBookEntry.COLUMN_PUBLISH_YEAR));


        holder.bookNameTextView.setText(bookName);
        holder.authorNameTextView.setText(authorName);
        holder.bookTypeTextView.setText(bookType);


    }

    @Override
    public int getItemCount() {
        return mCursor.getCount();
    }

    class BooksViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener{
        TextView bookNameTextView;
        TextView authorNameTextView;
        TextView bookTypeTextView;


        public BooksViewHolder(View itemView){
            super(itemView);
            bookNameTextView = itemView.findViewById(R.id.tv_book_name);
            authorNameTextView = itemView.findViewById(R.id.tv_author_name);
            bookTypeTextView = itemView.findViewById(R.id.tv_book_type);
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View view) {
            int clickedPosition = getAdapterPosition();
            mOnClickListener.onListItemClick(clickedPosition);
        }
    }
}
