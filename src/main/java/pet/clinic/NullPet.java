package pet.clinic;
public class NullPet extends Pet {
    private String name = "Нет питомца";
    private int id;
    private Customer owner;

    /**
     * Method needed for situations, when there are no any pet
     * @return id -1
     */
    @Override
    public int getId() {
        this.id = -1;
        return this.id;
    }

    @Override
    public void setId(int id) {
    }

    @Override
    public Customer getOwner() {
        this.setOwner(new NullCustomer());
        return this.owner;
    }

    @Override
    public void setOwner(Customer owner) {

        this.owner = new NullCustomer();
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {

    }
}
