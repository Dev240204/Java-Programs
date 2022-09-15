public class Problem_6 {
    static void varang(String...str){
        System.out.println("Number of String passed :"+str.length);
        for(String s:str)
        System.out.println(s);
    }
    public static void main(String[] args) {
        varang("Ram","Shyam","Hari");
        varang("Ram","Shyam");
        varang("Ram");
    }
}
