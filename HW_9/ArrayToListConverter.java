package HW_9;

import java.util.Arrays;
import java.util.List;

public class ArrayToListConverter {
    public static <T> List<T> toList(T[] array) {
        return Arrays.asList(array);
    }
}