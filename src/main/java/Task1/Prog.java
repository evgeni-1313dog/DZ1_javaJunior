package Task1;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Prog {

    List<Integer> list = Arrays.asList(28, 73, 5, 9, 18, 4).stream()
            .filter(n -> n % 2 == 0).collect(Collectors.toList());
    Optional<Integer> result = list.stream().reduce((x, y)-> (x+y)/ list.size());

    public void print(){
        System.out.println(result);
    }

}
