/*Q1: Take m and n input from the user and m * n integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0. */
package DSA.Assingment1;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;

public class Matrix2D{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no of rows:");
        int m=sc.nextInt();
        System.out.println("Enter the no of column:");
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("Enter the no of element:");
        int countP=0; //for psitive
        int countN=0; // for negative
        int countO=0; // for Odd 
        int countE=0; // for Even
        int countZ=0; // for Zero

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
               
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int a=arr[i][j];
                if(a<0 ) //conditrion for Negative
                {
                    countN++;
                    if(a%2==0){ //condition fo Even
                        countE++;
                    }
                    else{
                        countO++; // odd

                    }
                }
                else if(a>0){ // condition  for Positive
                    countP++;
                    if(a%2==0){ // condition for Even
                        countE++;
                    } 
                    else{ //condition for Odd
                        countO++;
                    }
                }
                else{ //for Zero its alway a even
                    countZ++;
                    countE++;
                }
          
            }
        }
        //Print the output
        System.out.println("Numbers of positive Numbers: "+countP);
        System.out.println("Numbers of Negative Numbers: "+countN);
        System.out.println("Numbers of Odd Numbers: "+countO);
        System.out.println("Numbers of even  Numbers: "+countE);
        System.out.println("Numbers of 0 Numbers: "+countZ);
    }
}