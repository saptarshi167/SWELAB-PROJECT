@Rahul Kumar
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class load1 {
    private String Compartment1;
    private String Compartment2;
    private String Compartment3;
    private String Direction;
    private String Station;
    
    

    public void Loadsend(HashMap<String, String> hash_map1, HashMap<String, String> hash_map2, HashMap<String, String> hash_map3, HashMap<String, String> hash_map4, HashMap<String, String> hash_map5) {
        
        
        String path = "C:\\Users\\My Lappy\\Downloads\\Load1.csv";
        String line = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                hash_map1.put(values[0],values[5]);
                hash_map2.put(values[0],values[2]);
                hash_map3.put(values[0],values[3]);
                hash_map4.put(values[0],values[4]);
                hash_map5.put(values[0],values[6]);



            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    




   
}
