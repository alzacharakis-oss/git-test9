package gr.aueb.cf.testgit;

public class ModApp {

    public static void main(String[] args) {
        System.out.println(modApp(5, 0));

    }
    public static int modApp (int a, int b) {
        if (b == 0) return 0;
        return a % b;
    }
}
