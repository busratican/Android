package com.rumiapp.rumi.wordsdata;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.Toast;

import com.rumiapp.rumi.R;

public class RumisWord extends AppCompatActivity implements WordListAdapter.ListItemWordClickListener {

    private WordListAdapter mAdapter;
    private SQLiteDatabase mDb;
    private Button shareButton;
    private Toast mToast;

    private RecyclerView wordlistRecylerView;

    private String TAG = "RumiWord.class";

    public RumisWord(){

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumis_word);


        wordlistRecylerView = this.findViewById(R.id.all_words_list_view);
        wordlistRecylerView.setLayoutManager(new LinearLayoutManager(this));


        RumiWordDataHelper dbHelper = new RumiWordDataHelper(this);
        mDb = dbHelper.getWritableDatabase();
        Words.insertFakeData(mDb);
        Cursor cursor = getAllWords();

        mAdapter = new WordListAdapter(this,cursor,this);
        wordlistRecylerView.setAdapter(mAdapter);

    }



    private Cursor getAllWords(){
        return mDb.query(
                RumiWordData.RumiWordEntry.TABLE_NAME,
                null,
                null,
                null,
                null,
                null,
                null
        );
    }


    public void shareText(String textToShare) {
        // COMPLETED (2) Create a String variable called mimeType and set it to "text/plain"
        /*
         * You can think of MIME types similarly to file extensions. They aren't the exact same,
         * but MIME types help a computer determine which applications can open which content. For
         * example, if you double click on a .pdf file, you will be presented with a list of
         * programs that can open PDFs. Specifying the MIME type as text/plain has a similar affect
         * on our implicit Intent. With text/plain specified, all apps that can handle text content
         * in some way will be offered when we call startActivity on this particular Intent.
         */
        String mimeType = "text/plain";

        // COMPLETED (3) Create a title for the chooser window that will pop up
        /* This is just the title of the window that will pop up when we call startActivity */
        String title = "SHARE";

        // COMPLETED (4) Use ShareCompat.IntentBuilder to build the Intent and start the chooser
        /* ShareCompat.IntentBuilder provides a fluent API for creating Intents */
        ShareCompat.IntentBuilder
                /* The from method specifies the Context from which this share is coming from */
                .from(this)
                .setType(mimeType)
                .setChooserTitle(title)
                .setText(textToShare)
                .startChooser();
    }



    @Override
    public void onListItemWordClick(int clickedItemIndex) {

        if (mToast != null) {
            mToast.cancel();
        }


        shareText(WordListAdapter.textThatYouWantToShare);

    }


}
