package com.ftninformatika.termin15drugiprojekat;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MojListAdapter extends BaseAdapter {

    private Activity activity;
    private List<Song> items;

    public MojListAdapter(Activity activity, List<Song> items){
        this.activity = activity;
        this.items = items;
    }
    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = activity.getLayoutInflater().inflate(R.layout.single_song_item,null);
        }
        TextView tvSongTitle = convertView.findViewById(R.id.tvSongTitle);
        tvSongTitle.setText(items.get(position).getTitle());

        TextView tvSongAuthor = convertView.findViewById(R.id.tvSongAuthor);
        tvSongAuthor.setText(items.get(position).getAuthor());

        return convertView;
    }
}
