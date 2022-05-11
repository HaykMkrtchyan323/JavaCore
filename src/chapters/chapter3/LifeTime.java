package chapters.chapter3;

public class LifeTime {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            int j = - 1;
            System.out.println("j havasar e " + j);
            j = 100;
            System.out.println("j arjeqy hima " + j);

        }
    }
}
