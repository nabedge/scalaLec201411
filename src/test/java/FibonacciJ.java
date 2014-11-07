public class FibonacciJ {

    public static void main(String[] args) {
        System.out.println(fib(9));
    }

    private static int fib(int n) {
        // n = 2以上は fib(n) = fib(n - 2) + fib(n - 2 +1) に抽象化できる
        //int result = fib(n - 1) + fib(n - 2 + 1);

        int f0 = 0;
        int f1 = 1;
        int fn = 0;
        for (int i=1; i<n; i++) {
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
        }

        return fn;
    }

  /*
  次のフィボナッチ数列を扱う関数fibを実装せよ。
  fib(0) = 0
  fib(1) = 1
  fib(2) = 1
  fib(3) = 2
  fib(4) = 3
  fib(5) = 5
  fib(6) = 8
  fib(7) = 13
  fib(8) = 21
  fib(9) = 34
  n = 2以上は fib(n) = fib(n - 2) + fib(n - 2 +1) に抽象化できる
   */


}
