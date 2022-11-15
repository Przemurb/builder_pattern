package pl.vitoIT.entity;

public class Account {
    private Long id;
    private String login;
    private String password;
    private User user;
    private Address address;

    private Account(final Builder builder) {
        this.id = builder.id;
        this.login = builder.login;
        this.password = builder.password;
        this.user = builder.user;
        this.address = builder.address;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", user=" + user +
                ", address=" + address +
                '}';
    }

    public static class Builder {
        private Long id;
        private final String login; //pole obowiązkowe (final i do konstruktora)
        private String password;
        private User user;
        private Address address;

        public Builder(final String login) {
            this.login = login;
        }

        public Builder id(final Long id) {
            this.id = id;
            return this;
        }

        public Builder password(final String password) {
            this.password = password;
            return this;
        }

        public Builder user(final User user) {
            this.user = user;
            return this;
        }

        public Builder address(final Address address) {
            this.address = address;
            return this;
        }

        public Account build() {
            return new Account(this);
        }
    }

}
