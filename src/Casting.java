public class Casting {
  public static void main(String[] args) {
    var monthlyDogs = 30.0 / 12;
    System.out.println(monthlyDogs);
    var truncatedDogs = (int) monthlyDogs;
    System.out.println(truncatedDogs);
    System.out.println((double) 30 / 12);

    char n = 'a';
    System.out.println((int) n);
  }
}
