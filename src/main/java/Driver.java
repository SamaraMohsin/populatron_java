// import java.util.LinkedList;
import java.util.List;

public class Driver {
    String path;
    public Driver(String path) {
        this.path= path;
    }

    public long GetPopulation(){
        long sum = 0;
        try {
            FileReader fileReader = new FileReader(path);
            List<String> data = fileReader.GetReadData();
            Parser parser = new Parser(data);
            List<String[]> parse_data = parser.GetParseArray();
            Summation summation = new Summation(parse_data);
            sum = summation.GetSum();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sum;
    }
    
}