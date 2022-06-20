import java.util.*;
public class Main {
 public static void main(String[] args) 
 {
 Scanner input= new Scanner(System.in);
  System.out.println("Election 2022");
  System.out.println();  
    String [] names = new String [6];
    int [] votes = new int [6];
    int total=0;
    double [] percent = new double [6];
    int high=0;
    int winner=0;
    int win=0;
         System.out.println("Enter necessary information below!");
         for (int c=1; c<names.length; c++)
         {
             System.out.println("Name of Candidate " +c+ ":");
             names [c] = input.nextLine();
         }
        for (int v=1; v<votes.length; v++)
        {
             System.out.println("No. of Vote for Candidate " +v+ ":");
             votes [v] = input.nextInt();
         }
       for (int t=1; t<6; t++)
       {
         total=total + votes[t];
       }
       for (int p=1; p<6; p++)
       {
           percent [p] = votes[p]* 100/total;
       }
       for (int w=0; w<names.length; w++) 
      {
       if (votes[w]>win)
       {    
       win = w;       
      }}
       System.out.println("\nCandidates\tAccumulated Votes\tIn Percentage");
  System.out.println();   
       for (int a=1; a<6; a++)  
       {
         System.out.println(names[a] +"\t\t"+ votes[a] +"\t\t"+ percent [a] + "%");
       }  
       System.out.println("Total Votes: " +total);
      System.out.println("The winner is " +names[win]);         
}}