package pet.clinic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {

    @Test
    void getId() {
        Pet pet = new Pet();
        pet.setId(1);
        assertEquals(1, pet.getId());
    }

    @Test
    void getWrongId() {
        Pet pet = new Pet();
        pet.setId(-5);
        assertEquals(0, pet.getId());
    }

    @Test
    void setId() {
        Pet pet = new Pet();
        pet.setId(1);
        assertEquals(1, pet.getId());
    }

    @Test
    void setWrongId() {
        Pet pet = new Pet();
        pet.setId(-10);
        assertEquals(0, pet.getId());
    }

    @Test
    void getOwner() {
        Customer owner = new Customer();
        Pet pet = new Pet();
        pet.setOwner(owner);
        assertEquals(owner, pet.getOwner());
    }

    @Test
    void setOwner() {
        Customer owner = new Customer();
        Pet pet = new Pet();
        pet.setOwner(owner);
        assertEquals(owner, pet.getOwner());
    }

    @Test
    void setNullOwner() {
        Customer owner = null;
        Pet pet = new Pet();
        pet.setOwner(owner);
        assertNotEquals(null, pet.getOwner());
    }

    @Test
    void getNullName() {
        Pet pet = new Pet();
        assertEquals("Безымянный", pet.getName());
    }

    @Test
    void setName() throws IncorrectInputException {
        Pet pet = new Pet();
        pet.setName("TestPet");
        assertEquals("TestPet", pet.getName());
    }

    @Test
    void setWrongName() throws IncorrectInputException {
        try {
            Pet pet = new Pet();
            pet.setName("");
        } catch (IncorrectInputException e) {
            assertEquals("Name mustn't be empty", e.getMessage());
        }

    }
}