package encapsulation;

public class User {
    private String username;

    private int age;

    private boolean isPremium;

    private double salary;

     public String getUsername() {
          return username;
     }

     public void setUsername(String username) {
          this.username = username;
     }

     public int getAge() {
          return age;
     }

     public void setAge(int age) {
          this.age = age;
     }

     public boolean isPremium() {
          return isPremium;
     }

     public void setPremium(boolean premium) {
          isPremium = premium;
     }

     public double getSalary() {
          return salary;
     }

     public void setSalary(double salary) {
          this.salary = salary;
     }
}
