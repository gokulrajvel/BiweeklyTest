import java.util.Scanner;

public class RearrangeWordsSolver {
    public static void main(String[] args) {
        RearrangeWordsSolver solver = new RearrangeWordsSolver();
        Scanner input = new Scanner(System.in);
        String str=input.nextLine();
        System.out.print(solver.rearrangeWords(str));
    }
    public String rearrangeWords(String str) {
        String[] words = str.toLowerCase().split(" ");
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(String word : words){
            max=Math.max(max,word.length());
            min=Math.min(min,word.length());
        }
        String str1="";
        boolean flag=true;
        for(int i=0;i<=max;i++){
            for(int j=0;j<words.length;j++){
                if(flag&&words[j].length()==min){
                    words[j]=words[j].substring(0,1).toUpperCase() + words[j].substring(1);
                    flag=false;
                }
                if(words[j].length()==i){
                    str1=str1+words[j]+" ";
                }

            }
        }

        return str1.trim();
    }
}
