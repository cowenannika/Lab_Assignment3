import java.util.*;

public class Sort_Columns{
    public Sort_Columns(){};

    ////this will return a list of col indices where col is not sorted by letter
    public List <Integer> minDeletionSize(String [] a){
        List<Integer> indices=new ArrayList<Integer>();
        int stringSize=a[0].length();
        //checking if all strings same size
        for(int c=0;c<a.length;c++){
            if(a[c].length()!=stringSize){
                indices.add(-1);
                return indices;
            }
        }
        //loop over each col
        for(int i =0;i<a[0].length()-1;i++){
            //go through each character in each col
            for(int c=0;c<a.length-1;c++){
                //compare characters
                if(a[i].charAt(c)>a[i+1].charAt(c)){
                    indices.add(i);
                    break;
                }
            }
        }
        return indices;
    }

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What number of strings is thou looking to compare, hmmmm?: ");
        int size=scanner.nextInt();
        String [] strings=new String[size];
        for(int i=0;i<size;i++){
            //lowercase so you're able to compare it
            strings[i]=scanner.next().toLowerCase();
        }

        Sort_Columns s = new Sort_Columns();
        List<Integer> list=s.minDeletionSize(strings);
        System.out.println(list);
    }
}