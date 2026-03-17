import java.util.ArrayList;
import java.util.Scanner;

public class MaximumProductWordLengths {
    public static void main(String[] args) {
        MaximumProductWordLengths obj = new MaximumProductWordLengths();
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        ArrayList<String> words=new ArrayList<>();
        for (int i = 0; i < size; i++) {
            words.add(sc.next());
        }
        int val= obj.solve(words);
        System.out.println(val);
    }
    public int solve(ArrayList<String> words) {
        int max=0;
        for(int i=0;i<words.size();i++){
            for(int j=i+1;j<words.size();j++){
                char[] first=words.get(i).toCharArray();
                char[] second=words.get(j).toCharArray();
                int l=0;
                boolean flag=true;
                for(int k=0;k<first.length;k++){
                    for(int j1=0;j1<second.length;j1++){
                        if(l<second.length&&first[k]==second[j1]){
                            flag=false;
                            break;
                        }
                    }
                    if(!flag){
                        break;
                    }
                }
                if(flag){
                    max=Math.max(max,first.length*second.length);
                }
            }
        }
        return max;
    }
}

//input 1
//7
//a
//ab
//abc
//d
//cd
//bcd
//abcd

//input 2

//6
//abcw
//baz
//foo
//bar
//xtfn
//abcdef