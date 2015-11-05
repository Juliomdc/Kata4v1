package kata4v1;
public class Histogram {
    HashMap <T, Integer> map = new Hasmap(Object key);
    
    public Integer get (Object key){
        return map.get(key);
    }
    
    public Set<T> keySet(){
        return map.keySet();
    }
    
    public void increment(T key){
        map.put(key, map.containsKey(key)? map.get(key)+1:1);
    }
    
}
