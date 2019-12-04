package pet.clinic;

import java.util.ArrayList;

public class ClinicRunner {
    private Clinic clinic;
    private NameRandomizer nameRandomizer;
    private ClinicRunner(Clinic clinic, NameRandomizer nameRandomizer){
        this.clinic = new Clinic();
        this.nameRandomizer = new NameRandomizer();
    }

    public static void main(String[] args) throws IncorrectInputException{
        ClinicRunner clinicRunner = new ClinicRunner(new Clinic(), new NameRandomizer());
        Pet pet;
        for (int i = 0; i < 100; i++ ){
            clinicRunner.nameRandomizer.makeName();
            int numberOfPets = i/25 + 1;
            Customer customer = clinicRunner.makeCustomer(clinicRunner.nameRandomizer.getName(), numberOfPets);
            clinicRunner.clinic.addCustomer(customer);
            clinicRunner.clinic.addPets(customer);
        }
        int i = 0;
        for (Customer customer : clinicRunner.clinic.getCustomers()) {
            System.out.println(++i + " : " + "Customer : " + customer.getName() + ". Number of pets : " +
                    customer.getPets().size() + ". ID#" + customer.getId() + " . Pets : " + customer.getPets().toString());

        }
    }

    public Customer makeCustomer(String name, int numberOfPets) throws IncorrectInputException{
        Customer customer = new Customer();
        customer.setName(name);
        customer.setId(this.clinic.setId());
        ArrayList<Pet> listOfPets = new ArrayList<>();
        for (int i = 0; i < numberOfPets; i++){
            this.nameRandomizer.makeName();
            Pet pet = this.makePet(this.nameRandomizer.getName(), customer);
            listOfPets.add(pet);
        }
        customer.setPets(listOfPets);
        return customer;
    }

    public Pet makePet(String name, Customer owner) throws IncorrectInputException{
        Pet pet = new Pet();
        pet.setName(name);
        pet.setOwner(owner);
        pet.setId(clinic.setId());
        return pet;
    }
}
