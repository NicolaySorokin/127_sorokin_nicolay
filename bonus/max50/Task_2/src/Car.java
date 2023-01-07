public class Car {
    private String name;
    private String brand;
    private int year;
    private int total_distance;
    public Car (String name, String brand, int year, int total_distance) {
        this.name=name;
        this.brand=brand;
        this.year=year;
        this.total_distance=total_distance;
    }


    public void NameSet (String name) {
        this.name=name;
    }
    public String NameGet() {
        return this.name;
    }


    public void TakeBrand (String brand) {
        this.brand=brand;
    }
    public String BrandSet() {
        return this.brand;
    }


    public void YearSet (int year) {
        this.year=year;
    }
    public int YearGet() {
        return this.year;
    }


    public void total_distanceChange (int total_distance) {
        this.total_distance=total_distance;
    }
    public int total_distance_get() {
        return this.total_distance
    }


    public void trip (int x) {
        this.total_distance=this.total_distance+x;
    }
}
