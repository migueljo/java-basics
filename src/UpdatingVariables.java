public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;
        // bono $200
        salary += 200;
        System.out.println("The salary is: $" + salary);
        // pension: $50
        salary += -50;
        System.out.println("The salary is: $" + salary);
        // 2 horas extra $30 c/u
        // comida: $45
        salary += 2 * 30;
        salary -= 45;
        System.out.println("The salary is: $" + salary);
    }
}
