public class Milhas extends Valor {
    public Milhas (double valor){
        this.valor = valor;
    }
    public void paraQuilometro(double valor){
        double k =  valor * 1.60934;
        System.out.println(valor+" milhas em kilômetro: "+valor+"Km");
    }
    public void paraMetro(double valor){
        double m = valor * 1609.34;
        System.out.println(valor+" milhas em metros: "+m+"m");
    }
}
