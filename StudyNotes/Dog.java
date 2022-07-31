public class Dog{
    public int weightinPounds;
    public static String breed = "Border Collie"; /* Static variables help explaining that all dogs are border collie.*/
    /* Constructor*/
    public Dog(int startingWeights){
        weightinPounds = startingWeights;
    }
    /* Non-static method a.k.a Instance Method */
    public void makeNoise(){
        if (weightinPounds < 10){
            System.out.println("yipyipyip!");
        } else if (weightinPounds < 30){
            System.out.println("bark! bark!");
        } else {
            System.out.println("woof!");
        }
    }
    public static Dog maxDog(Dog d1, Dog d2){
        if (d1.weightinPounds > d2.weightinPounds){
            return d1;
        } else {
            return d2;
        }
    }
    public Dog maxDog(Dog d2){
        if (this.weightinPounds < d2.weightinPounds){
            return d2;
        } else {
            return this;
        }
    }
}





