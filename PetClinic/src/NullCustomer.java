import java.util.ArrayList;

public class NullCustomer extends Customer{
    private String name = "Нет пользователя";
    private ArrayList<Pet> pets;

    public String getName() {
        return name;
    }

    public ArrayList<Pet> getPets() {
        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(new NullPet());
        return pets;
    }
}
