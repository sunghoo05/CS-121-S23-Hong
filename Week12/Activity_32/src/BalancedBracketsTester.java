public class BalancedBracketsTester
{
    public static void main(String[] args)
    {
         BalancedBrackets balanced = new BalancedBrackets();

        System.out.println(balanced.checkBalance("()"));
        System.out.println(balanced.checkBalance("(()())"));
        System.out.println(balanced.checkBalance("((((()(())))))"));
        System.out.println(balanced.checkBalance("(()"));

        System.out.println();

        BalancedAllBrackets balance = new BalancedAllBrackets();

        System.out.println(balance.checkBalance("(([{}]))"));
    }
}