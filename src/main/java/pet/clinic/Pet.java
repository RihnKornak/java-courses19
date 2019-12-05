package pet.clinic;
public  class Pet {
    private String name = "Безымянный";
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
        else this.owner = new NullCustomer();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws IncorrectInputException {
        if ((name.length()> 0) && (name != null))
        this.name = name;
        else throw new IncorrectInputException("Name mustn't be empty");
    }
}
