package interviewproblems;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Roman Bautista
 */
public class InterviewProblems {

    public static void encuentraFizBuz(int n) {
        
        for (int i = 1; i < n; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FIZZBUZZ");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if(i%3 == 0) {
                System.out.println("Fizz");
            }else{
                System.out.println(i);
            }
        }
    }
    public static String Invierte(String str){
        if(str == null){
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }
    public static String Invertir(String str){
        if(str == null){
            return null;
        }
        StringBuilder strInvert = new StringBuilder();
        for(int i = str.length()-1;i>=0;i--){
            strInvert.append(str.charAt(i));
        }
        return strInvert.toString();
    }
    
    public static boolean validaPalindrome(String str){
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
           if (str.charAt(i) != str.charAt(j)) {
               return false;
           }
       }
       return true;
    }
    
    public static void ordena(int n){
        ArrayList<Integer> arra = new ArrayList<>();
        
        for(int i = 0;i<=arra.size();i++){
            
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        int opt;
        String respuesta;
        do {
            System.out.println("**************************************");
            System.out.println("**   Menu Ejercicios Entrevistas    ** ");
            System.out.println("** 1.- Problema FIZZBUZZ            **");
            System.out.println("** 2.- Invertir cadena              **");
            System.out.println("** 3.- Valida Palindromo            **");
            System.out.println("** 4.- Ordenan numeros              **");
            System.out.println("** 5.- Cuenta vocales               **");
            System.out.println("** 6.- Caracter no repetido         **");
            System.out.println("** 7.- Factorial                    **");
            System.out.println("** 8.- Fibonacci                    **");
            System.out.println("** ... continuará                   **");
            System.out.println("** n.- salir                        **");
            System.out.println("**                                  **");
            System.out.println("**************************************");

            System.out.print("Que deseas hacer hoy: ");
            opt = sc.nextInt();
            sc.nextLine();
            switch (opt) {
                case 1 -> {
                    System.out.print("Ingresa tu numero tope: ");
                    int num = sc.nextInt();
                    sc.nextLine();
                    encuentraFizBuz(num);
                }
                case 2 ->{
                    System.out.print("Ingresa una cadena: ");
                    String str = sc.nextLine();
                    //String str1 = sc.nextLine();
                    System.out.println("Cadena invertida usando StringBuilder: " + Invierte(str));
                    System.out.println("Cadena invertida sin usar StringBuilder: "+Invertir(str));
                }
                case 3 ->{
                    System.out.print("Ingresa una cadena: ");
                    String str = sc.nextLine();
                    if(!validaPalindrome(str)){
                        System.out.println("La cadena "+str+" No Palindorme");
                    }else{
                        System.out.println("La cadena "+str+" es Palindorme");
                    }
                }
                case 4->{
                    System.out.println("Ingresa el total de numeros: ");
                    int n = sc.nextInt();
                    ordena(n);
                }
            }

            System.out.print("\n¿Deseas realizar otra operación? (Sí/No): ");
            respuesta = sc.nextLine().toLowerCase();
        } while (respuesta.equals("s") || respuesta.equals("S"));

        System.out.println("ADIOS BYE, GUSTO EN AYUDARTE A REPASAR");
    }

}
