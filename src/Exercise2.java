public class Exercise2 {
  public static void main(String[] args) {
    char c = 'z';
    System.out.println("conviertelo a int: " + (int) c);
    int i1 = 250;
    System.out.println("conviertelo a long y luego de long a short: " + (short) (long) i1);
    double d = 301.067;
    System.out.println("conviertelo a long: " + (long) d);
    int i2 = 100;
    System.out.println("súmale 5000.66 y conviertelo a float: " + (i2 + 5000.66));
    int i3 = 737;
    System.out.println("multiplícalo por 100 y conviertelo a byte: " + ((byte) i3 * 100));
    double d4 = 298.638;
    System.out.println("divídelo entre 25 y conviertelo a long: " + ((long) d4 / 25));
  }
}
