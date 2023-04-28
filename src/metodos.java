import java.util.InputMismatchException;
import java.util.Scanner;

public class metodos
{
    public void CalcularSomaPa(float primeiroTermo, float termos, float razao)
    {
        float ultimoTermo = primeiroTermo + (termos - 1) * razao;
        System.out.println("Último termo da PA: " + ultimoTermo);

        float soma = (primeiroTermo + ultimoTermo) * (termos / 2);
        System.out.println("Soma de todos os termos da PA: " + soma);
    }

    public void PedirParametros()
    {
        try
        {
            Scanner teclado = new Scanner(System.in);

            System.out.print("Digite o valor do primero termo de uma PA: ");
            float primeiroTermo = teclado.nextFloat();

            System.out.print("Digite a razão da PA: ");
            float razao = teclado.nextFloat();

            System.out.print("Digite o número de termos da PA: ");
            float termos = teclado.nextInt();

            CalcularSomaPa(primeiroTermo, termos, razao);
        }
        catch(InputMismatchException e)
        {
            System.out.println("O valor a ser digitado precisa ser um número válido (ex: 0; 1; 2,5), tente novamente.");
            PedirParametros();
        }
    }
}
