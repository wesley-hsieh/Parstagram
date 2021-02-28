package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("hLDtuYQKW5vUvMNIh8cah2elZA29P3t5fbak3psd")
                .clientKey("M8xUKsjPN2da8qTkpBZ5dNJH9VVOflNj13IhaE3Z")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}
