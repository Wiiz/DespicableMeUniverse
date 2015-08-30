package wiiz.despicablemeuniverse;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Display Menu list
        MenuList adaptator = new MenuList(this);
        setListAdapter(adaptator);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

        Intent intent = new Intent(MainActivity.this,CharacterActivity.class);
        Bundle bundle = new Bundle();
        // On click send positition (which menu is selected)
        bundle.putInt("positionParent", position);
        intent.putExtras(bundle);
        startActivity(intent);
    }

}
