package com.appmob.appmob;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Universitas extends ListActivity {
    protected void onCreate (Bundle icicle) {
        super.onCreate(icicle);
        String[] listRumahSakit = new String[] {"Universitas Riau", "UIN Suska Riau",
                "Universitas Islam Riau", "Universitas Lancang Kuning"};
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
            if (pilihan.equals("Universitas Riau")) {
                a = new Intent(this, unri.class);

            } else if (pilihan.equals("UIN Suska Riau")) {
                a = new Intent(this, usr.class);

            } else if (pilihan.equals("Universitas Islam Riau")) {
                a = new Intent(this, uir.class);

            } else if (pilihan.equals("Universitas Lancang Kuning")) {
                a = new Intent(this, unilak.class);

            }

            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}