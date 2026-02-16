import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MinFrogsSolver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        MinFrogsSolver solver = new MinFrogsSolver();
        System.out.println(solver.minFrogsSolver(str));
    }
    public int minFrogsSolver(String str) {
        if (str.length()%5 !=0) {
            return -1;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        boolean flag = true;
        for (int i = 0; i < str.length()-1; i++) {
            if (map.get(str.charAt(i)) != map.get(str.charAt(i+1)) ) {
                flag = false;
            }
        }
        return !flag ? -1 : str.contains("croak")?1:map.get(str.charAt(str.length()-1));
    }
}
