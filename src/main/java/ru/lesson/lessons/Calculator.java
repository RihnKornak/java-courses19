package ru.lesson.lessons;
public class Calculator {
    private int result = 0;

    /**
     * Метод производит вычисление суммы передаваемых параметров и записывает их сумму в переменную result класса
     * @param first Уменьшаемое
     * @param second Вычитаемое
     */
    public void summ(int first, int second){
            this.result = first + second;
    }

    /**
     * Метод производит вычисление разности передаваемых параметров от первого к последнему и записывает результат в переменную result класса
     * @param first Делимое
     * @param second Делитель
     */
    public void subtract(int first, int second){
        this.result = first - second;
    }

    /**
     * Метод производит вычисление произведения передаваемых параметров и записывает результат в переменную result класса
     * @param first Первый множитель
     * @param second Второй множитель
     */
    public void multiplication(int first, int second){
        this.result = first * second;
    }

    /**
     * Метод производит операцию целочисленного деления от первого аргумента к последнему и записывает результат в переменную result класса. При попытке деления на ноль, метод сообщает об этом и обнуляет переменную result в классе
     * @param first Делимое
     * @param second Делитель
     */
        public void division(int first, int second){
              if (second != 0) this.result = first / second;
              else {
                  System.out.println("На ноль делить нельзя!");
                  this.cleanResult();
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
