package pet.clinic;
import java.util.ArrayList;

public class Clinic {
    private ArrayList<Customer> customers;
    private ArrayList<Pet> pets;
    private static int idCounter = 0;


    private int setId(){
        int id = Clinic.idCounter++;
        return id;
    }

    /**
     * This method add new customer to clinic
     * @param customer - the new customer
     */
    public void addCustomer(Customer customer) throws IncorrectInputException{
    ArrayList<Customer> customers = this.getCustomers();
    customer.setId(this.setId());
    customers.add(customer);
    this.setCustomers(customers);
    }

    /**
     * This method allows to show all pets of selected customer
     * @param customer - the customer
     * @return list of pets
     */
    public ArrayList<Pet> PetsOfCustomer(Customer customer){
        return customer.getPets();
    }

    /**
     * Method search and return Pet pet with used name. At that moment method returns only the first Pet with equal name. But later will return all of them
     * @param name name of the pet
     * @return Pet pet with the same name
     */
    public Pet searchPet(String name){
        ArrayList<Pet> allPets = this.getPets();
        Pet pet = new NullPet();
        for (Pet eachPet : allPets){
            String petName = eachPet.getName();
            if (petName.equals(name)) {
                pet = eachPet;
            }
        }
        return pet;
    }

    public Customer searchCustomer(String name){
        ArrayList<Customer> customers = this.getCustomers();
        Customer customer = new NullCustomer();
        for (Customer eachCustomer : customers){
            String customerName = eachCustomer.getName();
            if (customerName.equals(name))
                customer = eachCustomer;
        }
        return customer;
    }

    public void editCustomerName(Customer customer, String name) throws IncorrectInputException {
        customer.setName(name);
    }

    public void editPetName(Pet pet, String name){
            pet.setName(name);
    }

    private ArrayList<Customer> getCustomers() {
        return customers;
    }

    private void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    private ArrayList<Pet> getPets() {
        return pets;
    }

    private void addPets(ArrayList<Pet> pets) {
        for (Pet pet : pets) {
            pet.setId(this.setId());
            this.pets.add(pet);
        }
    }
    private void addPets(Customer customer) {
        ArrayList<Pet> pets = customer.getPets();
        for (Pet pet : pets) {
            pet.setId(this.setId());
            this.pets.add(pet);
        }
    }

}