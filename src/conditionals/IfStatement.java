package conditionals;

public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = false;
        int fileSended = 3;

        if (isBluetoothEnabled) {
            fileSended++;
            System.out.println("Sending file...");
        } else {
            System.out.println("Unable to send file...");
        }
    }
}
