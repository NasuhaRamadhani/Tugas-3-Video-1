package com.appmob.appmob;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LWPku extends ListActivity {
    protected void onCreate (Bundle icicle) {
        super.onCreate(icicle);
        String[] listAction = new String[] {"Website", "Lokasi",
                "Call Center", "Lebih Lanjut", "Keluar"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listAction));
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
            if (pilihan.equals("Website")) {
                String website = "https://www.instagram.com/livingworld_pbr/?hl=id";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));

            } else if (pilihan.equals("Lokasi")) {
                String lokasi = "google.navigation:q=0.50062,101.41979";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(lokasi));


            } else if (pilihan.equals("Call Center")) {
                String call = "tel:0761-6706100";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(call));

            } else if (pilihan.equals("Lebih Lanjut")) {
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY,"Living World Pekanbaru");
            }

            startActivity(a);

        } catch (Exception e) {
            e.printStackTrace();
        }
        {
        }
    }
}