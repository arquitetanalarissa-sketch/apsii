package simuduck; // Mantenha a linha de pacote que você definiu

public class MiniDuckSimulator {

    public static void main(String[] args) {
        // Testando MallardDuck
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("---");

        // Testando ModelDuck e a mudança dinâmica de comportamento
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

}