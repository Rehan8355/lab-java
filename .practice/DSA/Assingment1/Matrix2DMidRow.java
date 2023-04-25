/*Q5: Write a function which accepts a 2D array of integers and its size as arguments and
displays the elements of middle row and the elements of middle column. Printing can
be done in any order.
[Assuming the 2D Array to be a square matrix with odd dimensions i.e. 3x3, 5x5, 7x7 etc...] */
package DSA.Assingment1;

import java.util.Scanner;

public class Matrix2DMidRow {
    public static void MiddleRC(int arr[][],int m,int n){
        System.out.print("Output:");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i==(m-1)/2||j==(n-1)/2){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
    public static void main(String[] args) {
         //we take the input from the user only 
        // note*: only  odd dimensions.
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
        MiddleRC(arr, m, n);
    }
}
    
