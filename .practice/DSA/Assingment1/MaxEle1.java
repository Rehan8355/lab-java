/*Q3: Write a program to calculate the maximum element in the array.
Input 1: arr[] = {34,21,54,65,43} */
package DSA.Assingment1;

public class MaxEle1 {
    public static void main(String[] args) {
        int arr[]={34,21,54,65,43};
        int n=arr.length;
        int Max=arr[0];
        for(int i=0; i<n;i++){
                if(arr[i]> Max ){
                    Max=arr[i];
               }
                
            }
            System.out.println("Maximum :"+Max);
        }
    }

