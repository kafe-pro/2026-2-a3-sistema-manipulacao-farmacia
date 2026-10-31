import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> cadastrosSubstanciaNome = new ArrayList<>();
        ArrayList<Double> cadastroSubstanciaQuantidade = new ArrayList<>();
        ArrayList<Double> cadastroSubstanciaPrecoMin = new ArrayList<>();
        ArrayList<Integer> cadastroSubstanciaPorcentagemLucro = new ArrayList<>();

        int tempQuantidadecapsulas = 0;
        int tempEscolhaSubstancia = 0;
        int tempContador = 1;
        int tempConta = 0;

        cadastrosSubstanciaNome.addAll(Arrays.asList("Paracetamol", "Dipirona", "Dexametasona", "Ibuprofeno", "Amoxicilina"));

        cadastroSubstanciaQuantidade.addAll(Arrays.asList(1000.0, 500.0, 200.0, 300.0, 400.0 ));

        cadastroSubstanciaPrecoMin.addAll(Arrays.asList(10.0, 15.0, 20.0, 25.0, 30.0 ));

        cadastroSubstanciaPorcentagemLucro.addAll(Arrays.asList(400, 300, 200, 100, 50));

        System.out.println("Digite a quantidade de capsulas que deseja cotar: ");
        tempQuantidadecapsulas = sc.nextInt();

        for (String i : cadastrosSubstanciaNome) {
            System.out.println("[" + tempContador + "] " + i);
            tempContador++;
        }

        System.out.println("Escolha a Substância: ");
        tempEscolhaSubstancia = sc.nextInt();

        System.out.println("O valor total da substancia escolhida é de: " + (cadastroSubstanciaPrecoMin.get(tempEscolhaSubstancia - 1) * (cadastroSubstanciaPorcentagemLucro.get(tempEscolhaSubstancia - 1) / 100.0) * tempQuantidadecapsulas) + " R$");

    }
}