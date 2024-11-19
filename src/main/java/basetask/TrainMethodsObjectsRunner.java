package main.java.basetask;

public class TrainMethodsObjectsRunner {
    public static void main(String[] args) {
        TrainMethodsObjects trainMethodsObjects = new TrainMethodsObjects();

        trainMethodsObjects.processMouse(new Mouse("Полёвка", 2));
        trainMethodsObjects.processSouce(new Souce("кетчуп", "красный"));
        trainMethodsObjects.processBee(new Bee("трутень", 2));
        trainMethodsObjects.processObstacle(new Obstacle("объем работы", "высокий"));
        trainMethodsObjects.processPineapple(new Pineapple("отборный", 2.02));
    }
}