package src.seminars.Kata.Block_5;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_5_1_15 {
    public static void main(String[] args) {
        DynamicArray<Integer> array = new DynamicArray<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);
        array.add(9);
        array.add(10);
        array.remove(7);
        array.remove(7);
        array.remove(7);
        array.add(0);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);

        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
    }
}

public class DynamicArray<T> {
    private static final int DEFAULT_SIZE = 10;
    private T[] elements;
    //    T[] array = (T[]) new Object[];
    private int size;
//    private int capacity;

    public DynamicArray() {
        this.elements = (T[]) new Object[DEFAULT_SIZE];
        this.size = 0;
    }

    /**
     * @param element
     */
    public void add(T element) {
        if (isFullArray()) {
            resize();

        }
        this.elements[size] = element;
        size++;
    }

    private void resize() {
        T[] oldElements = this.elements;
        this.elements = (T[]) new Object[oldElements.length + oldElements.length / 2];
        for (int i = 0; i < size; i++) {
            this.elements[i] = oldElements[i];
        }
    }

    private boolean isFullArray() {
        return size == elements.length;
    }

    /**
     * @param index
     * @return
     */
    public T get(int index) {
        if (isaCorrectIndex(index)) {
            return elements[index];
        } else {
            return null;
        }
    }

    private boolean isaCorrectIndex(int index) {
        return index >= 0 && index < size;
    }

    public void clear() {
        this.size = 0;
    }

    public void removeAt(int index) {
        Set<T> answer = new HashSet<>(set1);
        Set<T> help = new HashSet<>(set2);
        answer.removeIf(help::remove);
        answer.addAll(help);
        return answer;
    }

    public static void main(String[] args) throws Exception {
        HashMap<String, Integer> result = new HashMap<>();
        (new BufferedReader(new InputStreamReader(System.in, "UTF-8")))
                .lines()
                .flatMap(l -> Stream.of(l.split("[\\p{Punct}\\s]+")))
                .map(w -> w.toLowerCase())
                .forEach(w -> {
                    if (result.containsKey(w)) result.put(w, result.get(w) + 1);
                    else result.put(w, 1);
                });
        result.entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    if (e1.getValue() == e2.getValue()) return e1.getKey().compareTo(e2.getKey());
                    else return e2.getValue().compareTo(e1.getValue());
                })
                .limit(10)
                .forEach(e -> System.out.println(e.getKey()));
    }

}
