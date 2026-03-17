import java.util.Scanner;

public class EditDistanceBetweenTwoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first string");
        String first = sc.next();
        System.out.println("enter the second string");
        String second = sc.next();
        System.out.println(EditDistanceBetweenTwoStrings.solve(first,second));
    }
    public static int solve(String word1, String word2) {
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        int[][] arr=new int[word1.length()+1][word2.length()+1];
        for(int i=0;i<=word1.length();i++){
            arr[i][0]=i;
        }
        for(int i=0;i<=word2.length();i++){
            arr[0][i]=i;
        }
        for(int i=1;i<=word1.length();i++){
            for(int j=1;j<=word2.length();j++){
                if (word1.charAt(i-1)==word2.charAt(j-1)){
                    arr[i][j]=arr[i-1][j-1];
                }else {
                    arr[i][j]=Math.min(arr[i-1][j-1],Math.min(arr[i-1][j],arr[i][j-1]))+1;
                }
            }
        }
        return arr[word1.length()][word2.length()];
    }
}

