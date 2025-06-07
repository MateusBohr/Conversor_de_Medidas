public class Metro extends Valor {
    public Metro(double valor){
        this.valor = valor;
    }
    public void paraKilometro(double valor){
        double km = valor / 1000;
        System.out.println(valor+" metros em kilômetros: "+ km+" Km");
    }
    public void paraJardas(double valor){
        double j = valor / 0.9144;
        System.out.println(valor+" metros em jardas: "+ j+" Jardas");
    }
}
