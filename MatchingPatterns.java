
package matchingpatterns;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class MatchingPatterns {
   static String wifiName = "Guess_Me"; 
   static String password = "include?_2021"; 
      
    public static void main(String[] args) {
     System.out.println("WiFi Name/SSID: "+wifiName); 
      System.out.println("Password: "+password);
     
      System.out.println("\nEnter WiFi Name: ");
      Scanner scan = new Scanner(System.in); 
      String wifiSSID = scan.next(); 
      
      System.out.println("Enter Password: ");
      String inputPass = scan.next(); 
      inputUser(wifiSSID,inputPass); 
       
      
      
    }
    public static boolean valWiFi(String input){
      String regexWiFi= "^[A-Z][a-z]+[_][A-Z][a-z]$"; 
      Pattern wifiPattern = Pattern.compile(regexWiFi, Pattern.CASE_INSENSITIVE); 
      Matcher match = wifiPattern.matcher(input); 
      return match.find();
      
}
     public static boolean valPass(String input){
      String regexPass= "^[a-z]+[?][_][0-9]+$";
      Pattern passPattern = Pattern.compile(regexPass, Pattern.CASE_INSENSITIVE);
      Matcher match = passPattern.matcher(input); 
      return match.find();
}
     
     
     public static void inputUser(String inputName, String inputPassword){

      if(!valWiFi(inputName)){
          System.out.println("\nIncorrect Name!");
        }
      if(!valPass(inputPassword)){
          System.out.println("\nIncorrect Password!");
      }
      
      if(valWiFi(inputName) && valPass(inputPassword)){
         System.out.println("\nConnected Successfully!");
     }
     else{
         System.out.println("Not Connected");
     
    
}
          }
    
}
