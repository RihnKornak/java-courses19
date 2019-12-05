package pet.clinic;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getId() {
        Customer customer = new Customer();
        assertEquals(0, customer.getId());
    }

    @Test
    void setId() throws IncorrectInputException {
        Customer customer = new Customer();
        customer.setId(100);
        assertEquals(100, customer.getId());
    }

    @Test
    void setWrongId() throws IncorrectInputException {
        try {
            Customer customer = new Customer();
            customer.setId(-5);
        } catch (IncorrectInputException e) {
            assertEquals("Id must be a positive number.", e.getMessage());
        }
    }

    @Test
    void getName() throws IncorrectInputException {
        Customer customer = new Customer();
        customer.setName("TestName");
        assertEquals("TestName", customer.getName());
    }

    @Test
    void setName() throws IncorrectInputException {
        Customer customer = new Customer();
        String expected = customer.getName();
        customer.setName("TestName");
        assertEquals("TestName", customer.getName());
    }

    @Test
    void setWrongName() throws IncorrectInputException {
        try {
            Customer customer = new Customer();
            customer.setName("");
        } catch (IncorrectInputException e) {
            assertEquals("Name mustn't be empty", e.getMessage());
        }
    }

    @Test
    void getPets() throws IncorrectInputException {
        Customer customer = new Customer();
        ArrayList<Pet> pets = new ArrayList<>();
        Pet pet = new Pet();
        pet.setName("TestPet");
        pets.add(pet);
        customer.setPets(pets);
        assertEquals(pets, customer.getPets());
    }

    @Test
    void setPets() throws IncorrectInputException {
        Customer customer = new Customer();
        ArrayList<Pet> pets = new ArrayList<>();
        Pet pet = new Pet();
        pet.setName("TestPet");
        customer.setPets(pets);
        assertEquals(pets, customer.getPets());
    }
}