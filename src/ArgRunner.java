public class ArgRunner {
    public static void main(String[] args) {
        if (args.length == 2){
            int param1 = Integer.parseInt(args[0]);
            int param2 = Integer.parseInt(args[1]);
           Calculator calc = new Calculator();
           calc.summ(param1, param2);
           System.out.println("Summ is : " + calc.getResult());
        }else System.out.println("Enter two parameters!");
    }
}
