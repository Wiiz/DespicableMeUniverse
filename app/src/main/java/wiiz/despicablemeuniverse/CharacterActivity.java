package wiiz.despicablemeuniverse;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class CharacterActivity extends ListActivity {
    int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Create new Bundle
        Bundle objectBundle = this.getIntent().getExtras();
        if(objectBundle != null) {
            position = objectBundle.getInt("positionParent");
        }
        super.onCreate(savedInstanceState);
        CharacterList adaptator = new CharacterList(this);
        adaptator.setArray(position);
        setListAdapter(adaptator);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        int positionParent = 0;
        Bundle firstBundle = this.getIntent().getExtras();
        if(firstBundle != null) {
            positionParent = firstBundle.getInt("positionParent");
        }

        Intent intent = new Intent(CharacterActivity.this,DescriptionActivity.class);
        // Put infos in Bundle
        Bundle bundle = new Bundle();
        bundle.putInt("positionParent", positionParent);
        bundle.putInt("positionChild", position);

        intent.putExtras(bundle);
        startActivity(intent);
    }

}
