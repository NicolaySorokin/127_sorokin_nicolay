import java.util.HashMap;

public class Counter {
    public HashMap<Integer, Integer> count(int[]ar) {
        HashMap<Integer, Integer> q = new HashMap<>();
        for(int i=0; i<ar.length; i=i++) {
            if(q.containsKey(ar[i])) {
                int a=q.get(ar[i])+1;
                q.put(ar[i],a);
            }
            else {
                q.put(ar[i], 1);
            }
        }
        return q;
    }
}