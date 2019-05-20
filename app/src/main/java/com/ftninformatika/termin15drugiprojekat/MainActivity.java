package com.ftninformatika.termin15drugiprojekat;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private ListView lvSongList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvSongList = findViewById(R.id.lvSongList);
        MojListAdapter adapter = new MojListAdapter(this,generateSongs());
        lvSongList.setAdapter(adapter);
    }

    private List<Song> generateSongs(){
        List<Song> songs = new ArrayList<>();
        for (int i = 0;i<20;i++){
            songs.add(new Song("Title " + i, "Author " + i));

        }
        return songs;
    }
}
