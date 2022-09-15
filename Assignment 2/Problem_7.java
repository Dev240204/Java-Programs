class distance{
    int feet,inch;
    public distance(int f,int i){
        inch = i;
    }
    distance sum(distance d1){
        distance t = new distance(5,11);
        t.inch = inch + d1.inch;
        return t;
    }
    void display(){
        System.out.println("The distance is :");
    }
}
public class Problem_7{
    public static void main(String[] args) {
        distance y = new distance(7,10);
        y.display();    
    }
}