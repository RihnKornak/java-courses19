package pet.clinic;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class NullCustomerTest {

    @Test
    void getId() {
        Customer customer = new NullCustomer();
        assertEquals(0, customer.getId());
    }

    @Test
    void setId() throws IncorrectInputException {
        Customer customer = new NullCustomer();
        customer.setId(7);
        assertEquals(-1, customer.getId());
    }

    @Test
    void setName() throws IncorrectInputException {
        Customer customer = new NullCustomer();
        String expected = customer.getName();
        customer.setName("TestName");
        assertEquals(expected, customer.getName());
    }

    @Test
    void setPets() {
        Customer customer = new NullCustomer();
        ArrayList<Pet> expected = customer.getPets();
        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(new Pet());
        customer.setPets(pets);
        assertNotEquals(expected, customer.getPets());
    }

    @Test
    void getName() throws IncorrectInputException {
       Customer customer = new NullCustomer();
        String expected = customer.getName();
        customer.setName("TestName");
        assertEquals(expected, customer.getName());
    }

    @Test
    void getPets() {
        Customer customer = new NullCustomer();
        assertNotEquals(null, customer.getPets());
    }
}