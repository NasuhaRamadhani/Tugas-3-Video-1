package com.appmob.appmob;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DitlantasPolda extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listAction = new String[]{"Website", "Lokasi",
                "Call Center","Lebih Lanjut", "Keluar"};
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
            if (pilihan.equals("Website")) {
                String website = "https://www.ditlantaspoldariau.com/";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));

            } else if (pilihan.equals("Lokasi")) {
                String lokasi = "google.navigation:q=0.53730,101.44238";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(lokasi));

            } else if (pilihan.equals("Call Center")) {
                String call = "tel:085878173340";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(call));

            } else if (pilihan.equals("Lebih Lanjut")) {
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY, "Ditlantas Polda Riau");

            }

            startActivity(a);

        } catch (Exception e) {
            e.printStackTrace();
        }
        {
        }
    }
}
