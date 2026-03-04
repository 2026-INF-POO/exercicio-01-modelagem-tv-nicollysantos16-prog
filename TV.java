public class TV {
    int polegada;
    int volume = 5;
    String marca;
    int voltagem;
    int canal;

    void ligar() {
        int consumo = voltagem * polegada;
        System.out.println("A TV ligou! O consumo é de: " + consumo + " Watts");
    }

    void desligar() {
        System.out.println("A TV desligou!");
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
