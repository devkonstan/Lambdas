import java.util.ArrayList;
import java.util.List;

public class ListCitiesStream {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Szczecin");
        lista.add("Katowice");
        lista.add("Gdańsk");

        //petla
        for (String s : lista) {
            s = "Miasto_" + s;
            System.out.println(s);
        }

        System.out.println("**********");

        //stream
        lista.stream()
                .sorted((s1, s2) ->
                        {
                            if (s1.compareTo(s2) > 0) return 1;
                            else if (s1.compareTo(s2) == 0) return 0;
                            else return -1;
                        }
                ).forEach(s -> {
                    System.out.println(s = "Miasto_" + s);
                });

        System.out.println("*********");

        lista.stream()
                .filter(s -> s.startsWith("Sz"))
                .map(s -> s = s + " jest ql")
                .forEach(System.out::println);
    }
}