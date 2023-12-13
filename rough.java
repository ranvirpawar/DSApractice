import java.util.*;

public class rough {

    public static void removeDuplicate(int arr[]) {
        // HashSet<Integer> set = new HashSet<>();
        // for (int c : arr) {
        //     set.add(c);
        // }
        // for (int c : set) {
        //     System.out.print(c + ", ");
        // }

        Arrays.sort(arr);
        int temp[] = new int[arr.length];
        int j=0;
        
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] != arr[i]){
                temp[j] = arr[i];
                j++;
            }
        }
        temp[j+1] = arr[arr.length-1];
        for(int c: temp){
            System.out.print(c);
        }

    }

    public static void main(String[] args) {
        cat c = new cat();
        c.eat();
        c.meow();
        int arr[] = { 1, 2, 3, 4, 4, 5, 2, 4, 5 };
        removeDuplicate(arr);
    }

}

class animal {
    void eat() {
        System.out.println("Eating");
    }
}

class cat extends animal {
    void meow() {
        System.out.println("Meowing");
    }
}
