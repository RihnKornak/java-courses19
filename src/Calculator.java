public class Calculator {
    private int result = 0;

    /**
     * Метод производит вычисление суммы передаваемых параметров и записывает их сумму в переменную result класса
     * @param params Аргументы функции суммирования
     */
    public void summ(int... params){
        for (Integer param : params){
            this.result += param;
        }
    }

    /**
     * Метод производит вычисление разности передаваемых параметров от первого к последнему и записывает результат в переменную result класса
     * @param params Аргументы функции вычитания
     */
    public void subtract(int ... params){
        for (Integer param : params){
            this.result -= param;
        }
    }

    /**
     * Метод производит вычисление произведения передаваемых параметров и записывает результат в переменную result класса
     * @param params Аргументы функции произведения
     */
    public void multiplication(int... params){
        for (Integer param : params){
            this.result *= param;
    }
    }

    /**
     * Метод производит операцию целочисленного деления от первого аргумента к последнему и записывает результат в переменную result класса. При попытке деления на ноль, метод сообщает об этом и обнуляет переменную result в классе
     * @param params Аргументы функции деления
     */
        public void division(int... params){
            for (Integer param : params){
              if (param != 0) this.result /= param;
              else {
                  System.out.println("На ноль делить нельзя!");
                  this.cleanResult();
              }
            }

        }

    /** Метод позволяет получить величину переменной result класса
     *
     * @return int result
     */
    public int getResult(){
        return this.result;
    }

    /**
     * В этом методе происходит обнуление переменной result класса
     */
    public void cleanResult(){
        this.result = 0;
    }
}
