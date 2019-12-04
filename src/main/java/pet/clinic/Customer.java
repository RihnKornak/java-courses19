package pet.clinic;
import java.util.ArrayList;

public class Customer {
    private String name;
    private int id;
    private ArrayList<Pet> pets;

    public Customer(){
        //this.pets = new ArrayList<>();
    }

    public Customer(String name, Pet... pets){
        this.name = name;
        this.pets = new ArrayList<Pet>();
        if (pets.length != 0) {
            for (Pet pet : pets) {
                this.pets.add(pet);
            }
        }
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) throws IncorrectInputException {
        if (id > 0)
        this.id = id;
        else throw new IncorrectInputException("Id must be a positive number.");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) throws IncorrectInputException {
        if (name != null)
        this.name = name;
        else throw new IncorrectInputException("Name mustn't be empty");
    }

    public ArrayList<Pet> getPets() {
        return this.pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }
}
