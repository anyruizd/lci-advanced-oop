public class MyAbstractExample extends MyAbstract {
    // now it asks me to implement the methods I declared in the other class

    public int getNumber(int a, int b) {
        return a * b;
    }

    public int getSum(int c, int d) {
        return c + d;
    }

    public void showResult () {
        System.out.printf("this abstract method implemented");
    }
}
