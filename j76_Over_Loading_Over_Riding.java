public class j76_Over_Loading_Over_Riding {
    public static void main(String args[]){
        Deer golden_deer = new Deer();
        golden_deer.eats();

        Caluclator ne = new Caluclator();
        System.out.println(ne.sum( 12, 6));
        System.out.println(ne.sum( 12.5F, 6.3F));

    }
}

class Caluclator{
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a, int b,int c){ // Over loading the sum() method of Caluclator class
        return a+b+c;
    }
    float sum(float a, float b){ // Over loading the sum() method of Caluclator class
        return a+b;
    }
}

class Animal{
    void eats() {
        System.out.println("Animal eats anyting"); // initial eats() method of Animal class
    }
}
class Deer extends Animal{
    void eats(){
        System.out.println("eats grass");  // Over Riding the eats() method of Animal class
    }
}