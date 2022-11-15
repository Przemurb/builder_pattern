package pl.vitoIT.entity;

public class User {
    private String firstname;
    private String lastName;
    private String nick;
    private String email;
    private String pesel;
    private int age;

    private User(Builder builder) {
        this.firstname = builder.firstname;
        this.lastName = builder.lastName;
        this.nick = builder.nick;
        this.email = builder.email;
        this.pesel = builder.pesel;
        this.age = builder.age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nick='" + nick + '\'' +
                ", email='" + email + '\'' +
                ", pesel='" + pesel + '\'' +
                ", age=" + age +
                '}';
    }

    public static class Builder {
        private String firstname;
        private String lastName;
        private String nick;
        private String email;
        private String pesel;
        private int age;

        public Builder firstname(final String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder lastName(final String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder nick(final String nick) {
            this.nick = nick;
            return this;
        }

        public Builder email(final String email) {
            this.email = email;
            return this;
        }

        public Builder pesel(final String pesel) {
            this.pesel = pesel;
            return this;
        }

        public Builder age(final int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
