import java.util.*;

public class KthLargestElementArray {
    public static void main(String[] args) {
        KthLargestElementArray obj = new KthLargestElementArray();
        ArrayList<Integer> nums=new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the size of the array");
//        int size = sc.nextInt();
//        for(int i=0;i<size;i++){
//            nums.add(sc.nextInt());
//        }
        nums.add(3);
        nums.add(2);
        nums.add(3);
        nums.add(1);
        nums.add(2);
        nums.add(4);
        nums.add(5);
        nums.add(5);
        nums.add(6);
        int k=4;
        int val=obj.solve(nums,k);
        System.out.println(val);
    }
    // without sort the arrayList
    int solve(ArrayList<Integer> nums, int k) {
        while (k-- > 0) {
                 int index = 0, max = Integer.MIN_VALUE;
                 for (int i = 0; i < nums.size(); i++) {
                     if (nums.get(i) >= 0 && max < nums.get(i)) {
                         max = nums.get(i);
                         index = i;
                     }
                 }
                 nums.set(index,Integer.MIN_VALUE);
                 if (k == 0)
                     return max;
             }
             return -1;
    }
}
//        int[] arr=new int[k];
//        int val=0;
//        for(int i=0;i< nums.size();i++){
//            int max=-1,index=-1;
//            for(int j=0;j<nums.size();j++){
//                if(max<nums.get(j)){
//                    max=nums.get(j);
//                    index=j;
//                }
//            }
//            nums.remove(index);
//            if(val<k)
//                arr[val++]=(max);
//            else if(val>=k)
//                break;
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(nums);
//
//        return arr[val];
