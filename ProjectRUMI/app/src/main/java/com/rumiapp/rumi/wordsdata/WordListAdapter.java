package com.rumiapp.rumi.wordsdata;

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

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder> {

    private static final String TAG = WordListAdapter.class.getSimpleName();

    private Cursor mCursor;
    private Context mContext;

    public static String textThatYouWantToShare;

    final private ListItemWordClickListener mOnClickListener;

    public interface ListItemWordClickListener {
        void onListItemWordClick(int clickedItemIndex);
    }


    public WordListAdapter(Context context, Cursor cursor, ListItemWordClickListener listener) {
        this.mContext = context;
        this.mCursor = cursor;
        mOnClickListener = listener;
    }

    @Override
    public WordViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.word_list, parent, false);
        return new WordViewHolder(view);
    }

    @Override
    public void onBindViewHolder(WordViewHolder holder, int position) {
        if (!mCursor.moveToPosition(position))
            return;

        String wordType = mCursor.getString(mCursor.getColumnIndex(RumiWordData.RumiWordEntry.COLUMN_WORD_TYPE));
        String rumi_words = mCursor.getString(mCursor.getColumnIndex(RumiWordData.RumiWordEntry.COLUMN_RUMI_WORD));


        holder.wordTypeTextView.setText(wordType);
        holder.wordTextView.setText(rumi_words);
    }

    @Override
    public int getItemCount() {
        return mCursor.getCount();
    }

    class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView wordTypeTextView;
        TextView wordTextView;

        public WordViewHolder(View itemView) {
            super(itemView);
            wordTypeTextView = itemView.findViewById(R.id.tv_type_word);
            wordTextView = itemView.findViewById(R.id.tv_rumisword);
            itemView.setOnClickListener(this);
            wordTextView.setOnClickListener(this);
        }


        @Override
        public void onClick(View view) {
            int clickedPosition = getAdapterPosition();
            mOnClickListener.onListItemWordClick(clickedPosition);
            textThatYouWantToShare = String.valueOf(wordTextView.getText());

        }

    }
}
