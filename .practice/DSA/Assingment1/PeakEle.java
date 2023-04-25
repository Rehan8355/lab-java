/*Q5: Given an array. Find the first peak element in the array. A peak element is an element that is greater than
its just left and just right neighbor.
Input 1: arr[] = {1,3,2,6,5}
Output 1: 6 */
package DSA.Assingment1;

import javax.swing.text.StyledEditorKit.ForegroundAction;


public class PeakEle {
    public static int FindPeak(int arr[]){
        for(int i=0;i<arr.length;i++){
             if(i==0 && arr[0]>arr[1])return arr[0];
            //{
            //     System.out.println(arr[0]);
            // }
             if(i==arr.length && arr[i]>arr[arr.length-1] )return arr[arr.length];
            //{
            //  System.out.println(arr[arr.length-1]);
            // } 
            if(arr[i]>arr[i+1] && arr[i]>arr[i-1])return arr[i];
            // {
            //     System.out.println(arr[i]);
            // }
        }
        return -1;
    }
    
    public static void main(String[] args) {
 
    int arr[]={1,3,2,6,5};
   // int arr[]={4,7,3,2,6,5};
        FindPeak(arr);
    }
   


}
