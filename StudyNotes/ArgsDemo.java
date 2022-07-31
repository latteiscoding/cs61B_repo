public class ArgsDemo{
    public static void main(String[] args){
        int sum = 0;
        for (int i = 0; i < args.length; i ++){
            sum = sum + args[i];
        }
        System.out.println();
    }
}