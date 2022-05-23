package homework.arrayutil;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] != ' '){
                System.out.print(spaceArray[i]);
            }
        }
    }
}
