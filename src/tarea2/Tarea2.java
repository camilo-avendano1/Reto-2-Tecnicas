/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea2;
import java.net.NetworkInterface;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion=5;  //iniciamos la variable opcion con un numero 
        while (opcion != 0){ //creamos el ciclo while el cual repetira el menú hasta que el usuario decida terminarlo 
        System.out.println("\n\nBienvenido Amiguito a mi menú:\n"
                + "1) Tablas de multiplicar\n"
                + "2) Cuadrados\n"
                + "3) Cubos con método de Nicómaco\n"           
                + "4) Cajero automático\n"
                + "0) Salir\n\n\n"
                + "Ingrese la opción que deseas elegir :");  //Creamos el menú principal de donde elegiremos las opciones--- usamos el \n para imprimir un salto de linea 
        Scanner lectura = new Scanner(System.in); //Creamos la variable Scanner que nos pedira ingresar datos
        opcion = lectura.nextInt(); //Creamos la variable opcion la cual almacenara en un String la opcion ingresada por el usuario 
    if(opcion == 1){
     int multiplicando, multiplicador;
    System.out.println("hasta que tabla deseas");
   
    multiplicando = lectura.nextInt();   //n y m sirven para que el usuario ingrese datos 
    System.out.println("hasta que numero deseas mulplicar ");
    multiplicador = lectura.nextInt();   // leemos las entradas y pedimos los datos al usuario
    for (int i = 1; i <= multiplicando; i = i + 1) {  // creamos un ciclos para la cantidad de tablas
      System.out.println("tabla del " + i);
      for (int j = 1; j <= multiplicador; j = j + 1) { // otro ciclo para multiplicar cada tabla hasta cierto numero
        int resultado = i * j;
        System.out.println(i + " * " + j + " = " + resultado);    // imprimimos cadamultiplicacion
      }
    }
    }
    
    if(opcion ==2){
    System.out.println("Ingrese la cantidad de los N primeros números a los cuales se les desea conocer los cuadrados: ");
    int base = lectura.nextInt();
    for (int i = 1; i <= base; i = i + 1) { // realizamos una lectura de hasta quenumero vamos a a leer
      System.out.println("el cuadrado de " + i + " se puede expresar como la suma de  ");
      for (int j = 0; j < i; j = j + 1) {
        int suma = 2 * j + 1;
        System.out.println(suma);
      }
    }
    }
        
        if(opcion ==3){  //inicio del punto 3
        System.out.println("Ingrese la cantidad de Números a los cuales deseas conocerle el cubo: "); //se le pregunta al usuario por la cantidad de primeros N cubos que desea saber 
        int cantidad = lectura.nextInt(); // Se toma el número del usuario ingresado 
        int aux = -1; //para poder tomar el valor inicia que es 1 cuando se sume con 2 
       for (int i = 1; i <= cantidad; i++) { 
        aux +=2; 
        int acumulado = aux;
            for (int j = 2; j <= i; j++) {  //ciclo para hacer las sumas consecutivas
                aux += 2;
                acumulado+= aux;
                     }
        System.out.println("\n"+acumulado); //muestra el acumulado final 
}
      
                }

        if(opcion == 4){ //inicio del punto 4
            int [] cont = new int[10]; //creamos un vector que almacene los valores de la cantidad de monedas o billetes a devolver
            System.out.println("Ingrese el valor del total a retirar:"); //le pedimos al usuario el valor que quiere retirar
            int valor = lectura.nextInt(); //tomamos el valor que el usuario ingreso
            if(valor >= 100){ //nos aseguramos que el usuario haya ingresado un valor mayor o igual a 100 pesos 
                    cont[0] = valor/100000;
                    valor = valor %100000;
                    cont[1]=valor/50000;
                    valor = valor % 50000;
                    cont[2] = valor/20000;
                    valor = valor%20000;
                    cont[3] = valor/10000;
                    valor = valor%10000;
                    cont[4] = valor /5000;
                    valor = valor%5000;   //analizamos la cantidad de dinero con la funcion division de enteros y modulo 
                    cont[5] = valor / 2000;
                    valor = valor %2000;
                    cont[6] = valor / 1000;
                    valor = valor%1000;
                    cont[7] = valor/500;
                    valor = valor % 500; 
                    cont[8] = valor/200; 
                    valor = valor %200;
                    cont[9] = valor/100;
            }
            else{
                  System.out.println("ingresó un valor incorrecto.");  
            }
            System.out.println("La cantidad de billetes de $100'000 = " + cont[0] + "\nLa cantidad de billetes de $50'000 = " + cont[1] + "\nLa cantidad de billetes de $20'000 = " + cont[2]
            + "\nLa cantidad de billetes de $10'000 = " + cont[3] + "\nLa cantidad de billetes de $5'000 = " + cont[4] + "\nLa cantidad de billetes de $2'000 = " + cont[5]
            + "\nLa cantidad de monedas de $1'000 = " + cont[6] + "\nLa cantidad de monedas de $500 = " + cont[7] + "\nLa cantidad de monedas de $200 = " + cont[8]
            + "\nLa cantidad de monedas de $100 = " + cont[9]); //Imprimimos la cantidad de billetes y monedas a devolver 
                }
            
            }
    }
    
}
