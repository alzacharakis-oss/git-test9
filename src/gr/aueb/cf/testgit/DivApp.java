package gr.aueb.cf.testgit;

public class DivApp {

    public static void main(String[] args) {
        System.out.println(divApp(5,8));

    }
    public static int divApp (int a, int b) {
        if (b == 0) return 0;
        return a / b;

    }
}
