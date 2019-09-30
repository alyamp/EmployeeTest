package employeetest;
import java.time.*;

public class EmployeeTest {
    public static void main(String[] args) {
        // TODO code application logic here
        /*
            Oleh    : Alya
            Catatan : Instansiasi yaitu proses pembuatan objek staff dari class
                      Employee.
        */
        Employee[] staff = new Employee[3];
        /*
            Oleh    : Alya
            Catatan : Instansiasi yaitu proses pembuatan objek staff dengan no. 
                      index yang telah ditentukan dari class Employee dengan 
                      argumen yang telah ditentukan.
        */
        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);
        /*
            Oleh    : Alya
            Catatan : Iterasi pemanggilan method raiseSalary dengan 
                      parameter 5, pemanggilan method ini dilakukan 
                      pada setiap no. index array Employee.
        */
        for(Employee e : staff)
            e.raiseSalary(5);
        /*
            Oleh    : Alya
            Catatan : Iterasi untuk mencetak nama, salary, dan hireDay tiap 
                      no. index pada array Employee yang isinya dipanggil dari 
                      method getName(), getSalary() dan gethireDay()
        */
        for(Employee e : staff)
            System.out.println("name = " + e.getName() + ", salary = " + e.getSalary() + ", hireDay = " + e.getHireDay());
    }
}

class Employee{
    //instance fields
    /*
        Oleh    : Alya
        Catatan : berikut merupakan fields pada class Employee 
                  yang private atau hanya dapat diakses pada class
                  Employee saja.
    */
    private String name;
    private double salary;
    private LocalDate hireDay;
    
    //constructor
    public Employee(String n, double s, int year, int month, int day){
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }
    /* 
        Oleh : Alya
        Pada baris di bawah ini merupakan method yang 
        dipanggil pada main method. 
    */
    /*
        Oleh : Alya
        Method getName adalah untuk mengambil isi pada
        variabel name yang bersifat private.
    */
    public String getName(){
        return name;
    }
    /*
        Oleh : Alya
        method getSalary adalah untuk mengambil isi pada
        variabel salary yang bersifat private.
    */
    public double getSalary(){
        return salary;
    }
    /*
        Oleh : Alya
        method getHireDay adalah untuk mengambil isi pada
        variabel hireDay yang bersifat private.
    */
    public LocalDate getHireDay(){
        return hireDay;
    }
    /*
        Oleh : Alya
        method raiseSalary untuk melakukan proses perhitungan
        yang memiliki parameter byPercent.
    */
    public void raiseSalary(double byPercent){
        double raise = salary*byPercent/100;
        salary += raise;
    }
}