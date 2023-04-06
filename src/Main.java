import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deque d = new Deque();
        Scanner in = new Scanner(System.in);
        try {
            d.push(in.nextInt());
            d.push(in.nextInt());
            d.push(in.nextInt());
            d.push(in.nextInt());
            d.push(in.nextInt());
            System.out.println(d.size());
            System.out.println("Вывод элементов в прямом направлении");
            for (int i = 0; i < d.size(); i++){
                int k = d.pop();
                System.out.println(k);
                d.push(k);
            }
            System.out.println("Вывод элементов в обратном направлении");
            for (int i = 0; i < d.size(); i++){
                int k = d.popBack();
                System.out.println(k);
                d.pushFront(k);
            }
        }
        catch (Exception e){
        }
    }
}