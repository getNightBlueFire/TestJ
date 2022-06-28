import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> extracted = getListWithOneDuplicate();

        int i = getPositionOfDuplicate(extracted);
        System.out.println(i);
    }

    private static List<Integer> getListWithOneDuplicate() {
        Random random = new Random();
        int size = 100;
        List<Integer> integers = new ArrayList<>(size);
        do {
            int i1 = random.nextInt(size);
            if (!integers.contains(i1)) {
                integers.add(i1);
            }
        } while (integers.size() != size - 1);
        Collections.sort(integers);
        int i = random.nextInt(size);
        integers.add(i, integers.get(i));
        System.out.println(i);
        return integers;
    }

    private static Integer getPositionOfDuplicate(List<Integer> list){

        return 0;
    }
}
