import java.util.Scanner;

class Distance {
    public int feet , inch;
    public void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of feet and inch");
        feet = sc.nextInt();
        inch = sc.nextInt();
    }
    public void display(){
        System.out.println("Distance :"+feet+"feet "+inch+"inch'");
    }
    public void sum(Distance d3){
        Distance temp = new Distance();
        temp.feet = feet + d3.feet;
        temp.inch = inch + d3.inch;
        if(temp.inch>=12){
            temp.feet++;
            temp.inch-=12;
        }
        temp.display();
    }   
}
public class Problem_1 {
    public static void main(String[] args) {
        Distance d1 = new Distance();
        System.out.println("Enter first distance :");
        d1.getData();
        Distance d2 = new Distance();
        System.out.println("Enter Second Distance :");
        d2.getData();
        System.out.println("Total Distance :");
        d1.sum(d2);
    }
}