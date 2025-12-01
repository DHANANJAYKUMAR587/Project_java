public class tenConditional {
    public static void main(String[] args) {
        int investment= 1000;
        int collected=10000;

        if(investment < collected){
            System.out.println("Profit");
        }
        else if (investment > collected){
            System.out.println("Loss");
        }
        else {
            System.out.println("No loss no profit");
        }
    }
}
