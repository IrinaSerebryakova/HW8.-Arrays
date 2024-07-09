import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        //Task 1
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        double[] doubleNumbers = {1.57, 7.654, 9.986};


        String[] names = new String[4];
        names[0] = "Андрей";
        names[1] = "Софья";
        names[2] = "Валентина";
        names[3] = "Сергей";


        //Task 2
        for(int i = 0; i < numbers.length; i++) {
            if (i < numbers.length-1) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.println(numbers[i]);
            }
        }


        System.out.println(Arrays.toString(doubleNumbers));

        int lastIndex = names.length - 1;
        int index = 0;

        do{
            System.out.print(names[index] + ", ");
            index++;
        } while(index < lastIndex);
            System.out.println(names[lastIndex]+"\n");


        //Task 3
        for(int i = numbers.length-1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.println(numbers[i]);
            }
        }


        for(int i = doubleNumbers.length-1; i >= 0; i--) {
            System.out.print(doubleNumbers[i]);
            if(i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();


        for(int i = names.length-1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(names[i] + ", ");
            } else {
                System.out.println(names[i]);
            }
        }


        //Task 4
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 1){
                numbers[i] += 1;
            }
        }
        System.out.println(Arrays.toString(numbers));

    }
}