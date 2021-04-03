package com.appmob.appmob;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Mall extends ListActivity {
    protected void onCreate (Bundle icicle) {
        super.onCreate(icicle);
        String[] listRumahSakit = new String[] {"Mall SKA Pekanbaru", "Living World Pekanbaru",
                "Transmart Pekanbaru", "Mall Ciputra Seraya Pekanbaru"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listRumahSakit));
    }

    protected void onListItemClick (ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkan(pilihan);
    }

    private void tampilkan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Mall SKA Pekanbaru")) {
                a = new Intent(this, SKAPku.class);

            } else if (pilihan.equals("Living World Pekanbaru")) {
                a = new Intent(this, LWPku.class);

            } else if (pilihan.equals("Transmart Pekanbaru")) {
                a = new Intent(this, TRMPku.class);

            } else if (pilihan.equals("Mall Ciputra Seraya Pekanbaru")) {
                a = new Intent(this, CiputPku.class);

            }

            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
