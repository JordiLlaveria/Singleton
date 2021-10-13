import java.util.HashMap;

public class I18NCache {
     HashMap<String,String> map = new HashMap();

     public void put(String k, String language, String value){

          map.put(k+"_"+language,value);
     }

     public String get(String k, String language){
          return map.get(k+"_"+language);
     }
}
