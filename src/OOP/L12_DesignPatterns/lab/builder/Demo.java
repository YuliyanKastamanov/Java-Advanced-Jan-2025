package builder;

public class Demo {

    public static void main(String[] args) {

        User user = new User.Builder("Kaloyan",
                                     "Password",
                                     "kaloyan@gmail.com")
        .withAddress("Some Address")
        .withFacebookProfile("Facebook profile")
        .withBirthdate("Some Birthday")
        .build();
    }
}
