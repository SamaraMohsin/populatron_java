import java.util.List;

public class Summation {
    private long sum;
    public Summation(List<String[]> parse_data){
        sum = parse_data.stream().mapToInt(i-> Integer.parseInt(i[4].isEmpty() ? "0" : i[4])).sum();
    }

    public long GetSum(){
        return sum;
    }
}