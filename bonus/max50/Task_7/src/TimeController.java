import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TimeController {
    public String getActionWithMaxTime (ArrayList<String> arr1, ArrayList<Integer> arr2){
        String num="";
        int num_max=0;
        for(int i=0; i<arr1.size(); i=i+1) {
            System.out.println(arr1.get(i));
        }
        for(int i=0; i<arr2.size(); i=i+1) {
            System.out.println(arr2.get(i));
        }
        HashMap<String,Integer> AD1=new HashMap<>();
        for(int i=0; i<arr1.size(); i=i+1) {
            if(AD1.containsKey(arr1.get(i))) {
                int k=arr2.get(i)+AD1.get(arr1.get(i));
                AD1.put(arr1.get(i), k);
            }
            else{
                AD1.put(arr1.get(i), arr2.get(i));
            }
        }
        System.out.println(AD1);
        num_max = AD1.get(arr1.get(0));
        Set<HashMap.Entry<String ,Integer>> L1 =  AD1.entrySet();
        for(HashMap.Entry<String, Integer> a:L1) {
            if(a.getValue()>num_max){
                num_max = a.getValue();
                num_max = a.getKey();
            }
        }
        return num_max;
    }
}
