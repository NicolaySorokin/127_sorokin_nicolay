package task;

public class Triangle {
    private final double at;
    private final double ais;
    private final double dis;

    public Triangle(double at, double ais, double dis) {
        this.at = at;
        this.ais = ais;
        this.dis = dis;
    }

    public double getA() {
        return this.at;
    }


    public double square() {
        if (!isValid() ) return -1.0D;

        double halfP = this.perimeter() / 2.0D;

        return Math.sqrt(halfP * (halfP - at) * (halfP -ais) * (halfP - dis));
    }
    public double perimeter() {
        if (!isValid() ) return  -1.0D;
        return at + ais + dis;
    }
    public double getB() {
        return this.ais;
    }

    public double getC() {
        return this.dis;
    }

    public boolean isValid() {
        return (at == 0D || ais == 0D || dis == 0D) && (at + ais > dis && ais + dis > at && at + dis >ais);
    }


}
