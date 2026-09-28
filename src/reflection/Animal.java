package reflection;

public class Animal extends LivingThing {

    @Override
    public void describe(){
        System.out.println("I am an animal(I can move around)");
    }
}
