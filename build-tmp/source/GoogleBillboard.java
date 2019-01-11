import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class GoogleBillboard extends PApplet {

public final static String e = "2.718281828459045235360287471352662497757247093699959574966967627724076630353547594571382178525166427427466391932003059";  
public void setup()  
{ 
System.out.println(isPrime(7.182818284e9f));           
double x = 0;
  for (int i= 2; /*isPrime(x) == false*/ i<= e.length() ; i++)
  {

    x = Double.parseDouble(e.substring(i,i+10));
    if (isPrime(x) == true)
      break;
  }  

System.out.println(x);

}

public void draw()  
{   
  //not needed for this assignment
}  

public boolean isPrime(double num)
{
  
  if (num <= 1)
  {
    return false;
  }
  for(int i = 2; i <= Math.sqrt(num); i++)
  {


   if ( ((double)num/i) == (Math.floor(num/i)) )
   {
     return false;

   }/*

   if (num%i == 0)
   {
    return false;
   } */
  }
  
    return true;
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "GoogleBillboard" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
