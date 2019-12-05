package pet.clinic;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ClinicTest {

    @Test
    void setId() {
        Clinic clinic = new Clinic();
        clinic.setId();
        int actual = clinic.getId();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void addCustomer() throws IncorrectInputException {
        Clinic clinic = new Clinic();
        Customer customer = new Customer();
        clinic.addCustomer(customer);
        int actual = clinic.getCustomers().size();
        int expected = 1;
        assertEquals(expected, actual);
        ArrayList<Customer> actualList = clinic.getCustomers();
        ArrayList<Customer> expectedList = new ArrayList<>();
        expectedList.add(customer);
        assertEquals(expectedList, actualList);
    }

    @Test
    void petsOfCustomer() {
        Clinic clinic = new Clinic();
        Pet pet1 = new Pet();
        Pet pet2 = new Pet();
        Customer customer = new Customer("TestCustomer", pet1, pet2);
        ArrayList<Pet> actual = clinic.petsOfCustomer(customer);
        ArrayList<Pet> expected = new ArrayList<>();
        expected.add(pet1);
        expected.add(pet2);
        assertEquals(expected, actual);


    }

    @Test
    void searchPet() throws IncorrectInputException {
        Clinic clinic = new Clinic();
        Pet pet = new Pet();
        Pet pet2 = new Pet();
        pet2.setName("Test");
        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(pet);
        pets.add(pet2);
        clinic.addPets(pets);
        Pet actualPet = clinic.searchPet("Test");
        Pet expectedPet = pet2;
        assertEquals(expectedPet, actualPet);

    }

    @Test
    void searchCustomer() throws IncorrectInputException {
        Clinic clinic = new Clinic();
        Customer customer1 = new Customer("TestCustomer1", new Pet());
        Customer customer2 = new Customer("TestCustomer2", new Pet());
        Customer customer3 = new Customer("TestCustomer3", new Pet());
        clinic.addCustomer(customer1);
        clinic.addCustomer(customer2);
        clinic.addCustomer(customer3);
        Customer actualCustomer = clinic.searchCustomer("TestCustomer2");
        Customer expectedCustomer = customer2;
        assertEquals(expectedCustomer, actualCustomer);
    }

    @Test
    void searchNullCustomer() throws IncorrectInputException{
        Clinic clinic = new Clinic();
        Customer customer1 = new Customer("TestCustomer1", new Pet());
        Customer customer2 = new Customer("TestCustomer2", new Pet());
        Customer customer3 = new Customer("TestCustomer3", new Pet());
        clinic.addCustomer(customer1);
        clinic.addCustomer(customer2);
        clinic.addCustomer(customer3);
        Customer actualCustomer = clinic.searchCustomer(null);
        Customer expectedCustomer = new NullCustomer();
        assertEquals(expectedCustomer.getName(), actualCustomer.getName());
    }

    @Test
    void editCustomerName() throws IncorrectInputException{
        Clinic clinic = new Clinic();
        Customer customer = new Customer("TestName", new Pet());
        clinic.editCustomerName(customer, "ChangedName");
        String actual = customer.getName();
        String expected = "ChangedName";
        assertEquals(expected, actual);
    }

    @Test
    void editCustomerEmptyName() throws IncorrectInputException{
        try {
            Clinic clinic = new Clinic();
            Customer customer = new Customer("TestName", new Pet());
            clinic.editCustomerName(customer, "");
        } catch (IncorrectInputException e) {
            assertEquals("Name mustn't be empty", e.getMessage());
        }
    }

    @Test
    void editPetName() throws IncorrectInputException {
        Clinic clinic = new Clinic();
        Pet pet = new Pet();
        pet.setName("TestName");
        clinic.editPetName(pet, "NewName");
        assertEquals("NewName", pet.getName());
    }

    @Test
    void getCustomers() throws IncorrectInputException {
        Clinic clinic = new Clinic();
        ArrayList<Customer> expectedCustomers = new ArrayList<>();
       for (int i = 0; i < 10; i++){
           String name = "TestCustomer" + (i + 1);
           Pet pet = new Pet();
           Customer customer = new Customer(name, pet);
           expectedCustomers.add(customer);
           clinic.addCustomer(customer);
        }
       assertEquals(expectedCustomers, clinic.getCustomers());

    }

    @Test
    void getPets() throws IncorrectInputException {
        Clinic clinic = new Clinic();
        ArrayList<Pet> pets = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String name = "TestPet" + (i + 1);
            Pet pet = new Pet();
            pet.setName(name);
        }
        clinic.addPets(pets);
        assertEquals(pets, clinic.getPets());

    }

    @Test
    void addPetsAsList() throws IncorrectInputException {
        Clinic clinic = new Clinic();
        Customer customer = new Customer();
        customer.setName("TestCustomer");
        ArrayList<Pet> pets = new ArrayList<>();
        Pet pet = new Pet();
        pet.setName("TestPet");
        pets.add(pet);
        clinic.addPets(pets);
        assertEquals(pets, clinic.getPets());

    }

    @Test
    void addPetsAsNullList() throws IncorrectInputException {
        Clinic clinic = new Clinic();
        Customer customer = new Customer();
        customer.setName("TestCustomer");
        ArrayList<Pet> pets = new ArrayList<>();
        clinic.addPets(pets);
        assertEquals(pets, clinic.getPets());
    }

    @Test
    void addPetsFromCustomer() throws IncorrectInputException {
        Clinic clinic = new Clinic();
        Customer customer = new Customer();
        ArrayList<Pet> pets = new ArrayList<>();
        customer.setName("TestCustomer");
        Pet pet = new Pet();
        pet.setName("TestPet");
        pets.add(pet);
        customer.setPets(pets);
        clinic.addPets(customer);
        assertEquals(pets, clinic.getPets());
    }

    @Test
    void addPetsFromNullCustomer() throws IncorrectInputException {
        Clinic clinic = new Clinic();
        Customer customer = new NullCustomer();
        ArrayList<Pet> pets = new ArrayList<>();
        customer.setName("TestCustomer");
        Pet pet = new Pet();
        pet.setName("TestPet");
        pets.add(pet);
        customer.setPets(pets);
        ArrayList<Pet> expectedList = customer.getPets();
        clinic.addPets(customer);
        assertNotEquals(expectedList, clinic.getPets());
    }

    @Test
    void testAddPetsNull() throws IncorrectInputException {
        Clinic clinic = new Clinic();
        Customer customer = new Customer();
        customer.setName("TestCustomer");
        ArrayList<Pet> pets = new ArrayList<>();
        customer.setPets(pets);
        clinic.addPets(pets);
        assertEquals(pets, clinic.getPets());
    }
}