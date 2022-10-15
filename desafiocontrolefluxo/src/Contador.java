import java.util.Scanner;

public class Contador {

    /**
     * @param args
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o primeiro numero");
        int num1 = sc.nextInt();
        
        System.out.println("Digite o segundo numero");
        int num2 = sc.nextInt();

         sc.close();
        try {
   
           contar(num1, num2);

        } catch ( ParametrosInvalidosException e){

            System.out.println("O segundo parâmetro deve ser maior que o primeiro");  
        }
        

    } 

    static void contar(int num1, int num2 ) throws ParametrosInvalidosException {


        for (int contador = num1; contador<=num2;contador ++ )
        System.out.println(contador);    

        if(num1 > num2)
        throw new ParametrosInvalidosException();
    }

}


