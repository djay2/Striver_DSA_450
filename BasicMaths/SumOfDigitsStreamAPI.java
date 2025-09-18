class Main {

    public static void main(String[] args) {
    
    int sum=String.valueOf(Math.abs(19828)).chars().map(c-> c-'0').sum();
    System.out.println(sum); 

    }
}