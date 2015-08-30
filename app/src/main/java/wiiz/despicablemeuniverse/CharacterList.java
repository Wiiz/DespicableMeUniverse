package wiiz.despicablemeuniverse;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CharacterList extends BaseAdapter {

    // Arrays Images
    private Integer[] array_img = { R.drawable.minions1};
    private Integer[] array_img_humans = {
            R.drawable.gru, R.drawable.lucy,
            R.drawable.agnes};
    private Integer[] array_img_yellow_minions = {
            R.drawable.dave, R.drawable.stuart,
            R.drawable.tim};
    private Integer[] array_img_purple_minions = {
            R.drawable.purple};
    private Integer[] array_img_animals = {
            R.drawable.animal, R.drawable.unicorn};

    // Arrays Names
    String[] array_name = new String[] { "Name"};
    String[] array_name_humans = new String[] { "Gru", "Lucy", "Agnes"};
    String[] array_name_yellow = new String[] { "Dave", "Stuart", "Tim"};
    String[] array_name_purple = new String[] { "Evil Minions"};
    String[] array_name_animals = new String[] { "Kyle", "Fluffy Unicorn"};

    // Set images and names
    public void setArray(int position) {
        if (position == 0) {
            array_img = array_img_humans;
            array_name = array_name_humans;
        }
        else if (position == 1) {
            array_img = array_img_yellow_minions;
            array_name = array_name_yellow;
        }
        else if (position == 2) {
            array_img = array_img_purple_minions;
            array_name = array_name_purple;
        }
        else if (position == 3) {
            array_img = array_img_animals;
            array_name = array_name_animals;
        }
    }

    @Override
    public long getItemId(int position) {
        return array_img[position];
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public int getCount() {
        return array_img.length;
    }

    Context _context;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) _context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        System.out.println("In CharacterList "+position);
        View rowView = inflater.inflate(R.layout.character_list, parent, false);

        TextView textView = (TextView) rowView.findViewById(R.id.label);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);

        textView.setText(array_name[position]);

        imageView.setImageResource(array_img[position]);

        return rowView;
    }

    public CharacterList(Context context) {
        super();
        _context = context;
    }
}