//Q4: Write a program to find the largest element of a given 2D array of integers.
package DSA.Assingment1;

import java.util.Scanner;

public class Matrix2DLar {
    public static void main(String[] args) {
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
        //We iterate the array
        int largest=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]>largest){
                largest=arr[i][j];
                
            }
            }
        }
        System.out.println("Output: "+largest);
    }
}
