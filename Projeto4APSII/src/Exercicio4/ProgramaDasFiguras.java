package Exercicio4;

public class ProgramaDasFiguras {
    public static void main(String[] args) {
        GerenteDeFiguras gerente = new GerenteDeFiguras();

        Triangulo t1 = new Triangulo(2.0, 3.0);
        gerente.adicionaFigura(t1);

        // a) Adiciona mais dois losangos ao gerente
        Losango l1 = new Losango(4.0, 5.0);
        Losango l2 = new Losango(6.0, 2.0);
        
        gerente.adicionaFigura(l1);
        gerente.adicionaFigura(l2);

        // b) Imprime todas as figuras cadastradas
        System.out.println("--- Figuras Cadastradas ---");
        gerente.imprimeFiguras();

        // c) Calcula e imprime a área total de todas as figuras
        System.out.println("\n--- Área Total ---");
        double areaTotal = gerente.calculaAreaTotalDeFiguras();
        System.out.println("Área total de todas as figuras: " + areaTotal);
    }
}