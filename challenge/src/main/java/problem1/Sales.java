package problem1;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        //asking the user for salespeople number
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of salespeople:");
        final int SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        int sum;

        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;

        int minIndex=0;

        int maxIndex=0;
        for (int i=0; i<sales.length; i++)
        {
            if (sales[i] >sales[maxIndex]){

                maxIndex=i;

            }
            if (sales[i] < sales[minIndex]){

                // we use i+1 so that no salesperson has the id 0
                minIndex=i;
            }
            System.out.println(" " + i + " " + sales[i]);
            sum += sales[i];
        }
        System.out.println("\nTotal sales: " + sum);
        System.out.println("\nAverage sales : " +(double) sum/sales.length);
        //we use maxIndex+1 and minINdex+1 so that no salesperson has an index equals to 0
        System.out.println("\nSalesperson "+(maxIndex+1)+" had the highest sale with $"+sales[maxIndex]);
        System.out.println("\nSalesperson "+(minIndex+1)+" had the lowest sale with $"+sales[minIndex]);
        System.out.println("Eneter an amount:");
        int amount = scan.nextInt();
        int numOfSalesPeople=0;
        for (int i=0; i<sales.length; i++){
            if (sales[i]>amount){
                numOfSalesPeople++;
                // we use salesperson i+1 so that no salesperson has the id 0
                System.out.println("Salesperson " +(i+1)+" has $"+ sales[i]+" sales that exceed $"+amount);
            }
        }
        System.out.println("The number of salespeople whose sales are bigger than $"+amount+" is "+numOfSalesPeople);


    }
}