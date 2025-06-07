public class Quilometro extends Valor {
    public Quilometro(double valor){
        this.valor = valor;
    }
    public void paraMetro(double valor){
        double m = valor * 1000;
        System.out.println(valor+" kilômetro em metros: "+m+" m");
    }
    public void paraMilha(double valor){
        double milha = valor / 1.60934;
        System.out.println(valor+" kilômetro em milhas: "+milha+" milhas");
    }

}
