package homework;

public class arraysutil {
    public static void main(String[] args) {
        int[] arays = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        System.out.print("1․ մասիվի բոլոր էլեմենտներՆ ԵՆ ");
        for (int i = 0; i < 10; i++) {
            System.out.print(+arays[i] + " ");
        }
        System.out.println();
        int max = arays[0];
        for (int i = 0; i < arays.length; i++) {
            if (arays[i] > max) {
                max = arays[i];
            }
        }
        System.out.println("2. մասիվի ամենամեծ արժեքն է " + max);


        int min = arays[0];
        for (int j = 0; j < arays.length; j++) {
            if (arays[j] < min) {
                min = arays[j];
            }
        }
        System.out.print("3. մասիվի ամենափոքրը թիվն է " + min);
        System.out.println();

        System.out.print("4. մասիվի բոլոր զույգ արժեքներն են ");
        for (int i = 0; i < arays.length; i++) {
            if (arays[i] % 2 == 0) {
                System.out.print(arays[i] + " ");
            }

        }
        System.out.println();
        System.out.print("5. մասիվի բոլոր կենտ էլեմենտներն են ");
        for (int j = 0; j < arays.length; j++) {
            if (arays[j] % 2 != 0) {
                System.out.print(arays[j] + " ");
            }

        }
        System.out.println();
        int evenqount = 0;
        for (int i = 0; i < arays.length; i++) {
            if (arays[i] % 2 == 0) {
                evenqount++;
            }

        }
        System.out.print("6. զույգերի քանակն է " + evenqount + " ");

        System.out.println();
        int oddqount = 0;
        for (int i = 0; i < arays.length; i++) {
            if (arays[i] % 2 != 0) {
                oddqount++;
            }
        }
        System.out.println("7. կենտերի քանակՆ Է " + oddqount + " ");
        int lenght = arays.length;
        int sum = 0;
        for (int i = 0; i < arays.length; i++) {
            sum = sum + arays[i];
        }
        double avarage = sum/lenght;
        System.out.println("8. մասիվի բոլոր թվերի միջին թվաբանականն է " + avarage);
    }
}



