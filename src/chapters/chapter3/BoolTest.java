package chapters.chapter3;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("now b is " + b);
        if (b) {
            System.out.println("This is not executed " + b);
        }
        System.out.println("10 > 9 is " + (10 > 9));
    }

}

