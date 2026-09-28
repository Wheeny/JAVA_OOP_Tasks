package reflection;

public class Mammal extends Vertebrate {

    @Override
    public void describe(){
        System.out.println("I am a mammal(I don't have scales)");
    }
}
