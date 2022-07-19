package org.alandelacruz.System;
import java.util.Scanner;
/**
 * 
 * @author alan eduardo de la cruz najera
 * @carnet  2020390
 * @seccion  IN5BV
 */
public class Principal {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int num1;   
     int opciones;
     
      System.out.println("Alan De La Cruz");  
      System.out.println("IN5BV");  
      System.out.println("");    
      System.out.println("-----MENÚ DE OPCIONES----");
      System.out.println("1 - Conventir segundos a formao h:m:s");
      System.out.println("2 - contidad de billetes");
      System.out.println("3 - par o impar");
      System.out.println("4 - número es perfecto o no. ");       
      System.out.println("5 - serie Fibonacci,");
      System.out.println();
      System.out.println("ingresa tu opcion:");
      opciones = in.nextInt();
        
        switch(opciones){
          case 1:
              System.out.println("ingresa la cantidad de segundos:");
              num1 = in.nextInt();
              int horas = (num1/3600);
              int minutos =((num1-horas*3600)/60);
              int segundos = num1-(horas*3600+minutos*60);
              System.out.println("horas:"+horas+" "+
                                 "minutos:"+minutos+" "+
                                 "segundos:"+segundos);
              break;
          case 2:
              int billetes200=0;
              int billetes100=0;
              int billetes50=0;
              int billetes20=0;
              int billetes10=0;
              int billetes5=0;
              int billetes1=0;
              
              System.out.println("ingresa el valor entero:");
              num1 = in.nextInt();
              
              billetes200=num1/200;
              num1 = num1- (billetes200*200);
              billetes100=num1/100;
              num1 = num1-(billetes100*100);
              billetes50=num1/50;
              num1 = num1-(billetes50*50);
              billetes20=num1/20;
              num1 = num1-(billetes20*20);
              billetes10=num1/10;
              num1 = num1-(billetes50*10);
              billetes5=num1/5;
              num1 = num1-(billetes5*5);
              billetes1=num1/1;
              
              if(billetes200 >=0){
              System.out.println("cantidad de billestes de 200:"+billetes200);
              }
              if(billetes100 >=0){
              System.out.println("cantidad de billestes de 100:"+billetes100);
              }
              if(billetes50 >=0){
              System.out.println("cantidad de billestes de 50:"+billetes50);
              }
              if(billetes20 >=0){
              System.out.println("cantidad de billestes de 20:"+billetes20);
              }
              if(billetes10 >=0){
              System.out.println("cantidad de billestes de 10:"+billetes10);
              }
              if(billetes5 >0){
              System.out.println("cantidad de billestes de 5:"+billetes5);
              }
              if(billetes1 >0){
              System.out.println("cantidad de billestes de 1:"+billetes1);
              }
              break;
             
              
              case 3:
                  int num2;
                  
                  System.out.println("ingres el numero entero:");
                  num2 = in.nextInt();
                  if ((num2 % 2) ==0){
                      System.out.println("el numero es par");
                  }else{
                      System.out.println("el numero es impar");
                   }
              break;
              case 4:
                  int num3;
                  int suma=0;
                  System.out.println("ingresa el numero:");
                  num3 = in.nextInt();
                  for(int i =1;i<num3;i++){
                      if(num3%i==0){
                        suma=suma+i;
                  }
                  }
                   if(suma==num3){
                      System.out.println("el munero es perfecto");
                  }
                  else{
                      System.out.println("el munero es no perfecto");
                  }
                  break;
              case 5:
                    int num4 = 0;
                    int num5 = 1;
                    int temp;
                    int conta =2;
                    int limite;
    
                    System.out.print("Ingrese un munero ");
                    limite = in.nextInt();
        
                    System.out.print("\n" + num4 + "\t");
                    System.out.print(num5 + ", \t");
        
                    while( conta < limite){
                    conta++;
                    temp = num4;
                    num4= num5;
                    num5 = temp + num5;
                    System.out.print(num5 + ", \t");
        
                    }
                    System.out.print("\n");
 }   
}
 }
        
        