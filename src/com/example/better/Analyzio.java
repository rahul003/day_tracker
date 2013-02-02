package com.example.better;

import android.os.Bundle;
import android.app.Activity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Pattern;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.os.Handler.Callback;
import android.view.View;
import android.widget.Button;

public class Analyzio extends Activity {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analyzio);
        Context context = getApplicationContext();
        CharSequence text = "Press back button on your phone to go back to the previous page";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        
        TextView tV1 = (TextView) findViewById(R.id.textView1);
        tV1.setMovementMethod(LinkMovementMethod.getInstance());
        String text1 = "<a href='http://facebook.com/harsha.nadimpalli'>Harsha Nadimpalli</a>";
        tV1.setText(Html.fromHtml(text1));
        
        TextView tV4= (TextView) findViewById(R.id.textView4);
        tV4.setMovementMethod(LinkMovementMethod.getInstance());
        String text4 = "<a href='http://www.facebook.com/sschhabra'>Simrat Singh</a>";
        tV4.setText(Html.fromHtml(text4));
        
        TextView tV2 = (TextView) findViewById(R.id.textView2);
        tV2.setMovementMethod(LinkMovementMethod.getInstance());
        String text2 = "<a href='http://facebook.com/vineet.k.doshi'>Vineet Doshi</a>";
        tV2.setText(Html.fromHtml(text2));
        
        TextView tV3 = (TextView) findViewById(R.id.textView3);
        tV3.setMovementMethod(LinkMovementMethod.getInstance());
        String text3 = "<a href='http://facebook.com/rahulhuilgol/'>Rahul Huilgol</a>";
        tV3.setText(Html.fromHtml(text3));
       
        TextView tV5 = (TextView) findViewById(R.id.textView5);
        tV5.setMovementMethod(LinkMovementMethod.getInstance());
        String text5 = "<a href='http://facebook.com/veenaveera'>Veera Anudeep</a>";
        tV5.setText(Html.fromHtml(text5));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_analyzio, menu);
        return true;
    }
}
