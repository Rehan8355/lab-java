/*Q2: write a program to print the elements above the secondary diagonal in a user inputted
square matrix. */
package DSA.Assingment1;

import java.util.Scanner;

public class MatrixDim {
    public static void main(String[] args) {
        //we take the input from the user only 
        // note*: only square matrix
        System.out.println("**Enter the Square Matrix**");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no Rows: ");
        int m=sc.nextInt();
        System.out.println("Enter the no Column: ");
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("Enter the Elements:");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        // we itrate the array 
        System.out.print("Output: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                // we put the condition to only print grater the diognal
                if(j+i<(m-1)){
                    System.out.print(arr[i][j]+" ");
                }
                
            
            }
        }
        System.out.println(); // for new line
    }
}
