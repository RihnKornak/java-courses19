package pet.clinic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NullPetTest {

    @Test
    void getId() {
        Pet pet = new NullPet();
        assertEquals(-1, pet.getId());
    }

    @Test
    void setId() {
        Pet pet = new NullPet();
        int expected = pet.getId();
        pet.setId(100);
        int actual = pet.getId();
        assertEquals(expected, actual);
    }

    @Test
    void getOwner(){
        Pet pet = new NullPet();
        Customer owner = new Customer();
        boolean expected = pet.getOwner() instanceof NullCustomer;
        pet.setOwner(owner);
        boolean actual= pet.getOwner() instanceof NullCustomer;
        assertEquals(expected, actual);
    }

    @Test
    void setOwner() {
        Pet pet = new NullPet();
        Customer owner = new Customer();
        boolean expected = pet.getOwner() instanceof NullCustomer;
        pet.setOwner(owner);
        boolean actual= pet.getOwner() instanceof NullCustomer;
        assertEquals(expected, actual);
    }

    @Test
    void getName() throws IncorrectInputException {
        Pet pet = new NullPet();
        String expected = pet.getName();
        pet.setName("TestName");
        String actual = pet.getName();
        assertEquals(expected, actual);
    }

    @Test
    void setName() throws IncorrectInputException {
        Pet pet = new NullPet();
        String expected = pet.getName();
        pet.setName("TestName");
        String actual = pet.getName();
        assertEquals(expected, actual);
    }
}