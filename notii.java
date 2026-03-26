class Notifier {

    public void send(String message) {
        System.out.println("General Notification: " + message);
    }

    protected void send(String message, String email) {
        System.out.println("Email sent to " + email + ": " + message);
    }

    void send(String message, long phone) {
        System.out.println("SMS sent to " + phone + ": " + message);
    }
    private void send(String message, String email, long phone) {
        System.out.println("Internal Notification -> Email: " + email + ", Phone: " + phone + ": " + message);
    }
    public void accessPrivate(String message, String email, long phone) {
        send(message, email, phone);
    }
}

class AppNotifier extends Notifier {

    public void testMethods() {

        // accessing inherited methods
        send("Hello User");
        send("Hello Email", "user@gmail.com");     
        send("Hello SMS", 9876543210L);            
        accessPrivate("Secret Msg", "admin@gmail.com", 9999999999L);
    }
}

public class notii{
    public static void main(String[] args) {

        AppNotifier app = new AppNotifier();
        app.testMethods();
    }
}
