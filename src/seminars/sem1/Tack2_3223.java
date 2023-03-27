package sem1;

public class Tack2_3223 {
    public static void main(String[] args) {

            int[] numbers = {3,2,2,3};
            int search=3;
            int where= numbers.length -1;

            while (numbers[where ]==search )
                where--;
        for (int i = 0; i < where; i++) {
            if (numbers[i]==search){
                int temp = numbers[i];
                numbers [i]=numbers[where];
                numbers[where]=temp;

                where--;
            }

        }
        for (int number : numbers )
            System.out.printf("%d", number);

        }
}
