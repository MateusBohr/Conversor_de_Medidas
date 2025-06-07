public class Farenheit extends Valor {

    public Farenheit (double valor){
        this.valor = valor;
    }

    public void paraCelsius(double valor){
        double c = (valor - 32) * 5/9;
        System.out.println("Temperatura em Celsius: "+ c);
    }
    public void paraKelvin(double valor){
        double k = (valor - 32) * 5/9 + 273.15;
        System.out.println("Temperatura em Kelvin: "+k);
    }
}
