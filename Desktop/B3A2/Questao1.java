import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Questao1 {

    public static void main(String args[]) throws IOException {

        FileInputStream entrada = new FileInputStream("C:/user/gabriela/Desktop/B3A2/questao1.txt");
        InputStreamReader text = new InputStreamReader(entrada);
        BufferedReader ler = new BufferedReader(text);
        String nome = ler.readLine();
        String l1 = ler.readLine();
        String l2 = ler.readLine();
        float altura = Float.parseFloat(l1);
        int data = Integer.parseInt(l2);
        Pessoa pessoa = new Pessoa(nome, data, altura);
        System.out.printf("Nome:");
        System.out.println(pessoa.getNome());
        System.out.printf("Idade calculada:");
        System.out.println(pessoa.getData());
        System.out.printf("Altura:");
        System.out.println(pessoa.getTamanho());
    }
}