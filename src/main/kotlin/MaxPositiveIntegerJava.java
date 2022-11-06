import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class MaxPositiveIntegerJava {
    private Integer maximumLargestNumber(int[] nums){
        Set<Integer> set = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toSet());
        return Arrays.stream(nums).filter(set::contains).max().orElse(-1);
    }
}
