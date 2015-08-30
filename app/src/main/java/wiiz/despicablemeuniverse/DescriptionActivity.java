package wiiz.despicablemeuniverse;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DescriptionActivity extends Activity {
    int positionParent;
    int positionChild;

    // Arrays Images
    private Integer[] array_img = { R.drawable.minions1};

    private Integer[] array_img_humans = {
            R.drawable.gru, R.drawable.lucy,
            R.drawable.agnes};
    private Integer[] array_img_yellow = {
            R.drawable.dave, R.drawable.stuart,
            R.drawable.tim};
    private Integer[] array_img_purple = {
            R.drawable.purple};
    private Integer[] array_img_animals = {
            R.drawable.animal, R.drawable.unicorn};

    // Default Array name / dec
    String[] array_name = new String[] { "Name"};
    String[] array_desc = new String[] { "Description"};

    // Arrays of names
    String[] array_name_humans = new String[] {
            "NAME: Gru\nEYES: Blue\nSPOUSE: Lucy Wilde\nOCCUPATION: Supervillain (formerly),Jelly manufacturer (formerly)",
            "NAME: Lucy\nEYES: Green\nSPOUSE: Felonius Gru \nOCCUPATION: Agent at the Anti-Villain League",
            "NAME: Agnes\nEYES: Brown\nAGE: 6\nDOUDOU: Fluffy Unicorn"};

    String[] array_name_yellow = new String[] {
            "NAME: Dave\nEYES: 2\nBODY: Slim\nLOVES : Rockets & Missiles\nHATES: Waiting",
            "NAME: Stuart\nEYES: 1\nLOVES : Playing & Laughing\nHATES: Bullied by other minions",
            "NAME: Tim\nEYES: 2\nLOVES : Playing Boss\nHATES: Losing & being laughed at"};
    String[] array_name_purple = new String[] {
            "Evil Minions\nEYES: Purple sometimes Brown\nOCCUPATION : Henchmen"};
    String[] array_name_animals = new String[] {
            "NAME: Kyle\nOCCUPATION: Gru's (and later Agnes') Pet",
            "NAME: Fluffy Unicorn\nTYPE: Stuffed toy\nOTHER: Won from Space Killer"};

    // Arrays of desc
    String[] array_desc_humans = new String[] {
            "Felonius Gru, often referred to by his surname Gru, was a supervillain and jelly manufacturer," +
                    " and is now a consultant for the Anti-Villain League.",
            "Lucy Wilde is a rookie agent of the Anti-Villain League. She is currently the wife of Felonius Gru." +
                    " Initially assigned to find Gru and bring him to the AVL's headquarters, she later on becomes " +
                    "Gru's partner in hunting down the thief of the PX-41 serum.",
            "Agnes Gru is the youngest of Gru and Lucy's three adopted daughters, alongside her sisters Margo Gru and " +
                    "Edith Gru. She greatly adores unicorns, as shown on various occasions."};

    String[] array_desc_yellow = new String[] {
            "We call him the 'Bazooka' Dave.\n" +
                    "MOVIE MOMENTS :\nWhen Gru was about to share his latest nefarious scheme, Dave got over excited " +
                    "and fired his bazooka. The end result: an exploding fountain of minions.",
            "'Stuart' here means sincere and innocent.\n" +
                    "MOVIE MOMENTS :\nWhile trying to escape from Vector's house, they ended up inside a dark ventilation shaft." +
                    "As they needed Light Jerry picked Stuart up and cracked him, turning him into a minion-sized glow stick!",
            "Tim is probably the only minion with temper and personality.\n" +
                    "MOVIE MOMENTS :\nTim, Mark and Phil were sent  by Gru to get a Unicorn toy for Agnes. " +
                            "Tim appeared to be the leader of the trio and disguised as the father when" +
                            " they were shopping in the mall."};
    String[] array_desc_purple = new String[] {
            "'OOOOHHH PATI ARRR TAAAAHHH BAAAH!' (Evil Kevin)\n" +
                "Evil Minions are Minions that are at the state of extreme mutation caused by the PX-41 " +
                "serum entering their blood vessels."};
    String[] array_desc_animals = new String[] {
            "'Girls, this is Kyle, my.... dog.' (Gru)\n" +
                    "Kyle is a pet of the Gru family, belonging to Gru, and then given to Agnes.",
            "'IT'S SO FLUFFY I'M GONNA DIE!' ( Agnes, when she saw the unicorn)\n" +
                    "Agnes' Unicorn is a fluffy plush-unicorn that Agnes received at Super Silly Fun Land."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle objectBundle = this.getIntent().getExtras();
        if(objectBundle != null) {
            positionParent = objectBundle.getInt("positionParent");
            positionChild  = objectBundle.getInt("positionChild");
        }
        super.onCreate(savedInstanceState);

        LayoutInflater inflater = this.getLayoutInflater();
        View view=inflater.inflate(R.layout.description, null);

        TextView name = (TextView) view.findViewById(R.id.name);
        TextView description = (TextView) view.findViewById(R.id.description);
        ImageView image = (ImageView) view.findViewById(R.id.image);

        // Set values to views
        if (positionParent == 0) {
            image.setImageResource(array_img_humans[positionChild]);
            name.setText(array_name_humans[positionChild]);
            description.setText(array_desc_humans[positionChild]);
        } else if (positionParent == 1) {
            image.setImageResource(array_img_yellow[positionChild]);
            name.setText(array_name_yellow[positionChild]);
            description.setText(array_desc_yellow[positionChild]);
        }  else if (positionParent == 2) {
            image.setImageResource(array_img_purple[positionChild]);
            name.setText(array_name_purple[positionChild]);
            description.setText(array_desc_purple[positionChild]);
        }  else if (positionParent == 3) {
            image.setImageResource(array_img_animals[positionChild]);
            name.setText(array_name_animals[positionChild]);
            description.setText(array_desc_animals[positionChild]);
        }

        setContentView(view);

    }
}
