public class DataTypes {
    public static void main(String[] args) {
        int n = 999999999;
        long nL = 999999999999999999L;

        double nD = 123.99999999999999;
        float nF = 123.999F;

        var nameString = "Hello";
        var nameChar = 'A';
        var salary = 1000;
        var pension = salary * 0.03;
        var totalSalary = salary - pension;
        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Miguel";
        System.out.println("The employee name is: " + employeeName + " and his total salary is: " + totalSalary);
    }
}
