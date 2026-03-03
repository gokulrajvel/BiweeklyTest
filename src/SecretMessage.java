import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SecretMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str=scan.nextLine();
        SecretMessage obj = new SecretMessage();
        System.out.println(obj.decodeMessage(str));
    }
    int decodeMessage(String message){
        int[] arr=new int[27];
        List<String> list=new ArrayList<>();
        int result=0;
        int value=Integer.parseInt(message);
        while(value>0){
            int last=value%10;
            int first=value/10;
            if(first<=26&&first!=0){
                arr[first]++;
            }
            if(last!=0)
                arr[last]++;
            value=value/10;
        }
        System.out.println(Arrays.toString(arr));
        for(int val:arr){
            if(val>0)
                result++;
        }
        return result;
    }
}
