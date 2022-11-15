package pl.vitoIT.entity;

public class Address {
    private String street;
    private String houseNumber;
    private String zipCode;
    private String city;
    private String country;

    private Address(Builder builder) {
        this.street = builder.street;
        this.houseNumber = builder.houseNumber;
        this.zipCode = builder.zipCode;
        this.city = builder.city;
        this.country = builder.country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public static class Builder {
        private String street;

        private String houseNumber;
        private String zipCode;
        private String city;
        private String country;

        public Builder houseNumber(final String houseNumber) {
            this.houseNumber = houseNumber;
            return this;
        }
        public Builder street(final String street) {
            this.street = street;
            return this;
        }

        public Builder zipCode(final String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public Builder city(final String city) {
            this.city = city;
            return this;
        }

        public Builder country(final String country) {
            this.country = country;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }
}
