import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Questao3 {
    public static void main(String args[]) throws IOException {
        FileInputStream entrada = new FileInputStream("C:/user/gabriela/Desktop/B3A2/questao3.txt");
        InputStreamReader text = new InputStreamReader(entrada);
        BufferedReader ler = new BufferedReader(text);
        String modelo = ler.readLine();
        String placa = ler.readLine();
        String linha1 = ler.readLine();
        String linha2 = ler.readLine();
        float entradahora = Float.parseFloat(linha1);
        float saida = Float.parseFloat(linha2);
        Estacionamento estacionamento = new Estacionamento(modelo, placa, entradahora, saida);
        System.out.printf("Modelo do veículo:");
        System.out.println(estacionamento.getNome());
        System.out.printf("Placa:");
        System.out.println(estacionamento.getPlaca());
        System.out.printf("Entrada:");
        System.out.println(estacionamento.getEntrada());
        System.out.printf("Saida:");
        System.out.println(estacionamento.getSaida());
        System.out.printf("Valor à pagar:");
        System.out.println(estacionamento.CalculaPreco() / 100);
    }
}