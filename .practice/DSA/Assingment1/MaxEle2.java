package DSA.Assingment1;

public class MaxEle2 {
    public static void main(String[] args) {
        int arr[]={4,3,6,7,1};
        int n=arr.length;
        int Max=arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]>Max){
                Max=arr[i];
            }
        }
        System.out.println("Maximum Number:" +Max);
    }
}
