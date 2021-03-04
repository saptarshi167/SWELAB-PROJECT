@Parnab Dutta
import java.util.HashMap;

public class distribution1 {

    public static HashMap<String, String> hash_map1 = new HashMap<>();
    public static HashMap<String, String> hash_map2 = new HashMap<>();
    public static HashMap<String, String> hash_map3=new HashMap<>();
    public static HashMap<String, String> hash_map4=new HashMap<>();
    public static HashMap<String, String> hash_map5=new HashMap<>();
   

    
    public static void main(String args[])
    {
        // backend classes and reading CSV
        load1 call = new load1();
        String s="5E";
        call.Loadsend(hash_map1,hash_map2,hash_map3,hash_map4,hash_map5);
        String Compartment1 = hash_map2.get(s);
        String Compartment2 = hash_map1.get(s);
        String Compartment3 = hash_map5.get(s);
        String Direction = hash_map3.get(s);
        String Station = hash_map4.get(s);
         
        System.out.println("The load calculated from compartment 1 is"+" "+Compartment1);
        System.out.println("The load calculated from compartment 2 is"+" "+Compartment2);
        System.out.println("The load calculated from compartment 3 is"+" "+Compartment3);
        System.out.println("The direction of the metro is"+" "+Direction);
        System.out.println("The station name  is"+" "+Station);
        
        // unit tests
        distribution1 n = new distribution1();
        
        assert(n!=null);
        assert(n.getCompartment1().length()!=0):"Load cannot be empty";
        assert(n.getCompartment2().length()!=0):"Load cannot be empty";
        
        assert(n.getCompartment3().length()!=0):"Load cannot be empty";
        assert(n.getDirection().length()!=0):"Direction cannot be empty";
        assert(Integer.parseInt(n.getCompartment1())<2200):"Load cannot exceed 2200";
        
        
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dist1().setVisible(true);
            }
         });
        
         
        
    }
    private String Compartment1;
    
    public String getCompartment1()
    {
        this.Compartment1 = Compartment1;
        load1 call = new load1();
        call.Loadsend(hash_map1, hash_map2, hash_map3, hash_map4, hash_map5);
         String s="5E";
        
        String Compartment1 = hash_map2.get(s);
        return Compartment1;
   
}
    private String Compartment2;
   
     public String getCompartment2()
    {
        this.Compartment2 = Compartment2;
         load1 call = new load1();
        call.Loadsend(hash_map1, hash_map2, hash_map3, hash_map4, hash_map5);
         String s="3C";
         String Compartment2 = hash_map1.get(s);
        return Compartment2;
    }
      private String Compartment3;
   
    public String getCompartment3()
    {
        this.Compartment3 = Compartment3;
         load1 call = new load1();
        call.Loadsend(hash_map1, hash_map2, hash_map3, hash_map4, hash_map5);
         String s="3C";
         String Compartment3 = hash_map5.get(s);
        return Compartment3;
    }
     private String Direction;
    
    public String getDirection()
    {
        this.Direction = Direction;
         load1 call = new load1();
        call.Loadsend(hash_map1, hash_map2, hash_map3, hash_map4, hash_map5);
         String s="3C";
         String Direction = hash_map3.get(s);
        return Direction;
    }
    private String Station;
    public String getStation()
    {
        this.Station = Station;
         load1 call = new load1();
        call.Loadsend(hash_map1, hash_map2, hash_map3, hash_map4, hash_map5);
         String s="3C";
         String Station = hash_map4.get(s);
        return Station;
    }
}







