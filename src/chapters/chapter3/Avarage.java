package chapters.chapter3;

public class Avarage {
    public static void main(String[] args) {
        double nume[] = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        for (int i = 0; i < nume.length; i++){
            result = result + nume[i];
        }
        System.out.println("Avarage resul is " + result/nume.length);
    }
}
