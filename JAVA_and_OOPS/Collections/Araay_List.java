import java.util.ArrayList;
import java.util.List;

                    /*Collection -----------> Itertable
                      ^
                      |
                      |
                     List
                      ^
                      |
                      |
          ArrayList|Vector|LinkedList
                     */

public class Araay_List {
    public static void main(String[] args) {
        //Size() is a method specified in java.util.Collection.
        //length is a field on any array.
        //length() is mthod on java.lang. string
        //We can say that the Size() is not used for constants and length is used for constant.
//        int[] a=new int[5];
//        System.out.println(a.length);
//        List<Integer> list=new ArrayList<Integer>();
//        ArrayList<Integer> lis=new ArrayList<>();
//        List<Integer> ll=new ArrayList<Integer>(10);


        //
        int n=3;
        List<List<Integer>> vis=new ArrayList<>();

        for(int j=0;j<n;j++)
        {
            List<Integer> row1 = new ArrayList<>();
            for(int k=0;k<n;k++)
            {
                row1.add(0);
            }
            vis.add(row1);

        }

        //System.out.println(vis.get(0).size());


        for(int j=0;j<n;j++)
        {
            for(int k=0;k<n;k++)
            {
                vis.get(j).set(k,1);
                System.out.print(vis.get(j).get(k) );
                System.out.print(" ");
            }
            System.out.println();

        }


    }
}
