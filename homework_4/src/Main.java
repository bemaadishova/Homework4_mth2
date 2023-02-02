import java.util.*;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
             System.out.println("Введите 5 имен");
            ArrayList<String> A = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                A.add(scanner.nextLine());
            }
            System.out.println("List A: " + A);


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 5 имен");
        ArrayList<String> B = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            B.add(sc.nextLine());
        }
        System.out.println("List B: " + B);

        ArrayList<String> C = new ArrayList<>();
        C.add(A.get(0));
        C.add(B.get(4));
        C.add(A.get(1));
        C.add(B.get(3));
        C.add(A.get(2));
        C.add(B.get(2));
        C.add(A.get(3));
        C.add(B.get(1));
        C.add(A.get(4));
        C.add(B.get(0));

        System.out.println("List C: " + C);

        Collections.sort(C, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()){
                    return 1;
                }else {
                    return o1.compareTo(o2);
                }

            }
        });

        System.out.println(C);





    }
    }




