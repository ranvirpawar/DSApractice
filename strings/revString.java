package strings;

public class revString {

    static String revStr(String s){
        // String str = "";

        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1; i>=0;i--){
            sb.append(s.charAt(i)) ;

        }
        return sb.toString();
    }

for(last to first){
str += s.charAt(i)
}

    public static void main(String[] args) {
        String str = " RANVIR";
        int i = 0;
        int j = str.length() - 1;
        char[] arr = new char[j+1];
        while (i <= j) {
            arr[j] = str.charAt(i);
            arr[i] = str.charAt(j);
            i++;
            j--;
        }
        //System.out.println(String.valueOf(arr));
        System.out.println(revStr(str));
    }
}
