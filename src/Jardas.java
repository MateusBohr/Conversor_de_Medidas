public class Jardas extends Valor {
    public Jardas(double valor){
        this.valor = valor;
    }
    public void paraMetros(double valor){
        double m = valor * 0.9144;
        System.out.println(valor+" jardas em metros: "+m+" m");
    }
}
