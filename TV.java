public class TV { 
    int polegada;
    int volume = 5;
    String marca;
    int voltagem;
    int canal;

    void ligar() {
        int consumo = voltagem * polegada;
        System.out.println("A TV ligada! O consumo é de: " + consumo + " Watts");
    }

    void desligar() {
        System.out.println("Uma TV desligou!");
    }

    void aumentar_volume() {
        if (volume < 10) {
            volume++;
            System.out.println("O volume é: " + volume);
        } else {
            System.out.println("Volume máximo atingido!");
        }
    }

    void diminuir_volume() {
        if (volume > 1) {
            volume--;
            System.out.println("Volume: " + volume);
        } else {
            System.out.println("Volume mínimo atingido!");
        }
    }

    void subir_canal() {
        canal++;
        System.out.println("Canal atual: " + canal);
    }

    void descer_canal() {
        if (canal > 1) {
            canal--;
            System.out.println("Canal atual: " + canal);
        }
    }

    public static void main(String[] args) {
        TV minhaTV = new TV(); 
        
        minhaTV.polegada = 50;
        minhaTV.voltagem = 220;
        minhaTV.canal = 10;
        
        minhaTV.ligar();
        minhaTV.aumentar_volume();
        minhaTV.subir_canal();
        minhaTV.desligar();
    }
