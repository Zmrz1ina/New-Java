package fibonacci4;

public class TestFibonacci {
    public int findFibonacciNumberInSequence(int n) {
        //Найти чисто в последовательности Фибоначи. Где n - номер числа в последовательности
        // f(n)=f(n-1) + f(n-2), причем f(0)=0, а f(1)=1
        //используйте рекурсию
        //ur code..->
        if (n == 0) {
            return n;
        } else if (n == 1) {
            return n;
        }

        return findFibonacciNumberInSequence(n - 1) + findFibonacciNumberInSequence(n - 2);
    }
}