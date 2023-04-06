import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Deque d = new Deque();
        Scanner in = new Scanner(System.in);

        while (true){
            System.out.print("Action [012345678] -> ");
            switch (in.nextInt()){
                case 0:
                    System.out.println("Deque is " + (d.empty() ? "empty" : "not empty"));
                    break;
                case 1:
                    d.clear();
                    break;
                case 2:
                    try {
                        System.out.print("Push back int: ");
                        d.push(in.nextInt());
                    } catch (Exception e) {;}
                    break;
                case 3:
                    try {
                        System.out.print("Push front int: ");
                        d.pushFront(in.nextInt());
                    }catch (Exception e){;}
                    break;
                case 4:
                    try {
                        System.out.println("Pop front int " + d.pop());
                    }catch (Exception e) {;}
                    break;
                case 5:
                    try{
                        System.out.println("Pop back int " + d.popBack());
                    }catch (Exception e){;}
                    break;
                case 6:
                    try {
                        System.out.println("Front = " + d.front());
                    }catch (Exception e){;}
                    break;
                case 7:
                    try {
                        System.out.println("Back = " + d.back());
                    }catch (Exception e){;}
                    break;
                case 8:
                    try {
                        System.out.println("Deque size = " + d.size());
                    }catch (Exception e){;}
                    break;
                default:
                    System.out.println("Wrong action, ignore.");
            }
        }
//        Deque d = new Deque();
//        Scanner in = new Scanner(System.in);
//        try {
//            d.push(in.nextInt());
//            d.push(in.nextInt());
//            d.push(in.nextInt());
//            d.push(in.nextInt());
//            d.push(in.nextInt());
//            System.out.println(d.size());
//            System.out.println("Вывод элементов в прямом направлении");
//            for (int i = 0; i < d.size(); i++){
//                int k = d.pop();
//                System.out.println(k);
//                d.push(k);
//            }
//            System.out.println("Вывод элементов в обратном направлении");
//            for (int i = 0; i < d.size(); i++){
//                int k = d.popBack();
//                System.out.println(k);
//                d.pushFront(k);
//            }
//        }
//        catch (Exception e){
//        }
    }
}