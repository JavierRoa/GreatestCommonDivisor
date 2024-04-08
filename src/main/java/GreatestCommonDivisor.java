public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }
    private static int getGreatestCommonDivisor(int first, int second) {
        // Valido según reglas establecidas en el ejercicio.
        if(first<10 || second<10) {
            return -1;
        }
        int firstDivisor;  // Creo variable para almacenar divisores (uno a la vez) del primer número.
        int secondDivisor;  // Creo variable para almacenar divisores (uno a la vez) del segundo número.
        // Uso bucle for inverso para revisar los número entre 1 y el primer número y:
        for(int i = first; i > 0; i--) {
            if(first % i == 0) {
                firstDivisor = i;  // Dar como valor a la variable firstDivisor, el divisor del primer número.
                // Usar un bucle for inverso para realizar la misma acción, pero esta vez con el segundo número.
                for(int x = second; x > 0; x--) {
                    if(second % x == 0) {
                        secondDivisor = x; // Dando como valor a la variable secondDivisor, el divisor del segundo número.
                        // Realizando la comparación...
                        if(firstDivisor == secondDivisor) {
                            return firstDivisor;  // Y retornando el número coincidente.
                        }
                    }
                }
            }
        }
        return -1; // Este vaalor de return será arrojado si no existe máximo común divisor, lo cual es imposible, ya que al menos existe el 1. Se usa debido a la exigencia de la función de tener un return.
    }
    public static int getGreatestCommonDivisorEnhanced(int first, int second){
        // Valido según reglas establecidas en el ejercicio.
        if ((first < 10) || (second < 10)){
            return -1;
        }
        // Usando algoritmo de Euclides para MCD, que consiste en restar el menor número
        // al mayor, y repetir el proceso hasta que ambos sean iguales.
        while (first != second) {
            if (first > second) {
                first -= second; // Resta al valor de first, el valor de second.
            } else {
                second -= first; // Resta al valor de second, el valor de first.
            }
        }
        // Al ser ambos números iguales, retorna first (retornar second, sería lo mismo).
        return first;
    }
}
