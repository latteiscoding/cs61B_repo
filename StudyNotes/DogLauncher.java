public class DogLauncher {
    public static void main(String[] args){
        Dog Bigdog = new Dog(20);
        Dog Smalldog = new Dog(5);
        Dog Bigger = Bigdog.maxDog(Smalldog);
        Bigger.makeNoise();
    }
}