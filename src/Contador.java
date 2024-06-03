import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo número deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        int contagem = 0;
        if ( parametroUm > parametroDois ) {
            throw new ParametrosInvalidosException();
        }else{
            contagem = parametroDois - parametroUm;
        }

        for(int x = 1; x <= contagem; x++){
            System.out.println("Imprimindo o núemro: " + x);
            
        }
    }
}
