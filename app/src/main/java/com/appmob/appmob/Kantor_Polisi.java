package com.appmob.appmob;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Kantor_Polisi extends ListActivity {
    protected void onCreate (Bundle icicle) {
        super.onCreate(icicle);
        String[] listKantorPolisi = new String[] {"Polda Riau", "Ditlantas Polda Riau", "Polresta Pekanbaru"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listKantorPolisi));
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
            if (pilihan.equals("Polda Riau")) {
                a = new Intent(this, PoldaRiau.class);

            } else if (pilihan.equals("Ditlantas Polda Riau")) {
                a = new Intent(this, DitlantasPolda.class);

            } else if (pilihan.equals("Polresta Pekanbaru")) {
                a = new Intent(this, PolrestaPku.class);
            }

            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
