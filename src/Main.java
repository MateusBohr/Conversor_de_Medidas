import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int celsius =1;
        int farenheit = 2;
        int kelvin = 3;
        int centimetro = 4;
        int jarda = 5;
        int quilometro = 6;
        int metro = 7;
        int milha = 8;
        System.out.println("Olá bem vindo ao conversor de medidas, temos diversas conversões entre medidas comuns tanto de distância quanto temperatura, aqui está as opções");
        System.out.println("1-Celsius\n"+"2-Fahrenheit\n"+"3-Kelvin\n"+"4-Centímetro\n"+"5-Jarda\n"+"6-Quilômetro\n"+"7-Metro\n"+"8-Milha");
        System.out.println("Como funciona? Simples, nos informe as medidas a serem trabalhadas e o valor na medida de origem");
        System.out.println("Por exemplo: 50 metros pra quilometros. Informe o código de metros e o de quilômetro e por último o valor a ser convertido e pronto, a conversão foi feita ");
        Gerenciador gerenciador = new Gerenciador();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a origem: ");
        int origem = scanner.nextInt();
        System.out.println("Informe o destino: ");
        int destino = scanner.nextInt();
        System.out.println("Informe o valor de origem: ");
        double valor = scanner.nextDouble();
        gerenciador.setCelsius(new Celsius(valor));
        gerenciador.setFarenheit(new Farenheit(valor));
        gerenciador.setKelvin(new Kelvin(valor));
        gerenciador.setCentimetro(new Centimetro(valor));
        gerenciador.setJardas(new Jardas(valor));
        gerenciador.setKilometro(new Quilometro(valor));
        gerenciador.setMetro(new Metro(valor));
        gerenciador.setMilhas(new Milhas(valor));

        if (origem >= 1 && origem <= 3 && destino >= 1 && destino <= 3) {
            gerenciador.converterTemperatura(origem, destino, valor);
        } else {
            gerenciador.converterDistancia(origem, destino, valor);
        }

    }
}
