package Exercicio4;

import java.util.ArrayList;
import java.util.List;

public class GerenteDeFiguras {
    private List<FiguraGeometrica> figuras;

    public GerenteDeFiguras() {
        this.figuras = new ArrayList<FiguraGeometrica>();
    }

    public void adicionaFigura(FiguraGeometrica fig) {
        this.figuras.add(fig);
    }

    public List<FiguraGeometrica> getFiguras() {
        return this.figuras;
    }

    public void imprimeFiguras() {
        for (FiguraGeometrica fig : figuras) {
            System.out.println(fig.getNomeFigura());
        }
    }

    public double getMaiorAreaDeFigura() {
        if (figuras.isEmpty()) {
            return 0.0;
        }
        double maiorArea = figuras.get(0).calculaArea();
        for (FiguraGeometrica fig : figuras) {
            double areaAtual = fig.calculaArea();
            if (areaAtual > maiorArea) {
                maiorArea = areaAtual;
            }
        }
        return maiorArea;
    }

    public double calculaAreaTotalDeFiguras() {
        double areaTotal = 0.0;
        for (FiguraGeometrica fig : figuras) {
            areaTotal += fig.calculaArea();
        }
        return areaTotal;
    }
}