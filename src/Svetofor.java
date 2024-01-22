public class Svetofor {
    public static void main(String[] arg) {
        String signal = "green";
        if (signal.equals("red")) {
            System.out.println("Остановиться!");
        } else if (signal.equals("yellow")) {
            System.out.println("Подождать!");
        } else {
            System.out.println("Ехать");
        }
    }
}
