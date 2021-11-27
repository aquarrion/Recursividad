public class Ejercicio {

    public static int factorial (int n){
        int factorial;

        if (n == 1){
            //caso base
            factorial = n;
        }else{
            factorial = n * factorial(n - 1);
        }

        return factorial;
    }
}
