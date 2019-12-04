package pet.clinic;

public class NameRandomizer {
    private int coursor;
    StringBuffer name;
    public NameRandomizer(){
        this.name = new StringBuffer();
    }

    public void makeName(){
        int minBorderOfLettersInUTF =65;
        int maxBorderOfLettersInUTF =122;
        int randomNumber;
        char letter;
        int index = (int) (Math.random() * (7 - 2) + 2); // Each name have from 2 to 7 letters
        for (int i = 0; i <= index; i++){
            randomNumber = (int)(Math.random()*(maxBorderOfLettersInUTF - minBorderOfLettersInUTF) + minBorderOfLettersInUTF);
            letter = (char) randomNumber;
            this.name.append(letter);
        }
    }
}
