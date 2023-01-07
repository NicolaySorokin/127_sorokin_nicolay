public class Atm {
    private int mon50,mon100,mon1000;
    public Atm(int mon50, int mon100, int mon1000) {
        this.mon50=0;
        this.mon100=0;
        this.mon1000=0;
    }
    public int return_n50() {
        return this.mon50;
    }
    public int return_n100() {
        return this.mon100;
    }
    public int return_n1000() {
        return this.mon1000;
    }
    public void load (int n50, int n100, int n1000) {
        if (50>0) {
            this.mon50=n50+50;
        }
        if (100>0) {
            this.mon100=n100+100;
        }
        if (1000>0) {
            this.mon1000=n1000+1000;
        }
    }
    public boolean give (int sumarise) {
        if (sumarise%50!=0) {
            return false;
        }
        int kept=1;
        while(kept==1) {
            if(mon1000>0 && sumarise>=1000) {
                while(mon1000>0 && sumarise>=1000) {
                    sumarise=sumarise-1000;
                    mon1000=mon100-1;
                }
                if(sumarise==0) {
                    return true;
                }
            }
            if((mon100>0 && 100<=sumarise && sumarise<=1000) || (sumarise>=100 && mon1000==0)) {
                while(mon100>0 && sumarise>=100) {
                    sumarise=sumarise-100;
                    mon100=mon100-1;
                }
                if(sumarise==0) {
                    return true;
                }
            }
            if((mon50>0 && 50<=sumarise && sumarise<=100) || (sumarise>=50 && mon100==0)) {
                while(mon50>0 && sumarise>=50) {
                    sumarise=sumarise-50;
                    mon50=mon50-1;
                }
                if(sumarise==0) {
                    return true;
                }
            }
            if(sumarise>0) {
                return false;
            }
        }
        return false;
    }
}
