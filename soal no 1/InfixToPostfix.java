import java.util.Stack;
import java.util.Scanner;

class Soal1 {
    static int Prec(char ch) {
        
        switch (ch) {
            case '+':
                case '-':

                return 1;
            case '*':
                 case '/':

                return 2;
            case '^':

                return 3;
        }
        return -1;
    }
    static String InfixToPostfix(String exp) {

        String result = new String("");
                    Stack<Character> stack = new Stack<>();

                        for (int t = 0; t<exp.length(); ++t) {
                            char c = exp.charAt(t);


            if (Character.isLetterOrDigit(c))
                result += c;

                
                    else if (c == '(')
                        stack.push(c);

                    else if (c == ')') {
                        while (!stack.isEmpty() &&
                                stack.peek() != '(')
                            result += stack.pop();
                        stack.pop();
                    }


            else {

                while (!stack.isEmpty() && Prec(c)
                        <= Prec(stack.peek())){
                    result += stack.pop();
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()){

            if(stack.peek() == '(')
                return "Invalid Expression";
            result += stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner valez = new Scanner(System.in);
             String exp = valez.next();

        System.out.println(InfixToPostfix(exp));

    }
}
// sumber dari GeeksForGeeks