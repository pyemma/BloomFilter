import bloomfilter.*;

import java.util.*;

/*
    Custom hash object to hash a Person object 
*/
public class PersonHash implements Hashable<Person> {

    private int prime;

    public PersonHash(int prime) {
        this.prime = prime;
    }

    public int hash(Person person) {
        int sum = 0;
        String firstName = person.firstName;
        for (int i = 0; i < firstName.length(); ++i) {
            sum  = sum * prime + firstName.charAt(i);
        }
        String lastName = person.lastName;
        for (int i = 0; i < lastName.length(); ++i) {
            sum = sum * prime + lastName.charAt(i);
        }
        String email = person.email;
        for (int i = 0; i < email.length(); ++i) {
            sum = sum * prime + email.charAt(i);
        }
        sum += prime * prime * prime * person.age;
        return sum;
    }
}