package chap4;

public class Employee {

    String id;
    String name;
    String surname;
    int position;
    public double salary;
    public double bonus;
    public double summary;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPosition() {
        return position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void typeMethod(int type, double sal) {

        if (type == 1) {
            System.out.print("\tPosition :  Manager           ");
            if (sal < 10000) {
                bonus = sal * 0.05;
                System.out.print("\tSalary : " + sal);
                System.out.print("\tBonus : " + bonus + " Baht");

            }
            if (sal >= 10000) {
                bonus = sal * 0.10;
                System.out.print("\tSalary : " + sal);
                System.out.print("\tBonus : " + bonus + " Baht");

            }
            summary += sal;
        }
        if (type == 2) {
            System.out.print("\tPosition : Assistant Manager");
            if (sal < 10000) {
                bonus = sal * 0.15;
                System.out.print("\tSalary : " + sal);
                System.out.print("\tBonus : " + bonus + " Baht");

            }
            if (sal >= 10000) {
                bonus = sal * 0.20;
                System.out.print("\tSalary : " + sal);
                System.out.print("\tBonus : " + bonus + " Baht");

            }
            summary += sal;

        }
        if (type == 3) {
            System.out.print("\tPosition : General           " );
            if (sal < 10000) {
                bonus = sal * 0.25;
                System.out.print("\tSalary : " + sal + "\t");
                System.out.print("Bonus : " + bonus + " Baht");

            }
            if (sal >= 10000) {
                bonus = sal * 0.30;
                System.out.print("\tSalary : " + sal  + "\t");
                System.out.print("Bonus : " + bonus + " Baht");

            }
            summary += sal;

        }
        if (type > 3) {
            System.out.print("\tPosition : -                 ");
            if (sal < 10000) {
                bonus = 0;
                sal = 0;
                System.out.print("\tSalary : " + sal);
                System.out.print("\tBonus : " + bonus + " Baht");

            }
            if (sal >= 10000) {
                bonus = 0;
                sal = 0;
                System.out.print("\tSalary : " + sal);
                System.out.print("\tBonus : " + bonus + " Baht");

            }
            summary += sal;

        }
    }

}//end
