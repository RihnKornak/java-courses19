package pet.clinic;
import java.util.ArrayList;

public class Customer {
    private String name;
    private int id;
    private ArrayList<Pet> pets;
    public Customer(){ }

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

    public void setId(int id) { //Тут позже надо добавить исключение, если id <= 0
        if (id > 0)
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {  //Тут позже надо добавить исключение для имени null!!!
        if (name != null)
        this.name = name;
    }

    public ArrayList<Pet> getPets() {
        return this.pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }
}
