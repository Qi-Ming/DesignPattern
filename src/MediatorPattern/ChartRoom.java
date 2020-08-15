package MediatorPattern;

import java.util.Date;

public class ChartRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString()+user.getName()+message);
    }
}
