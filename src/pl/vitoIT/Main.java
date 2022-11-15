package pl.vitoIT;

import pl.vitoIT.entity.Account;
import pl.vitoIT.entity.Address;
import pl.vitoIT.entity.User;

public class Main {
    public static void main(String[] args) {
        User user = new User.Builder()
                .firstname("Jan")
                .lastName("Janowski")
                .email("jj@jj.jj")
                .nick("Janko")
                .build();

        Address address = new Address.Builder()
                .city("Poznań")
                .country("Poland")
                .street("Ulicowa")
                .houseNumber("21/8")
                .zipCode("00-123")
                .build();

        Account account = new Account.Builder("Nynus")
                .id(1L)
                .password("qwerty")
                .user(user)
                .address(address)
                .build();

        System.out.println(account);



    }

}