import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] numbers = new int [10];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = random.nextInt(1,10);
            Map<Integer,Integer> map = new HashMap<>();
            for (int i :numbers) {
                if (!map.containsKey(i)) {
                    map.put(i, 0);
                } else {
                    //map.put(i,1);
                    int duplicate = map.get(i) + 1;
                    map.put(i, duplicate);
                }
            }
            System.out.println(Arrays.toString((Arrays.stream(numbers).toArray())));
            System.out.println(map);
        }
    }
