class Main {

    public static void main(String[] args) {
    
    long count=String.valueOf(Math.abs(200000)).chars()
    .filter(Character::isDigit).count();
    System.out.println(count); 

    }
}