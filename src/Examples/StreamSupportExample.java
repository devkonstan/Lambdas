package Examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class StreamSupportExample {
    public static void main(String[] args) {
        Iterable<String> iterable = Arrays.asList("Testing", "Iterable", "conversion", "to", "Stream");
        List<String> result =
                StreamSupport.stream(iterable.spliterator(), false)
                        .map(String::toUpperCase)
                        .collect(Collectors.toList());
        System.out.println(result);
    }
}
