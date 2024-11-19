package interviewproblems;

import java.util.ArrayList;
import java.util.HashMap;
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
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static String Invierte(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

    public static String Invertir(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder strInvert = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            strInvert.append(str.charAt(i));
        }
        return strInvert.toString();
    }

    public static boolean validaPalindrome(String str) {
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void ordenamientoBurbuja(ArrayList<Integer> array) {

        for (int i = 0; i < array.size() - 1; i++) {
            for (int j = 0; j < array.size() - i - 1; j++) {
                if (array.get(j) > array.get(j + 1)) {
                    int temp = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, temp);
                }
            }
        }
    }

    public static void cuentaVocal(String str) {
        int a, e, i, o, u;
        int[] totvocal = new int[5];
        for (char letra : str.toCharArray()) {
            switch (letra) {
                case 'a' ->
                    totvocal[0]++;
                case 'e' ->
                    totvocal[1]++;
                case 'i' ->
                    totvocal[2]++;
            }
        }
        a = totvocal[0];
        e = totvocal[1];
        i = totvocal[2];
        o = totvocal[3];
        u = totvocal[4];
        System.out.println("Se contaron " + a + " vocales a");
        System.out.println("Se contaron " + e + " vocales e");
        System.out.println("Se contaron " + i + " vocales i");
        System.out.println("Se contaron " + o + " vocales o");
        System.out.println("Se contaron " + u + " vocales u");
    }

    public static boolean esHeterograma(String palabra) {

        char caracter;
        for (int i = 0; i < palabra.length(); i++) {
            caracter = palabra.charAt(i);
            if (Character.isLetter(caracter)) {
                for (int j = i + 1; j < palabra.length(); j++) {
                    if (caracter == palabra.charAt(j)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /**
     *
     * @param cadena
     * @return
     */
    public static char PrimerNoRepetidoFuerzaBruta(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            boolean repetido = false;
            for (int j = 0; j < cadena.length(); j++) {
                if (cadena.charAt(i) == cadena.charAt(j) && (i != j)) {
                    repetido = true;
                }
            }
            if (!repetido) {
                return cadena.charAt(i);
            }
        }
        return '_';
    }

    static char primerCaracterNoRepetido_metodosPredefinidos(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.indexOf(cadena.charAt(i)) == cadena.lastIndexOf(cadena.charAt(i))) {
                return cadena.charAt(i);
            }
        }
        return '_';
    }

    static char primerCaracterNoRepetido_hashMap(String cadena) {
        HashMap<Character, Integer> ocurrencias = new HashMap();
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (ocurrencias.containsKey(c)) {
                ocurrencias.put(c, ocurrencias.get(c) + 1);
            } else {
                ocurrencias.put(c, 1);
            }
        }

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (ocurrencias.get(c) == 1) {
                return c;
            }
        }
        return '_';
    }

    static char primerCaracterNoRepetido_arregloAsociado(String cadena) {
        int[] ocurrencias = new int[26];
        for (char c : cadena.toCharArray()) {
            ocurrencias[c - 'a']++;
        }
        for (char c : cadena.toCharArray()) {
            if (ocurrencias[c - 'a'] == 1) {
                return c;
            }
        }
        return '_';
    }

    public static int fibonnaci(int x) {
        if (x == 0 || x == 1) {
            return x;
        } else {
            return fibonnaci(x - 2) + fibonnaci(x - 1);
        }
    }
    public static int factorial(int x){
        if(x==0 || x == 1){
            return 1;
        }else{
            return x*factorial(x-1);
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
            System.out.println("** 6.- Es Heterograma               **");
            System.out.println("** 7.- Caracter Repetido            **");
            System.out.println("** 8.- Fibonacci                    **");
            System.out.println("** 9.- Factorial                    **");
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
                case 2 -> {
                    System.out.print("Ingresa una cadena: ");
                    String str = sc.nextLine();
                    //String str1 = sc.nextLine();
                    System.out.println("Cadena invertida usando StringBuilder: " + Invierte(str));
                    System.out.println("Cadena invertida sin usar StringBuilder: " + Invertir(str));
                }
                case 3 -> {
                    System.out.print("Ingresa una cadena: ");
                    String str = sc.nextLine();
                    if (!validaPalindrome(str)) {
                        System.out.println("La cadena " + str + " No Palindorme");
                    } else {
                        System.out.println("La cadena " + str + " es Palindorme");
                    }
                }
                case 4 -> {
                    System.out.print("Ingresa el total de numeros: ");
                    int n = sc.nextInt();
                    ArrayList<Integer> array = new ArrayList<>();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Ingresa el numero " + (i + 1) + ": ");
                        int s = sc.nextInt();
                        array.add(s);
                    }
                    ordenamientoBurbuja(array);
                    System.out.println("Ordenado: " + array);
                    sc.nextLine();
                }
                case 5 -> {
                    System.out.print("Ingresa frase: ");
                    String str = sc.nextLine();
                    cuentaVocal(str);
                }
                case 6 -> {
                    System.out.print("Ingresa una frase o palabra: ");
                    String str = sc.nextLine();
                    if (!esHeterograma(str)) {
                        System.out.println("La palabra " + str + " no es Heterograma");
                    } else {
                        System.out.println("La palabra " + str + " es Heterograma6");
                    }
                }
                case 7 -> {
                    String rpt;
                    do{
                    System.out.println("********************************");
                    System.out.println("**     MENU                   **");
                    System.out.println("** 1.- Por Fuerza Bruta       **");
                    System.out.println("** 2.- Por metodo predefinido **");
                    System.out.println("** 3.- Por HashMap            **");
                    System.out.println("** 4.- Por arreglos           **");
                    System.out.println("**                            **");
                    System.out.println("********************************");
                    System.out.print("Elege una opcion:  ");
                    int opt1 = sc.nextInt();
                    sc.nextLine();
                    switch (opt1) {
                        case 1 -> {
                            System.out.print("Ingresa frase: ");
                            String str = sc.nextLine();
                            System.out.println("Pimer caracter no repetido: "+PrimerNoRepetidoFuerzaBruta(str));
                        }
                        case 2 -> {
                            System.out.print("Ingresa frase: ");
                            String str = sc.nextLine();
                            System.out.println("Pimer caracter no repetido: "+primerCaracterNoRepetido_metodosPredefinidos(str));
                        }
                        case 3 -> {
                            System.out.print("Ingresa frase: ");
                            String str = sc.nextLine();
                            System.out.println("Pimer caracter no repetido: "+primerCaracterNoRepetido_hashMap(str));
                        }
                        case 4 -> {
                            System.out.print("Ingresa frase: ");
                            String str = sc.nextLine();
                            System.out.println("Pimer caracter no repetido: "+primerCaracterNoRepetido_arregloAsociado(str));
                        }
                    }
                        System.out.println("Deseas realizar otra opreacion? (S/N): ");
                        rpt = sc.nextLine();
                    }while(rpt.equals("s")|| rpt.equals("S"));
                }
                case 8 -> {
                    System.out.print("Ingresa numero: ");
                    int x = sc.nextInt();
                    for (int i = 0; i <= x; i++) {
                        System.out.print(fibonnaci(i) + " ");
                    }
                    sc.nextLine();
                }
                case 9 ->{
                    System.out.print("Ingresa numero: ");
                    int x = sc.nextInt();
                    int result = factorial(x);
                    System.out.println(result);
                    sc.nextLine();
                }
                default ->{
                    System.out.println("Ingresa una opcion valida");
                }
            }

            System.out.print("\n¿Deseas realizar otra operación? (Sí/No): ");
            respuesta = sc.nextLine().toLowerCase();
        } while (respuesta.equals("s") || respuesta.equals("S"));

        System.out.println("ADIOS BYE, GUSTO EN AYUDARTE A REPASAR");
    }

}


