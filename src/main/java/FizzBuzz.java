import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> getNumbers() {
        List<String> numbers = new ArrayList<String>();

        for(int i=0; i<100 ; i++){
            numbers.add(String.valueOf(i));
        }
        return numbers;
    }
}
