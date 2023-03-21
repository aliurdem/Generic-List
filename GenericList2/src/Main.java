import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        MyList<Integer> liste = new MyList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(50);
        System.out.println("2. indisteki değer : " + liste.get(2));
        MyList<Integer> sublist = liste.sublist(0,2);
        System.out.println("Verilen indexler arası oluşturulan subliste : "+sublist.toString());
        liste.set(0, 100);
        System.out.println("2. indisteki değer : " + liste.get(2));
        System.out.println("40 değerinin idenxi : " + liste.indexOf(40));
        System.out.println(liste.toString());
        MyList<Integer> sublist2 = liste.sublist(1,2);
        System.out.println("Verilen indexler arası oluşturulan subliste : "+sublist2.toString());
        System.out.println("Liste boş kontrol : " + liste.isEmpty());
        liste.clear();
        System.out.println("Liste size " + liste.size());
        System.out.println("Liste boş kontrol : " + liste.isEmpty());


    }
}