package pet.clinic;
import java.util.ArrayList;

public class NullCustomer extends Customer{

    private ArrayList<Pet> pets;
    private String name = "Нет пользователя";
    private int id;

    public NullCustomer(){
        super();
    }

    public NullCustomer(String name, Pet... pets) {
        super();

    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id)  {
        this.id = -1;
    }

    public void setName(String name) throws IncorrectInputException{
        //this.name = name;
    }

    public void setPets(ArrayList<Pet> pets) {

    }



    public String getName() {
        return name;
    }

    public ArrayList<Pet> getPets() {
        this.pets = new ArrayList<>();
        pets.add(new NullPet());
        return pets;
    }
}
