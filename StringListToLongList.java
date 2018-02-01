import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;

public final class StringListToLongList {
        List<Long> convert(List<String> ids) {
                List<Long> longList = new ArrayList<>();
                longList.addAll(ids.stream().map(Long::valueOf).collect(Collectors.toList()));
                return longList;
        }

        public static void main(String...args) {
                List<Long> l = new StringListToLongList().convert(
                                Arrays.asList(args));

                // see: https://stackoverflow.com/questions/10168066/how-to-print-out-all-the-elements-of-a-list-in-java
                l.forEach(System.out::println);
                l.stream().forEach(System.out::println);
                // TODO: there are others to implement ...
        }
}
