public class NamingJava {
  public static void main(String[] args) {
    int cellphone = 32321423;
    // Lower camel case
    int cellPhone = 98686868;
    System.out.println(cellphone);
    System.out.println(cellPhone);

    String $countryName = "Colombia";
    String _background = "green";
    String _name_lastname$currency = "pesos";

    final String NAME = "Miguel Martínez";
    // name = "Miguel Alberto Martínez"; this will error out
  }
}
