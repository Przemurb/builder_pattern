package pl.vitoIT;

import pl.vitoIT.entity.Account;
import pl.vitoIT.entity.Address;
import pl.vitoIT.entity.User;

public class Main {
    public static void main(String[] args) {
        User u1 = new User.Builder()
                .firstname("Jan")
                .lastName("Janowski")
                .email("jj@jj.jj")
                .nick("Janko")
                .pesel("123456789")
                .age(15)
                .build();

        Address a1 = new Address.Builder()
                .city("Poznań")
                .country("Poland")
                .street("Ulicowa")
                .houseNumber("21/8")
                .zipCode("00-123")
                .build();

        Account account1 = new Account.Builder("Nynus")
                .id(1L)
                .password("qwerty")
                .user(u1)
                .address(a1)
                .build();

        System.out.println(account1);
    }
}