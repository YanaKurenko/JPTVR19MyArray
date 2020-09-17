/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19myarray;

import static java.lang.Double.sum;
import java.util.Random;

/**
 *
 * @author pupil
 */
class App {
    public void run(){
            System.out.println("------------Programm MyArray------------");
            System.out.println("Создать массив типа  int с названием MyArray с 20 ячейками");
            int myArray [] = new int[20];
            System.out.println("Заполнить массив случацными значениями ");
            Random random = new Random ();
            for(int i = 0; i < myArray.length; i++) {
                myArray [i] = random.nextInt(49-0+1)-0;
            }
            System.out.println("Вывести значения массива");
            for(int i = 0; i < myArray.length; i++){
                System.out.printf("%-3d",myArray[i]);
            }
            System.out.println("");
            System.out.println("Вывести значения массива наоборот");
            for(int i = myArray.length; i > 0; i--){
                System.out.printf("%-3d",myArray[i-1]);
            }
            System.out.println("");
            System.out.println("вывести сумму значений массива");
            int sum = 0;
            for(int i = 0; i < myArray.length; i++){
                sum = sum + myArray[i];
            }
            System.out.println(sum);
            System.out.println("");
                
            
    }
   
    
    
 
}

