package _03_clasestring;

import java.util.Locale;

public class _01metodos{
    public static void main(String[] args) {
       String frase= "este es un ejemplo de texto",palabra="casa", palabra2="casa";
        System.out.printf("numero de letras de la frase : "+frase.length());
        System.out.printf(frase.toUpperCase(Locale.ROOT));
        System.out.printf(frase.toLowerCase());
        System.out.printf("la posicion en donde comienza la palabra ejemplo :"+frase.indexOf("ejemplo"));
        System.out.printf("la posicion en donde comienza la o(derecha a izquierda) :"+frase.lastIndexOf("0"));
        System.out.println(frase.equals(palabra));
        System.out.println(palabra.equalsIgnoreCase(palabra2));
        String cadena3="nunca mates una mosca sobre la cabeza de un tigre";
        System.out.println(cadena3.toUpperCase());
        System.out.println(cadena3.toLowerCase());
        System.out.println(cadena3.substring(0,5));
        System.out.println(cadena3.substring(16,21));
        System.out.println(cadena3.indexOf("cabeza"));
        System.out.println(cadena3.substring(31,38));
        System.out.println(cadena3.indexOf("m"));
        System.out.println(cadena3.length());




    }
}
