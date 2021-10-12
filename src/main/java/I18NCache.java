import java.util.HashMap;

public class I18NCache {
     HashMap<String,String> map = new HashMap();

     public void put(String k, String value){
          map.put(k,value);
     }

     public String get(String k){
          return map.get(k);
     }
}
