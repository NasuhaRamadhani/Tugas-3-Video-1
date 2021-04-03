package com.appmob.appmob;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PoldaRiau extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listAction = new String[]{"Tentang Polda Riau", "Lokasi",
                "Call Center", "Lebih Lanjut", "Keluar"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listAction));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkan(pilihan);
    }

    private void tampilkan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Tentang Polda Riau")) {
                String website = "https://id.wikipedia.org/wiki/Kepolisian_Daerah_Riau";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));

            } else if (pilihan.equals("Lokasi")) {
                String lokasi = "google.navigation:q=0.51231,101.45718";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(lokasi));

            } else if (pilihan.equals("Call Center")) {
                String call = "tel:0761-31307";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(call));

            } else if (pilihan.equals("Lebih Lanjut")) {
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY, "Polda Riau");
            }

            startActivity(a);

        } catch (Exception e) {
            e.printStackTrace();
        }
        {
        }
    }
}
