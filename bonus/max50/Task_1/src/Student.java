public class Student {
    private String name;
    private int age;
    private String group;
    private double mean_score;
    public Student(String name, int age, String group, double mean_score) {
        this.name = name;
        this.age = age;
        this.group = group;
        this.mean_score = mean_score;
    }
    public void name_assign(String name) {
        this.name = name;
    }
    public String name_int() {
        return this.name;
    }
    public void age_assign(int age) {
        this.age = age;
    }
    public int age_int() {
        return this.age;
    }
    public void group_assign(String group) {
        this.group = group;
    }
    public String group_int() {
        return this.group;
    }
    public void mean_score_assign(double mean_score) {
        this.mean_score = mean_score;
    }
    public double mean_score_int() {
        return this.mean_score;
    }
}