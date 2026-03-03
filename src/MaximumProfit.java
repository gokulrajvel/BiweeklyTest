import java.util.Scanner;

public class MaximumProfit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]  arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        MaximumProfit obj=new MaximumProfit();
        System.out.println(obj.maximumProfit(arr));
    }
    int maximumProfit(int[] arr) {
        int minValue=Integer.MAX_VALUE;
        int result =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minValue){
                minValue=arr[i];
            }
            else
            {
                if(result<arr[i]-minValue){
                    result =arr[i]-minValue;
                }
            }
        }
        return result;
    }
}
