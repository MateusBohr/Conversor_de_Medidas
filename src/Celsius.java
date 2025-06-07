public class Celsius extends Valor {

    public Celsius(double valor){
        this.valor = valor;
    }

    public void paraFarenheit(double valor){
         double f = valor * 9/5 + 32;
         System.out.println("Temperatura em Farenheit: "+f);
    }
    public void paraKelvin(double valor){
        double k = this.valor +273.15;
        System.out.println("Temperatura em Kelvin: "+k);
    }
}
