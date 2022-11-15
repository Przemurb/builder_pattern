package pl.vitoIT.entity;

public class Account {
    private Long id;
    private String login;
    private String password;

    private Account(final Builder builder) {
        this.id = builder.id;
        this.login = builder.login;
        this.password = builder.password;
    }

//    private User user;
//    private Address address;


    public static class Builder {
        private Long id;
        private final String login; //pole obowiązkowe (final i do konstruktora)
        private String password;

        public Builder(String login) {
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

        public Account build() {
            return new Account(this);
        }
    }
}
