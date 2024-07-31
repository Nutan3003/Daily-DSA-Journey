import java.util.HashMap;
import java.util.Map;

import javax.xml.crypto.dsig.keyinfo.KeyName;

public class FundamentalsHaspMap {
    public static void main(String args[]){
        HashMap<Integer,String>hm=new HashMap<>();

        //To add the element in the HashMap
        hm.put(10, "Nutan");
        hm.put(40,"Rushii");
        hm.put(20,"Kshitija");
        hm.put(60,"Virendra");

        //To iterate the Key from the HashMap
        for(int v:hm.keySet()){
           System.out.println(v);

           //To get the  values of keys from the HashMap
        //System.out.println(hm.get(v));

        }


        //To get the values values from the hashMap
        for(String val:hm.values()){
            System.out.println(val);
        }

        //To find/ Calculate the size of the HashMap
        System.out.println(hm.size());


        // Iterate over the entries
        for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }


        //To remove the entry from the HashMap
        hm.remove(10);

        for(int v:hm.keySet()){
            System.out.println(v);
         }


         //To check the key the present or not in HashMap
         System.out.println(hm.containsKey(50));

        
    }
    
}
