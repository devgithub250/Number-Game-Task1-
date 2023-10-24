/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number_game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Divakar
 */
public class Number_Game {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                 Scanner sc= new Scanner(System.in);
                 Random rand =new Random();
                 int a = rand.nextInt(100);
                 int count = 0;
                  try{
                       while (count>=0){
                          System.out.println("Enter first number : ");  
                           int user_num = sc.nextInt(); 
                                        if(user_num<=100){
                                               if (a<=100)
                                                   {
                                                      if (user_num==a)
                                                          {
                                                              System.out.println("You Guess Correct Number"+a);
                                                                   count--;
                                                                    break;
                                                           }
                                                        else if (user_num>a){
                                                             System.out.println("Too High "+user_num);
              
                                                                          } 
                                                else
                                                   {
                                                   System.out.println("Too low "+user_num); 
                                                     }
                                                  }
                                        }
                                        else{
                                            System.out.println(" input less than equal to 100");
                                        }
                                               
                                           
                                  }
                      }
                 catch (Exception e)
                {
                System.out.println("Something Error or only integer input");
                 }
        
         }
    
}
