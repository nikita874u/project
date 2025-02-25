//package projects.project;
import java.util.Random;
import java.util.Scanner;

public class rockpaper{
    public static void main(String args[]){
   // int rock=0;
   //int paper=1;
   //int scissor=2;
    Scanner sc = new Scanner(System.in);
    System.out.println("user move");
    int userinput=sc.nextInt();

 Random rnd = new Random();
 int computerinput=rnd.nextInt(3);

if(computerinput==userinput){
     System.out.println("draw or no one wins or no one loss");
}
else if(computerinput==0 && userinput==1 || computerinput==1 && userinput==2 || computerinput==2 && userinput==0){
     System.out.println("human wins");
}
else{
    System.out.println("computer wins");
}
System.out.println("computer choice is " +computerinput);
if(computerinput==0){
      System.out.println("computer choice is rock");
}
else if(computerinput==1){
     System.out.println("computer choice is paper");
}
else{
    System.out .println("computer choice is scissor");
}
}
}