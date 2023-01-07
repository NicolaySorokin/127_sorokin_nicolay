import java.util.HashMap;

public final class SummCalculator {
    public static int calculateSumm(HashMap<String, Integer> AmountName, HashMap<String, Integer> Price) {
        int sumarise = 0;
        for (var entry : AmountName.entrySet() )
            sumarise += entry.getValue() * Price.get(entry.getKey() );
        return sumarise;
    }
}