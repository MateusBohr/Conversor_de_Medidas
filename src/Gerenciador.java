public class Gerenciador {
    //Criação dos atributos baseados nas classes
    private Celsius celsius;
    private Farenheit farenheit;
    private Kelvin kelvin;
    private Centimetro centimetro;
    private Jardas jardas;
    private Quilometro quilometro;
    private Metro metro;
    private Milhas milhas;
    int origem;
    int destino;

    //Getters e setters das medidas de temperaturas
    public Celsius getCelsius() {
        return celsius;
    }

    public void setCelsius(Celsius celsius) {
        this.celsius = celsius;
    }

    public Farenheit getFarenheit() {
        return farenheit;
    }

    public void setFarenheit(Farenheit farenheit) {
        this.farenheit = farenheit;
    }

    public Kelvin getKelvin() {
        return kelvin;
    }

    public void setKelvin(Kelvin kelvin) {
        this.kelvin = kelvin;
    }

    //Criação de getters e setters das medidas de distância


    public Centimetro getCentimetro() {
        return centimetro;
    }

    public void setCentimetro(Centimetro centimetro) {
        this.centimetro = centimetro;
    }

    public Jardas getJardas() {
        return jardas;
    }

    public void setJardas(Jardas jardas) {
        this.jardas = jardas;
    }

    public Quilometro getKilometro() {
        return quilometro;
    }

    public void setKilometro(Quilometro quilometro) {
        this.quilometro = quilometro;
    }

    public Metro getMetro() {
        return metro;
    }

    public void setMetro(Metro metro) {
        this.metro = metro;
    }

    public Milhas getMilhas() {
        return milhas;
    }

    public void setMilhas(Milhas milhas) {
        this.milhas = milhas;
    }

    public void converterTemperatura(int origem, int destino, double valor) {
        // Celsius
        if (origem == 1 && destino == 3) {
            celsius.paraKelvin(valor);
        }
        if (origem == 1 && destino == 2) {
            celsius.paraFarenheit(valor);
        }

        // Fahrenheit
        if (origem == 2 && destino == 3) {
            farenheit.paraKelvin(valor);
        }
        if (origem == 2 && destino == 1) {
            farenheit.paraCelsius(valor);
        }

        // Kelvin
        if (origem == 3 && destino == 1) {
            kelvin.paraCelsius(valor);
        }
        if (origem == 3 && destino == 2) {
            kelvin.paraFarenheit(valor);
        }
  }
  public void converterDistancia(int origem, int destino,double valor){
      // Centímetro para Metro
      if (origem == 4 && destino == 7) {
          centimetro.paraMetro(valor);
      }

      // Jarda para Metro
      if (origem == 5 && destino == 7) {
          jardas.paraMetros(valor);
      }

      // Quilômetro para Metro
      if (origem == 6 && destino == 7) {
          quilometro.paraMetro(valor);
      }
      //Quilômetro para Milha
      if(origem == 6 && destino == 8){
          quilometro.paraMilha(valor);
      }
      //Metro para KM
      if(origem == 7 && destino == 6){
          metro.paraKilometro(valor);
      }
      //Metro para jardas
      if(origem == 7 && destino == 5){
          metro.paraJardas(valor);
      }
      //Milhas para KM
      if(origem == 8 && destino == 6){
          milhas.paraQuilometro(valor);
      }
      //Milhas para Metros
      if(origem == 8 && destino == 7){
          milhas.paraMetro(valor);
      }
  }
}



