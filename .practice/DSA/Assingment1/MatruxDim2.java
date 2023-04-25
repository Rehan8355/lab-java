/*Q3: write a program to print the elements of both the diagonals in a user inputted square matrix
in any order.*/
package DSA.Assingment1;
import  java.util.*;

public class MatruxDim2 {
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
        //We iterate the array
        System.out.print("Output:");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i==j || i+j==n-1){
                    System.out.print(arr[i][j]+" ");
                }
                
            }
        }
        System.out.println();
    }
    
}
