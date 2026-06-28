import java.util.*;
public class ReverseAStringUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.nextLine();

        Deque<Character> stack = new ArrayDeque<>();

        for(char ch: str.toCharArray()){
            stack.push(ch);
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop());  
        }
    }
}
