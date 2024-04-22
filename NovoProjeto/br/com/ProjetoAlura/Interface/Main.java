package br.com.ProjetoAlura.Interface;
import br.com.ProjetoAlura.Objetos.CambioPrincipalR;
import br.com.ProjetoAlura.Objetos.Integracao;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            System.out.println("**************************************************************************");
            System.out.println("Bem vindo(a) ao conversor de moedas! Escolha uma das opções abaixo.");
            System.out.println("**************************************************************************");

            System.out.println("1º) Real ---> Peso Argentino");
            System.out.println("2ª) Real ---> Dólar Americano");
            System.out.println("3ª) Real ---> Euros");
            System.out.println("4ª) Euros ---> Real");
            System.out.println("5ª) Dólar Americano ---> Real");
            System.out.println("6ª) Peso Argentino ---> Real");
            System.out.println("7ª) Sair");

            String busca = scanner.nextLine();
            String baseCode = "";
            String targetCode = "";

            switch (busca) {
                case "1":
                    baseCode = "BRL";
                    targetCode = "ARS";
                    break;
                case "2":
                    baseCode = "BRL";
                    targetCode = "USD";
                    break;
                case "3":
                    baseCode = "BRL";
                    targetCode = "EUR";
                    break;
                case "4":
                    baseCode = "EUR";
                    targetCode = "BRL";
                    break;
                case "5":
                    baseCode = "USD";
                    targetCode = "BRL";
                    break;
                case "6":
                    baseCode = "ARS";
                    targetCode = "BRL";
                    break;
                case "7":
                    System.out.println("Encerrando o programa...");
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

            if (!executando) {
                break;
            }

            try {
                System.out.println("Digite o valor para conversão:");
                String valor = scanner.nextLine();
                CambioPrincipalR resultado = Integracao.consultarAPI(baseCode, targetCode, valor);
                System.out.println("Valor " + valor + " " + baseCode + " corresponde ao valor final de =>>> "
                        + resultado.conversion_result()
                        + " " + targetCode);
            } catch (IOException | InterruptedException e) {
                System.out.println("Erro ao consultar a API: " + e.getMessage());
            }
        }
    }
}


