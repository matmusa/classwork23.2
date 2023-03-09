import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        try {
            ArrayList<Employee> employees = new ArrayList<>();
            employees.add(new Employee("Matmusa", 21, "programmer"));
            employees.add(new Employee("Roza", 28, "teacher"));
            employees.add(new Employee("Albert", 24, "footballer"));
            employees.add(new Employee("Ruslan", 21, null));
            System.out.println(employees.toString());
            for (Employee e : employees
            ) {
                if (e.getAge() < 0) {
                    throw new MyException("age can't be negative");
                }
                if (e.getJob() == null) {
                    throw new MyException("job can't be null");
                }
            }

        } catch (MyException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finish");
        }
    }
     


}