package ht1;


//Hans Cristopher Crasborn Marroquin   
//Jorge Antonio Robles Roman



import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ht1 {

    public static void main(String[] args) {

        int opcion;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero del ejercicio que desea realizar:");
        System.out.println("1.Cifras");
        System.out.println("2.Dias Fecha");
        System.out.println("3.Conversion");
        System.out.println("4.Promedio Edad y Altura");

        opcion = sc.nextInt();

        switch (opcion) {
            case 1: {
                Digito c = new Digito();
                c.Verificar();
                break;
            }
            case 2: {
                   Fecha f = new Fecha();
                   f.Dia();
                   
                break;
            }
            case 3: {

                Conversion c = new Conversion();
                c.Conver();
                break;
            }
            case 4: {
                EdadAltura edadAltura = new EdadAltura();
                edadAltura.Edad_Altu();
                break;
            }
        }

    }

}



class Digito {

    public void Verificar() {
        
        
       int decimales = 0,entero;    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Ingrese un numero cualquiera:");
    double num =sc.nextDouble();
    entero = (int)num;
     while(num > entero){
         num*=10;
         decimales++;
         entero=(int)num;
     }
     System.out.println("Tiene  " + decimales + " decimales" +" tiene estos Digitos: "+ Integer.toString(entero).length());
  
        
        
        

    }

}

class Fecha {

    public void Dia() {
        
        int anyo,mes,dia;
        int resultado;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese año: ");
        anyo = sc.nextInt();
        System.out.print("Ingrese mes: ");
        mes = sc.nextInt();
        System.out.print("Ingrese Dia: ");
        dia = sc.nextInt();
        
        if(mes ==1){
            resultado = dia;
            System.out.println("Dias transcurridos: "+resultado);
            
        }else if(mes==2){
            resultado = 31 +dia;
            System.out.println("Dias transcurridos: "+resultado);
        }else if(mes == 3){
            resultado = 59 +dia;
              System.out.println("Dias transcurridos: "+resultado);
        }else if(mes ==4){
                resultado = 90 + dia;
              System.out.println("Dias transcurridos: "+resultado);
        }else if(mes == 5){
            resultado = 120 + dia;
              System.out.println("Dias transcurridos: "+resultado);
        }else if (mes ==6){
         resultado = 151 + dia;
              System.out.println("Dias transcurridos: "+resultado);
        }else if (mes == 7){
            resultado = 181 + dia;
              System.out.println("Dias transcurridos: "+resultado);
        }else if (mes == 8){
              resultado = 212 + dia;
              System.out.println("Dias transcurridos: "+resultado);
        }else if (mes == 9){
                resultado = 243 + dia;
              System.out.println("Dias transcurridos: "+resultado);
            
        }else if (mes ==10){
            resultado = 273 + dia;
              System.out.println("Dias transcurridos: "+resultado);
        }else if (mes == 11){
             resultado = 304 + dia;
              System.out.println("Dias transcurridos: "+resultado);
        }else if(mes == 12){
            resultado = 334 + dia;
              System.out.println("Dias transcurridos: "+resultado);
        }
        
        
        
        
        
    }

}

class Conversion {

    public void Conver() {

        int opciones;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la conversion que desea efectuar: ");
        System.out.println("1. Pulgadas a Centimetros ");
        System.out.println("2. Kilogramos a Libras");
        opciones = sc.nextInt();

        switch (opciones) {

            case 1: {
                System.out.print("Ingrese medida en pulgadas: ");
                double medida;
                medida = sc.nextDouble();

                System.out.println("Pulgadas a centrimetros: " + (medida * 2.54));
                break;
            }

            case 2: {
                System.out.print("Ingrese peso en kilogramos: ");
                double peso;
                peso = sc.nextDouble();

                System.out.println("Kilogramos a Libras: " + (peso * 2.2));
                break;
            }
            default: {
                System.out.println("Error datos mal ingresados");
            }

        }

    }

}

class EdadAltura{

    public void Edad_Altu(){
        
        int edad;
        double altura;
        int contador = 0;
        double promedioedad = 0, promedioaltura = 0;
        
        
        Scanner sc = new Scanner(System.in);
        
        
        
        for (int i = 0; i < 6; i++) {
            System.out.print("Alumno "+(i+1));
            System.out.print("\nEdad: ");
            edad = sc.nextInt();
            System.out.print("Altura: ");
            altura = sc.nextDouble();
        
            if(altura > 1.70){
                contador++;
            }
            
            promedioedad = edad +promedioedad;
            promedioaltura = altura + promedioaltura;
        
        }
        
        double promE = promedioedad/6;
        double promA = promedioaltura/6;
        
        
        System.out.println("Promedio edad: "+promE);
        System.out.println("Promedio altura: "+promA);
        System.out.println("Personas mayores a 1.70: "+ contador);
        
    }



}
