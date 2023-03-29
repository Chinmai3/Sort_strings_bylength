import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> al=new ArrayList<> ();
        
        //Take some strings from the user.
        while(!(sc.hasNextInt()))
        {
            al.add(sc.nextLine());
        }
        
        //sort the arraylist elements by length.
        al.sort(Comparator.comparingInt(String::length));
        
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }
    }
}
