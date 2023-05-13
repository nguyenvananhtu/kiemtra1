package advance.dev;

public class Person {
    private String name;
    private int age;
    private String city;
    
    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getCity() {
        return city;
    }
    
    @Override
    public String toString() {
        return name + " (" + age + ") - " + city;
    }
}

class Employee extends Person implements Comparable<Employee> {
    private double salary;
    
    public Employee(String name, int age, String city, double salary) {
        super(name, age, city);
        this.salary = salary;
    }
    
    public double getSalary() {
        return salary;
    }
    
    @Override
    public String toString() {
        return super.toString() + " - " + salary;
    }
    
    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }

}


