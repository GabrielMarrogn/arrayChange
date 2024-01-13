import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arr = new ArrayList<Integer>();
        List<Integer> temp = new ArrayList<Integer>();

        for(int i = 0; i < 20; i++){
            int a = Integer.parseInt(br.readLine());
            temp.add(a);
        }

        for(int i = 19; i >= 0; i--){
            arr.add(temp.get(i));
        }
        
        for(int k = 0; k < 20; k++) {
            System.out.println("N[" +k +"] = " +arr.get(k));
        }
    }
}
