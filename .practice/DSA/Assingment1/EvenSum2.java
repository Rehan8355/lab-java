package DSA.Assingment1;

public class EvenSum2 {
    public static void main(String[] args) {
        int arr[]={4,3,6,7,1};
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                sum+=arr[i];
            }
            
        }
        System.out.println("Sum of even indices of the Array: "+sum);
    }
}
