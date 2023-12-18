import java.util.Scanner;

 public class Flip{
 public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);//input method;
  
   System.out.print("Enter the number of flips: ");//input for number of flips
   int numberFlips=scanner.nextInt();


   if (numberFlips<=0)//invalud condition check
   {
    System.out.println("Invalid input");
    return;
   }

   int noHeads=0;
   int noTails=0;

   for(int i=0;i<numberFlips;i++)
   {
    double rand= Math.random();


    if (rand<0.5)
    noHeads++;
    else 
    noTails++;
   }


   double probHeads=noHeads*100/numberFlips;//probability of heads
   double probTails=noTails*100/numberFlips;//probability of tails


   System.out.println("Probability of heads:" + probHeads);
   System.out.println("Probability of tails:" + probTails);

   scanner.close();
 



 }
}