package sem6;

public class Saver {
    private User user;
    public Saver(User user) {
        this.user = user;
    }
    public void save() {
        System.out.println("Save user: " + user.getName());
    }
}
