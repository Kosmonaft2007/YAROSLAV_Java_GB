package sem1;

// задача на обнуления переменной

public class Task1 {
    public static void main(String[] args) {
        int count = 0;
        int maxLen = 0; // главный персонаж

        int[] nimbers = {1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1};

        for (int num : nimbers) {
            if (num == 1) {
                count++;
                if (maxLen < count) { //проверка count больше ли maxLen
                    maxLen = count;
                }
            } else {
                count = 0;
            }
        }
        System.out.format("коллекция 1 = %d", maxLen);
    }
}
