import java.util.Scanner;

public class RearrangeWordsSolver {
    public static void main(String[] args) {
        RearrangeWordsSolver solver = new RearrangeWordsSolver();
        Scanner input = new Scanner(System.in);
        String str=input.nextLine();
        System.out.print(solver.rearrangeWords(str));
    }
    public String rearrangeWords(String str) {
        String[] words = str.split(" ");
        int max=Integer.MIN_VALUE;
        for(String word : words){
            max=Math.max(max,word.length());
        }
        String str1="";
        for(int i=0;i<=max;i++){
            for(int j=0;j<words.length;j++){
                if(words[j].length()==i){
                    str1=str1+words[j]+" ";
                }
            }
        }
        return str1;
    }
}
