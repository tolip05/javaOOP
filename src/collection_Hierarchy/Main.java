package collection_Hierarchy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        AddCollection<String>addColection = new AddCollectionImpl<>();

        AddRemoveCollection<String>addRemooveCollection = new AddRemoveCollectionImpl<>();

        MyList<String>myList = new MyListImpl<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] tokens = br.readLine().split(" ");
        int countOfRemoveElement = Integer.parseInt(br.readLine());

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        StringBuilder sb5 = new StringBuilder();

        for (int i = 0; i < tokens.length ; i++) {
            sb1.append(addColection.add(tokens[i])).append(" ");
            sb2.append(addRemooveCollection.add(tokens[i])).append(" ");
            sb3.append(myList.add(tokens[i])).append(" ");
            if (countOfRemoveElement -- > 0){
                sb4.append(addRemooveCollection.remove()).append(" ");


            }
        }
        System.out.println(sb1.toString().trim());
        System.out.println(sb2.toString().trim());
        System.out.println(sb3.toString().trim());
        System.out.println(sb4.toString().trim());
        System.out.println(sb5.toString().trim());

    }
}
