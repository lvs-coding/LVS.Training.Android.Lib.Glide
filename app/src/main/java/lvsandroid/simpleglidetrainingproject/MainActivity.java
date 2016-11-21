package lvsandroid.simpleglidetrainingproject;

/*
Glide is an Image Loader Library for Android developed by bumptech and is a library that is
recommended by Google. It has been used in many Google open source projects including Google
I/O 2014 official application.

You can configure Glide by creating a GlideConfiguration.java file

https://github.com/codepath/android_guides/wiki/Displaying-Images-with-the-Glide-Library
https://github.com/bumptech/glide
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize ImageView
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);

        //Loading image from below url into imageView
        Glide.with(this)
                .load("https://www.google.fr/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png")
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.imagenotfound)
                .into(imageView);

        //Cropping
        Glide.with(this)
                .load("https://www.google.fr/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png")
                .centerCrop()
                .into(imageView2);

    }
}
