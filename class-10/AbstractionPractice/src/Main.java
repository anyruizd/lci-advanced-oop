public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MyAbstractExample myExample = new MyAbstractExample();
        myExample.showResult();
        myExample.show();

        Quebec qc = new Quebec();
        qc.calcualteTotal(200);
        Alberta ab = new Alberta();
        ab.calcualteTotal(200);
        Ontario on = new Ontario();
        on.calcualteTotal(200);
    }
}