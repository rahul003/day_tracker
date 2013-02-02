package com.example.better;
import java.util.Timer;
import java.util.TimerTask;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Handler.Callback;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity 
{
	int duration = Toast.LENGTH_SHORT;
	int duration1 = Toast.LENGTH_LONG;
	int index;
    TextView text1;
    int i=1;
    long starttime = 0;
    long millis=0;
    final Handler h = new Handler(new Callback() 
    {
    	public boolean handleMessage(Message msg) 
        {
           millis = System.currentTimeMillis() - starttime;
           int seconds = (int) (millis / 1000);
           int minutes = seconds / 60;
           seconds = seconds % 60;
           int hours = minutes/60;
           text1.setText(String.format("%02d:%02d:%02d",hours, minutes, seconds));
           return false;
        }
    });
    class firstTask extends TimerTask
    {
 	   @Override
         public void run() {h.sendEmptyMessage(0); }
    };

    Timer timer = new Timer();
    //end of button1
    //begin2
    TextView text2;
    int i2=1;
    long starttime2 = 0;
    long millis2=0;
    final Handler h2 = new Handler(new Callback() 
    {
    	public boolean handleMessage(Message msg) 
        {
           millis2 = System.currentTimeMillis() - starttime2;
           int seconds2 = (int) (millis2 / 1000);
           int minutes2 = seconds2 / 60;
           seconds2 = seconds2 % 60;
           int hours2 = minutes2/60;
           text2.setText(String.format("%02d:%02d:%02d",hours2, minutes2, seconds2));
           return false;
        }
    });
   class firstTask2 extends TimerTask
   {
 	   @Override
        public void run() {h2.sendEmptyMessage(0); }//check
   };
   Timer timer2 = new Timer();
   //end of button2
   //button3
   TextView text3;
   int i3=1;
   long starttime3 = 0;
   long millis3=0;
   final Handler h3 = new Handler(new Callback() 
   {
   	public boolean handleMessage(Message msg) 
       {
          millis3 = System.currentTimeMillis() - starttime3;
          int seconds3 = (int) (millis3 / 1000);
          int minutes3 = seconds3 / 60;
          seconds3 = seconds3 % 60;
          int hours3 = minutes3/60;
          text3.setText(String.format("%02d:%02d:%02d",hours3, minutes3, seconds3));
          return false;
       }
   });
  class firstTask3 extends TimerTask
  {
	   @Override
       public void run() {h3.sendEmptyMessage(0); }//check
  };
  Timer timer3 = new Timer();
  //end of button3
  //button4
  TextView text4;
  int i4=1;
  long starttime4 = 0;
  long millis4=0;
  final Handler h4 = new Handler(new Callback() 
  {
  	public boolean handleMessage(Message msg) 
      {
         millis4 = System.currentTimeMillis() - starttime4;
         int seconds4 = (int) (millis4 / 1000);
         int minutes4 = seconds4 / 60;
         seconds4 = seconds4 % 60;
         int hours4 = minutes4/60;
         text4.setText(String.format("%02d:%02d:%02d",hours4, minutes4, seconds4));
         return false;
      }
  });
 class firstTask4 extends TimerTask
 {
	   @Override
      public void run() {h4.sendEmptyMessage(0); }//check
 };
 Timer timer4 = new Timer();
   //end of button4
//button5
 TextView text5;
 int i5=1;
 long starttime5 = 0;
 long millis5=0;
 final Handler h5 = new Handler(new Callback() 
 {
 	public boolean handleMessage(Message msg) 
     {
        millis5 = System.currentTimeMillis() - starttime5;
        int seconds5 = (int) (millis5 / 1000);
        int minutes5 = seconds5 / 60;
        seconds5 = seconds5 % 60;
        int hours5 = minutes5/60;
        text5.setText(String.format("%02d:%02d:%02d",hours5, minutes5, seconds5));
        return false;
     }
 });
class firstTask5 extends TimerTask
{
	   @Override
     public void run() {h5.sendEmptyMessage(0); }//check
};
Timer timer5 = new Timer();
 //end button5
   //common part
   public void onCreate(Bundle savedInstanceState) 
   {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//start button1
        text1 = (TextView)findViewById(R.id.text1);
        Button b = (Button)findViewById(R.id.button1);
        b.setBackgroundResource(R.color.orange);
        b.setOnClickListener
        (new View.OnClickListener() {

            public void onClick(View v) 
            {
                Button b = (Button)v;
                i=i+1;
                if(i%2!=0)
                {
              
                  b.setBackgroundResource(R.color.orange);
                  timer.cancel();
                  //timer.purge();
                }
                else 
                {   
                	    timer.cancel();
                		timer2.cancel();
                		timer3.cancel();
                		timer4.cancel();
                		timer5.cancel();
                        Context context1 = getApplicationContext();
                        CharSequence text1 = "Study timer activated";
                        Toast toast = Toast.makeText(context1, text1, duration);
                        toast.show();
                	b.setBackgroundResource(R.color.green);
                    starttime = System.currentTimeMillis()-millis;
                    timer = new Timer();
                    timer.schedule(new firstTask(), 0,500);
                }
            }
        }
        );
        
 //end button1
       
        text2 = (TextView)findViewById(R.id.text2);
        Button b2 = (Button)findViewById(R.id.button2);
        b2.setBackgroundResource(R.color.orange);
        b2.setOnClickListener
        (new View.OnClickListener() {
        	public void onClick(View v2) //v2 check
            {Button b2 = (Button)v2;
                i2=i2+1;
                if((i2)%2!=0)
                {
                	
                    b2.setBackgroundResource(R.color.orange);
                  timer2.cancel();
                  timer2.purge();
                }
                else
                { 
                	timer.cancel();
            		timer2.cancel();
            		timer3.cancel();
            		timer4.cancel();
            		timer5.cancel();
            		Context context2 = getApplicationContext();
                    CharSequence text2 = "Sports timer activated";
                    Toast toast = Toast.makeText(context2, text2, duration);
                    toast.show();
                b2.setBackgroundResource(R.color.green);
                    starttime2 = System.currentTimeMillis()-millis2;
                    timer2 = new Timer();
                    timer2.schedule(new firstTask2(), 0,500); } }});
   //second button
   text3 = (TextView)findViewById(R.id.text3);
   Button b3 = (Button)findViewById(R.id.button3);
   b3.setBackgroundResource(R.color.orange);
   b3.setOnClickListener
   (new View.OnClickListener() {
   	public void onClick(View v3) //v2 check
       {Button b3 = (Button)v3;
           i3=i3+1;
           if((i3)%2!=0)
           { b3.setBackgroundResource(R.color.orange);
             timer3.cancel();
             timer3.purge();
           }
           else
           {   
        	   timer.cancel();
       		timer2.cancel();
       		timer3.cancel();
       		timer4.cancel();
       		timer5.cancel();
       		Context context3 = getApplicationContext();
            CharSequence text3 = "Gaming timer activated";
            Toast toast = Toast.makeText(context3, text3, duration);
            toast.show();
       		b3.setBackgroundResource(R.color.green);
               starttime3 = System.currentTimeMillis()-millis3;
               timer3 = new Timer();
               timer3.schedule(new firstTask3(), 0,500); } }});
//end3
//4
text4 = (TextView)findViewById(R.id.text4);
Button b4 = (Button)findViewById(R.id.button4);
b4.setBackgroundResource(R.color.orange);
b4.setOnClickListener
(new View.OnClickListener() {
	public void onClick(View v4) //v2 check
    {Button b4 = (Button)v4;
        i4=i4+1;
        if((i4)%2!=0)
        { b4.setBackgroundResource(R.color.orange);
          timer4.cancel();
          timer4.purge();
        }
        else
        {  timer.cancel();
		timer2.cancel();
		timer3.cancel();
		timer4.cancel();
		timer5.cancel();
		Context context4 = getApplicationContext();
        CharSequence text4 = "Sleep timer activated";
        Toast toast = Toast.makeText(context4, text4, duration);
        toast.show();
		b4.setBackgroundResource(R.color.green);
            starttime4 = System.currentTimeMillis()-millis4;
            timer4 = new Timer();
            timer4.schedule(new firstTask4(), 0,500); } }});
//end4
//5
            text5 = (TextView)findViewById(R.id.text5);
            Button b5 = (Button)findViewById(R.id.button5);
            b5.setBackgroundResource(R.color.orange);
            b5.setOnClickListener
            (new View.OnClickListener() {
            	public void onClick(View v5) //v2 check
                {
            		
            		Button b5 = (Button)v5;
                    i5=i5+1;
                    if((i5)%2!=0)
                    { b5.setBackgroundResource(R.color.orange);
                      timer5.cancel();
                      timer5.purge();
                    }
                    else
                    {  timer.cancel();
            		timer2.cancel();
            		timer3.cancel();
            		timer4.cancel();
            		timer5.cancel();
            		Context context5 = getApplicationContext();
                    CharSequence text5 = "Miscellaneous timer activated";
                    Toast toast = Toast.makeText(context5, text5, duration);
                    toast.show();
            		b5.setBackgroundResource(R.color.green);
                        starttime5 = System.currentTimeMillis()-millis5;
                        timer5 = new Timer();
                        timer5.schedule(new firstTask5(), 0,500); } }});
            Button b8 = (Button)findViewById(R.id.button8);
            b8.setText("Analyze Time");
            b8.setOnClickListener(new View.OnClickListener() {
            	
            	public void onClick(View v) {
            		Context context11 = getApplicationContext();
            		long sum=(long)(millis+millis2+millis3+millis4+millis5);
            		float avg1 = (float) ((millis*1.0/sum)*100);
            		float avg2 = (float) ((millis2*1.0/sum)*100);
            		float avg3 = (float) ((millis3*1.0/sum)*100);
            		float avg4 = (float) ((millis4*1.0/sum)*100);
            		float avg5 = (float) ((millis5*1.0/sum)*100);
            		String a="Study time : " + Float.toString(avg1)+"% \n" + "Sports time : "+ Float.toString(avg2)+"% \n" 
            				+ "Gaming time : " + Float.toString(avg3)+"% \n" + "Sleep time : " + Float.toString(avg4)+"% \n" + "Misc. Time : " + Float.toString(avg5)+"% \n";             
                    Toast toast = Toast.makeText(context11, a, duration1);
                    toast.show();
            	}
            });
            
           Button b6 = (Button)findViewById(R.id.button6);
           b6.setText("The team");
           b6.setOnClickListener(new View.OnClickListener() {
            	
           public void onClick(View v) {
            	
                  		Intent i6 = new Intent(MainActivity.this,Analyzio.class);
           		startActivity(i6);
            	}
            });
            

            
            
   }}
//end5
 
  
  //end
