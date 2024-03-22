package ch17.lecture.p1stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class C17Collectors {
    public static void main(String[] args) {
        List<String> list = List.of("java", "css", "html",
                "spring", "jquery", "c++",
                "swift", "home", "javascript");

        // Map<String, Long>

        Map<Character, Long> collect = list.stream()
                .collect(Collectors.groupingBy(e -> e.charAt(0),
                        Collectors.counting()));
        System.out.println("collect = " + collect);
    }
}
