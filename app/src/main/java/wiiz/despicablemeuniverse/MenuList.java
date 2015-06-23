package wiiz.despicablemeuniverse;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MenuList extends BaseAdapter {

    private Integer[] array_img_menu = {
            R.drawable.human, R.drawable.minions1,
            R.drawable.evil, R.drawable.animal};

    String[] values = new String[] { "Humans", "Minions", "Evil Minions",
            "Animals" };

    @Override
    public long getItemId(int position) {
        return array_img_menu[position];
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public int getCount() {
        return array_img_menu.length;
    }

    Context _context;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) _context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.activity_main, parent, false);

        TextView textView = (TextView) rowView.findViewById(R.id.label);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);

        textView.setText(values[position]);

        imageView.setImageResource(array_img_menu[position]);

        return rowView;
    }

    public MenuList(Context context) {
        super();
        _context = context;
    }
}