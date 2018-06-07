package com.example.jsonframework2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private String TAG = "lxh";
    private String json;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClick(View view){
        /*User user = new User("lisi", 123456L, false);
        Log.i(TAG, FastJson.toJson(user));*/



        News news = new News();
        news.setId(1);
        news.setTitle("新年放假通知");
        news.setContent("从今天开始放假啦。");
        news.setAuthor(createAuthor());
        news.setReader(createReaders());
        Log.i(TAG, FastJson.toJson(news));
        json = FastJson.toJson(news);
    }
    private static List<User2> createReaders() {
        List<User2> readers = new ArrayList<User2>();
        User2 readerA = new User2();
        readerA.setId(2);
        readerA.setName("Jack");
        readers.add(readerA);

        User2 readerB = new User2();
        readerB.setId(1);
        readerB.setName("Lucy");
        readers.add(readerB);

        return readers;
    }

    private static User2 createAuthor() {
        User2 author = new User2();
        author.setId(1);
        author.setName("Fancyy");
        author.setPwd("123456");
        return author;
    }

    public void onShow(View view){
        News news1 = (News) FastJson.parseObject(json, News.class);
        Log.i(TAG, "onShow: "+ news1.toString());
    }
}
