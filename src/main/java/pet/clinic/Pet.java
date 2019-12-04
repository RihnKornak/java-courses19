package pet.clinic;
public  class Pet {
    private String name;
    private int id;
    private Customer owner;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0 )
        this.id = id;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        if (owner != null)
        this.owner = owner;
        else owner = new NullCustomer();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
