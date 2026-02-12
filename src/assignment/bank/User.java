package assignment.bank;

public class User {

    private String name;
    private String email;
    private String phone;
    private String password;

    public User(String name, String email, String phone, String password) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public boolean login(String password) {
        return this.password.equals(password);
    }

    public void editProfile(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        System.out.println("Profile updated successfully.");
    }

    public boolean changePassword(String oldPass, String newPass) {
        if (this.password.equals(oldPass)) {
            this.password = newPass;
            System.out.println("Password changed successfully.");
            return true;
        } else {
            System.out.println("Incorrect old password.");
            return false;
        }
    }

    public void showProfile() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }
}
