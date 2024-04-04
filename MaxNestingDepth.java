
public class MaxNestingDepth {
     public int maxDepth(String s) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp == '(') {
                count++;
                max = Math.max(max, count);
            } else if (temp == ')') {
                count--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String expr1 = "((()))";
        String expr2 = "(()(()))";
        String expr3 = "()()()";

        System.out.println("Maximum nesting depth of " + expr1 + ": " + maxDepth(expr1));
        System.out.println("Maximum nesting depth of " + expr2 + ": " + maxDepth(expr2));
        System.out.println("Maximum nesting depth of " + expr3 + ": " + maxDepth(expr3));
    }
}
