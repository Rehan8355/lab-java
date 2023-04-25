/*Q4: Write a program to find out the second largest element in a given array.
Input 1: arr[] = {34,21,54,65,43}
Output 1: 54 */
package DSA.Assingment1;

public class SecondMaxNo1 {
    public static void main(String[] args) {
        int arr[]={34,21,54,5,43};
      // int arr[]={4,3,6,7,1};
        int n=arr.length;
        int Max=arr[0];
        int SecondMax=arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]>Max){
                Max=arr[i];
            }
        }
        for(int i=0; i<n; i++){
            if(arr[i]>SecondMax && arr[i]<Max){
                SecondMax=arr[i];
            }
        }
        System.out.println("Second Largest Element: "+SecondMax);
        System.out.println("Maximum: "+Max);
    }
}
