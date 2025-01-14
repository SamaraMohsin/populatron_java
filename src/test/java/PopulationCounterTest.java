/*
 * This Java source file was generated by the Gradle 'init' task.
 */

 import static org.junit.jupiter.api.Assertions.assertEquals;
 import static org.mockito.Mockito.mock;
 import static org.mockito.Mockito.times;
 import static org.mockito.BDDMockito.then;
 import static org.mockito.BDDMockito.given;
 
 import java.io.ByteArrayOutputStream;
 import java.io.PrintStream;
 import java.util.Arrays;
 import java.util.LinkedList;
 import java.util.List;
 
 import org.junit.jupiter.api.Test;


public class PopulationCounterTest {
    @Test
    public void testSomeLibraryMethod() throws Exception {

        // Setup
        String expected = "World population is: 1,347,982,728\n";

        // https://stackoverflow.com/questions/8708342/redirect-console-output-to-string-in-java
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.out;
        System.setOut(ps);

        // Exercise
        PopulationCounter.main(new String[] {"./data/worldcitiespop.csv"});

        // Assert
        System.out.flush();
        String output = baos.toString();
        assertEquals(expected, output );

        // Teardown
        System.setOut(old);
    }

    @Test
    public void testofFileReaderClass() throws Exception{

        FileReader fileReader = mock(FileReader.class);
        given(fileReader.GetReadData()).willReturn(Arrays.asList("ad,aixas,Aixs,06,,42.4833333,1.4666667"));
        List<String> data = fileReader.GetReadData();
        then(fileReader).should(times(1)).GetReadData();
        String line = data.get(0);
        assertEquals("ad,aixas,Aixs,06,,42.4833333,1.4666667",line);
        
    }

    @Test
    public void testofParserClass() throws Exception{
        Parser parser = mock(Parser.class);
        List<String[]> data = new LinkedList<>();
        String[] line = {"ad","aixas","06","","42.4833333","1.4666667"};
        data.add(line);
        given(parser.GetParseArray()).willReturn(data);
        List<String[]> parse_data = parser.GetParseArray();
        then(parser).should(times(1)).GetParseArray();
        assertEquals(data, parse_data);
    }

    @Test
    public void testofSummationClass() throws Exception{
        Summation summation = mock(Summation.class);
        given(summation.GetSum()).willReturn(1347982728l);
        long sum = summation.GetSum();
        then(summation).should(times(1)).GetSum();
        assertEquals(1347982728l, sum);
    }
}
