package chap4;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeBonus {

    static void printmenu() {
        System.out.println("-------- Menu --------");
        System.out.println("0 : Exit");
        System.out.println("1 : Employee Information Entry");
        System.out.println("2 : Employee Summary");
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu = 0;
        double TSalary = 0;
        double TBonus = 0;
        ArrayList<Employee> list = new ArrayList<Employee>();
        do {
            printmenu();
            System.out.print("Please Enter Menu [0-2] : ");
            menu = sc.nextInt();
            Employee em = new Employee();
            switch (menu) {
                case 1:
                    System.out.println("-------ป้อนข้อมูล-------");
                    System.out.print("Enter ID : ");
                    String id = sc.next();
                    System.out.print("Enter Name : ");
                    String name = sc.next();
                    System.out.print("Enter Surname : ");
                    String surname = sc.next();
                    System.out.print("Enter Position Type : ");
                    int position = sc.nextInt();
                    System.out.print("Enter Salary : ");
                    double salary = sc.nextDouble();
                    em.setId(id);
                    em.setName(name);
                    em.setSurname(surname);
                    em.setPosition(position);
                    em.setSalary(salary);
                    list.add(em);

                    break;
                case 2:
                    System.out.println("\nShow Data");
                    for (Employee i : list) {
                        System.out.print("ID : " + i.getId() + "\t");
                        System.out.print("Name : " + i.getName());
                        System.out.print("\tSurname : " + i.getSurname());
                        em.typeMethod(i.getPosition(), i.getSalary());
                        TBonus = TBonus + em.bonus;
                        System.out.println("\n");
                    }
                    System.out.println("\nSummary");
                    System.out.println("Employee Count : " + list.size());
                    System.out.println("Salary Total : " + em.summary + " Baht");
                    System.out.println("Bonus Total : " + TBonus + " Baht" + "\n");

                    break;
            }
        } while (menu != 0);
    }
}//end
