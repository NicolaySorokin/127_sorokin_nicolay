public class Dubler {
    public int[] doubling(int[]q) {
        int a = 0;
        int[]sane=new int[q.length*2];
        for(int i = 0; i<q.length; i=i+1) {
            sane[a]=q[i];
            a=a+1;
            sane[a]=q[i];
            a=a+1;
        }
        return sane;
}
