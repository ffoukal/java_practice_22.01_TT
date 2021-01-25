package password;

public class PasswordIntermedia extends Password{
    public PasswordIntermedia() {
        super("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,20}$");
    }
}
