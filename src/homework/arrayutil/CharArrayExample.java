package homework.arrayutil;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
        char c = 'o';
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (c == chars[i]) {
                count++;
            }

        }
        System.out.println("մասիվի մեջ կա " + count + " 'o' փոփոխական");

        System.out.println("մեջտեղի 2 սինվոլներն են  " + chars[chars.length / 2] + chars[chars.length / 2 - 1]);

        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y' };
        if (chars3[chars3.length - 1] == 'y' && chars3[chars3.length - 2] == 'l') {
            System.out.println("մեր մասիվը վերջանում է ly");
        } else {
            System.out.println("մեր մասիվը չի վերջանում է ly");
        }
        char[] bobArray = {'b', 'a', 'b', 'o', 'b', 'a' };
        boolean isbob = false;
        for (int i = 0; i < bobArray.length - 2; i++) {
            if (bobArray[i] == 'b' && bobArray[i + 2] == 'b') {
                isbob = true;
            }
        }
        System.out.println(isbob);

        System.out.print("մասիվի այն սինվոլները որոնք պռաբել չեն ");
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' ' };
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i]);

            }

        }


    }


}

