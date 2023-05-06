import java.util.Stack;

public class BalancedAllBrackets
{
    public String checkBalance(String string)
    {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < string.length(); i++)
        {
            char c = string.charAt(i);
            if (c == '(' || c == '[' || c == '{')
            {
                stack.push(c);
            }
            else if (c == ')' || c == ']' || c == '}')
            {
                stack.pop();
            }
        }

        if (stack.empty())
        {
            return "balanced";
        }
        else
        {
            return "unbalanced";
        }
    }
}