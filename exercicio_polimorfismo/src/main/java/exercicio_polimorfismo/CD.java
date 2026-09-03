package exercicio_polimorfismo;

public class CD extends Produto implements InfoGerais {
    private int numFaixas;

    // Getters e Setters
    public int getNumFaixas() {
        return numFaixas;
    }

    public void setNumFaixas(int numFaixas) {
        this.numFaixas = numFaixas;
    }

    // Método da interface InfoGerais
    @Override
    public void exibeInformacoes() {
        System.out.println("\n--- Informações do CD ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Número de Faixas: " + getNumFaixas());
    }
}