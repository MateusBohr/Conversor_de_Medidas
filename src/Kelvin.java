public class Kelvin extends Valor {

    public Kelvin(double valor){
        this.valor = valor;
    }

    public void paraCelsius(double valor){
        double c = valor - 273.15;
        System.out.println("Temperatura em Celsius: "+ c);
    }
    public void paraFarenheit(double valor){
        double f = (valor - 273.15) * 9/5 + 32;
        System.out.println("Temperatura em Farenheit: "+f);
    }
}
