public class Calculator {
    private int result = 0;


    public void summ(int... params){
        for (Integer param : params){
            this.result += param;
        }
    }
    public int getResult(){
        return this.result;
    }
    public void cleanResult(){
        this.result = 0;
    }
}
