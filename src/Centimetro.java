public class Centimetro extends Valor {
    public Centimetro(double valor){
        this.valor=valor;
    }

    public void paraMetro(double valor){
        double m = valor / 100;
        System.out.println(valor+" centimetros em metros: "+m+"m");
    }
}
