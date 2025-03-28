package builder;

public class User {

    //Required fields
    private String username;
    private String password;
    private String email;
    // Optional fields
    private String address;
    private String birthdate;
    private String facebookProfile;

    //Required fields
    public User(Builder builder) {
        this.username = builder.username;
        this.password = builder.password;
        this.email = builder.email;
        this.address = builder.address;
        this.birthdate = builder.birthdate;
        this.facebookProfile = builder.facebookProfile;
    }

    //Create Nested Builder class
    public static class Builder {

        //Required fields
        private String username;
        private String password;
        private String email;
        // Optional fields
        private String address;
        private String birthdate;
        private String facebookProfile;

        //Required fields
        public Builder(String username, String password, String email) {
            this.username = username;
            this.password = password;
            this.email = email;
        }

        // Optional fields
        public Builder withBirthdate(String birthdate) {
            this.birthdate = birthdate;
            return this;
        }

        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder withFacebookProfile(String facebookProfile) {
            this.facebookProfile = facebookProfile;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }

}
