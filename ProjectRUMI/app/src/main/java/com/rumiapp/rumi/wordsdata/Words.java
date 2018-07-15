package com.rumiapp.rumi.wordsdata;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Busra on 25.01.2018.
 */

public class Words {

    public static void insertFakeData(SQLiteDatabase db) {
        if (db == null) {
            return;
        }
        //create a list of fake guests
        List<ContentValues> list = new ArrayList<ContentValues>();

        ContentValues cv = new ContentValues();
        cv.put(RumiWordData.RumiWordEntry.COLUMN_WORD_TYPE, " attraction, rumi");
        cv.put(RumiWordData.RumiWordEntry.COLUMN_RUMI_WORD, "“What you seek is seeking you.” ");
        list.add(cv);

        cv = new ContentValues();
        cv.put(RumiWordData.RumiWordEntry.COLUMN_RUMI_WORD, "“Words are a pretext.\n" +
                " It is the inner bond that draws one person to another, not words.”");
        cv.put(RumiWordData.RumiWordEntry.COLUMN_WORD_TYPE, " rumi, soul, structuralism");
        list.add(cv);


        cv = new ContentValues();
        cv.put(RumiWordData.RumiWordEntry.COLUMN_WORD_TYPE, "divinity, love, poetry, rumi");
        cv.put(RumiWordData.RumiWordEntry.COLUMN_RUMI_WORD, "“I know you're tired but come, this is the way.”");
        list.add(cv);


        cv = new ContentValues();
        cv.put(RumiWordData.RumiWordEntry.COLUMN_WORD_TYPE, "joy, rumi, sorrow");
        cv.put(RumiWordData.RumiWordEntry.COLUMN_RUMI_WORD, "“Sorrow prepares you for joy.\n" +
                " It violently sweeps everything out of your house, so that new joy can find space to enter.\n" +
                " It shakes the yellow leaves from the bough of your heart, \n" +
                "so that fresh, green leaves can grow in their place. It pulls up the rotten roots,\n" +
                " so that new roots hidden beneath have room to grow.\n" +
                " Whatever sorrow shakes from your heart,\n" +
                " far better things will take their place.” ");
        list.add(cv);

        cv = new ContentValues();
        cv.put(RumiWordData.RumiWordEntry.COLUMN_WORD_TYPE, "poetry, rumi");
        cv.put(RumiWordData.RumiWordEntry.COLUMN_RUMI_WORD, "“Oh soul,\n" +
                "you worry too much.\n" +
                "You have seen your own strength.\n" +
                "You have seen your own beauty.\n" +
                "You have seen your golden wings.\n" +
                "Of anything less,\n" +
                "why do you worry?\n" +
                "You are in truth\n" +
                "the soul, of the soul, of the soul.” ");
        list.add(cv);


        cv = new ContentValues();
        cv.put(RumiWordData.RumiWordEntry.COLUMN_WORD_TYPE, "love, poetry, rumi");
        cv.put(RumiWordData.RumiWordEntry.COLUMN_RUMI_WORD, "“I was dead, then alive.\n" +
                "Weeping, then laughing.\n" +
                "\n" +
                "The power of love came into me,\n" +
                "and I became fierce like a lion,\n" +
                "then tender like the evening star.”");
        list.add(cv);


        cv = new ContentValues();
        cv.put(RumiWordData.RumiWordEntry.COLUMN_WORD_TYPE, "poetry, rumi");
        cv.put(RumiWordData.RumiWordEntry.COLUMN_RUMI_WORD, "“At night, I open the window\n" +
                "and ask the moon to come\n" +
                "and press its face against mine.\n" +
                "Breathe into me.\n" +
                "Close the language-door\n" +
                "and open the love-window.\n" +
                "The moon won't use the door,\n" +
                "only the window.”");
        list.add(cv);


        cv = new ContentValues();
        cv.put(RumiWordData.RumiWordEntry.COLUMN_WORD_TYPE, "poetry, rumi, unity");
        cv.put(RumiWordData.RumiWordEntry.COLUMN_RUMI_WORD, "“Like a sculptor, if necessary,\n" +
                "carve a friend out of stone.\n" +
                "Realize that your inner sight is blind\n" +
                "and try to see a treasure in everyone.” ");
        list.add(cv);

        cv = new ContentValues();
        cv.put(RumiWordData.RumiWordEntry.COLUMN_WORD_TYPE, "poetry, rumi, love");
        cv.put(RumiWordData.RumiWordEntry.COLUMN_RUMI_WORD, "“When someone beats a rug,\n" +
                "the blows are not against the rug, \n" +
                "but against the dust in it.”");
        list.add(cv);

        cv = new ContentValues();
        cv.put(RumiWordData.RumiWordEntry.COLUMN_WORD_TYPE, "poetry,love");
        cv.put(RumiWordData.RumiWordEntry.COLUMN_RUMI_WORD, "“The rose's rarest essence lives in the thorns.”");
        list.add(cv);

        cv = new ContentValues();
        cv.put(RumiWordData.RumiWordEntry.COLUMN_WORD_TYPE, " rumi, rumi-poetry");
        cv.put(RumiWordData.RumiWordEntry.COLUMN_RUMI_WORD, "“You think of yourself\n" +
                "as a citizen of the universe.\n" +
                "You think you belong \n" +
                "to this world of dust and matter.\n" +
                "Out of this dust\n" +
                "you have created a personal image,\n" +
                "and have forgotten\n" +
                "about the essence of your true origin..” ");
        list.add(cv);


        cv = new ContentValues();
        cv.put(RumiWordData.RumiWordEntry.COLUMN_WORD_TYPE, " rumi,love,poetry");
        cv.put(RumiWordData.RumiWordEntry.COLUMN_RUMI_WORD, "“Love calls - everywhere and always. \n" +
                "We're sky bound.\n" +
                "Are you coming?”");
        list.add(cv);

        cv = new ContentValues();
        cv.put(RumiWordData.RumiWordEntry.COLUMN_WORD_TYPE, " rumi,poetry");
        cv.put(RumiWordData.RumiWordEntry.COLUMN_RUMI_WORD, "“For without you, I swear, the town\n" +
                "Has become like a prison to me.\n" +
                "Distraction and the mountain\n" +
                "And the desert, all I desire.” ");
        list.add(cv);


        cv = new ContentValues();
        cv.put(RumiWordData.RumiWordEntry.COLUMN_WORD_TYPE, " rumi,poetry");
        cv.put(RumiWordData.RumiWordEntry.COLUMN_RUMI_WORD, "“No more words.\n" +
                " In the name of this place we drink in with our breathing,\n" +
                " stay quiet like a flower.\n" +
                "So the nightbirds will start singing.”");
        list.add(cv);


        cv = new ContentValues();
        cv.put(RumiWordData.RumiWordEntry.COLUMN_WORD_TYPE, " rumi,women,religion");
        cv.put(RumiWordData.RumiWordEntry.COLUMN_RUMI_WORD, "“Woman is the light of God.” ");
        list.add(cv);

        cv = new ContentValues();
        cv.put(RumiWordData.RumiWordEntry.COLUMN_WORD_TYPE, " rumi,love,intellect");
        cv.put(RumiWordData.RumiWordEntry.COLUMN_RUMI_WORD, "“Love isn't the work of the tender and the gentle;\n" +
                "Love is the work of wrestlers.\n" +
                "The one who becomes a servant of lovers\n" +
                "is really a fortunate sovereign.\n" +
                "Don't ask anyone about Love; ask Love about Love.\n" +
                "Love is a cloud that scatters pearls.”");
        list.add(cv);

        cv = new ContentValues();
        cv.put(RumiWordData.RumiWordEntry.COLUMN_WORD_TYPE, " rumi,love");
        cv.put(RumiWordData.RumiWordEntry.COLUMN_RUMI_WORD, "“For the thirst to possess your love,\n" +
                "Is worth my blood a hundred times.”");
        list.add(cv);


        cv = new ContentValues();
        cv.put(RumiWordData.RumiWordEntry.COLUMN_WORD_TYPE, " rumi,love,intellect");
        cv.put(RumiWordData.RumiWordEntry.COLUMN_RUMI_WORD, "“Shams, my body is a candle touched with fire.”");
        list.add(cv);

        cv = new ContentValues();
        cv.put(RumiWordData.RumiWordEntry.COLUMN_WORD_TYPE, " rumi,love,intellect");
        cv.put(RumiWordData.RumiWordEntry.COLUMN_RUMI_WORD, "“There is a voice that doesn't use words. Listen.”");
        list.add(cv);

        cv = new ContentValues();
        cv.put(RumiWordData.RumiWordEntry.COLUMN_WORD_TYPE, " rumi,you,world");
        cv.put(RumiWordData.RumiWordEntry.COLUMN_RUMI_WORD, "“Don't you know Yet?\n It is your light that lights the World.” ");
        list.add(cv);


        cv = new ContentValues();
        cv.put(RumiWordData.RumiWordEntry.COLUMN_WORD_TYPE, " rumi,you,heart,poems");
        cv.put(RumiWordData.RumiWordEntry.COLUMN_RUMI_WORD, "“We may know who we are or we may not. We may be Muslims\n, " +
                "Jews or Christians but until our hearts becomethe mould for every heart\n" +
                " we will see only our differences.”");
        list.add(cv);


        cv = new ContentValues();
        cv.put(RumiWordData.RumiWordEntry.COLUMN_WORD_TYPE, " rumi,quest");
        cv.put(RumiWordData.RumiWordEntry.COLUMN_RUMI_WORD, "“Everything you possess of skill, and wealth, and handicraft,\n" +
                "wasn't it first merely a thought and a quest?” ");
        list.add(cv);

        cv = new ContentValues();
        cv.put(RumiWordData.RumiWordEntry.COLUMN_WORD_TYPE, "love, rumi,quest");
        cv.put(RumiWordData.RumiWordEntry.COLUMN_RUMI_WORD, "“The minute I heard my first love story,\n" +
                "I started looking for you,\n " +
                "Not knowing how blind that was.” ");
        list.add(cv);

        cv = new ContentValues();
        cv.put(RumiWordData.RumiWordEntry.COLUMN_WORD_TYPE, "love, rumi,intellect");
        cv.put(RumiWordData.RumiWordEntry.COLUMN_RUMI_WORD, "“Be quiet now and wait.\n" +
                "It may be that the ocean one,\n" +
                "the one we desire so to move into and become,\n" +
                "desires us out here on land a little longer,\n" +
                "going our sundry roads to the shore.”  ");
        list.add(cv);


        cv = new ContentValues();
        cv.put(RumiWordData.RumiWordEntry.COLUMN_WORD_TYPE, "poetry, rumi,intellect");
        cv.put(RumiWordData.RumiWordEntry.COLUMN_RUMI_WORD, "“A wealth you cannot imagine\n" +
                "flows through you.\n" +
                "Do not consider what strangers say.\n" +
                "Be secluded in your secret heart-house,\n" +
                "that bowl of silence.” ");
        list.add(cv);


        cv = new ContentValues();
        cv.put(RumiWordData.RumiWordEntry.COLUMN_WORD_TYPE, "poetry, rumi,intellect");
        cv.put(RumiWordData.RumiWordEntry.COLUMN_RUMI_WORD, "“A craftsman pulled a reed from the reedbed,\n" +
                "cut holes in it, and called it a human being.\n" +
                "Since then, it's been wailing a tender agony\n" +
                "of parting, never mentioning the skill\n" +
                "that gave it life as a flute”");
        list.add(cv);

        cv = new ContentValues();
        cv.put(RumiWordData.RumiWordEntry.COLUMN_WORD_TYPE, "poetry, rumi,die");
        cv.put(RumiWordData.RumiWordEntry.COLUMN_RUMI_WORD, "“Die! Die! Die in this love!\n" +
                "If you die in this love,Your soul will be renewed. \n" +
                "Die! Die! Don’t fear the death of that which is known\n" +
                "If you die to the temporal, You will become timeless.” ");
        list.add(cv);


        cv = new ContentValues();
        cv.put(RumiWordData.RumiWordEntry.COLUMN_WORD_TYPE, "love, rumi");
        cv.put(RumiWordData.RumiWordEntry.COLUMN_RUMI_WORD, "“Only union with you gives joy. \n" +
                "The rest if tearing down one building to put up another.” ");
        list.add(cv);

        //insert all guests in one transaction
        try
        {
            db.beginTransaction();
            //clear the table first
            db.delete (RumiWordData.RumiWordEntry.TABLE_NAME,null,null);
            //go through the list and add one by one
            for(ContentValues c:list){
                db.insert(RumiWordData.RumiWordEntry.TABLE_NAME, null, c);
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
