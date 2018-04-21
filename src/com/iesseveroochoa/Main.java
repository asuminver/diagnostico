package com.iesseveroochoa;

/**
 * @author Profe Severo
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Valoración de " + args[0] + ": " + args[1] + " visto / exito " + args[2]);
        System.out.println(valoracion(args[1], args[2]));
    }

    /**
     * Diagnostica el resultado obtenido.
     * @param valor1 nota prevista
     * @param valor2 nota conseguida
     * @return mensaje personalizado.
     */
    private static String valoracion(String valor1, String valor2) {
        if (valor1.equals(valor2)) {
            return "Perfecto. Es lo previsto";
        }
        if (Integer.valueOf(valor1) < Integer.valueOf(valor2)) {
            return "Has mejorado las espectativas";
        }
        return "Estas sobrevalorado";
    }
}
