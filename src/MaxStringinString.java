import java.util.LinkedList;
import java.util.Scanner;

public class MaxStringinString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        System.out.println("Enter you string: ");
        String string = sc.nextLine();
        for(int i=0; i<string.length(); i++){
            if(list.size()>1 && string.charAt(i)<= list.getLast() && list.contains(string.charAt(i))){
                list.clear();
            }
            list.add(string.charAt(i));
            if (list.size()>max.size()){
                max.clear();
                max.addAll(list);
            }
        }

        for (Character x: max) System.out.print(x);
        System.out.println();
    }
}
/* 1 single loop * 3 simple statements = 3;                                      *
 * 	1 single loop * 1 simple statement = 1;
 T(n)  = O(n) Linear Time!
 */
