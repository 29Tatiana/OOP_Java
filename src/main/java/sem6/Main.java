package sem6;

public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");
        Saver saver = new Saver(user);
        Reporter report = new Reporter();
        report.report(user);
        saver.save();
    }
}