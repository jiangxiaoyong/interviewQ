import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Remove {

    public int removeElement(int[] A, int elem) {
        
        List<Integer> arraylist = new ArrayList<Integer>(A.length);
        for(int i: A){
        	arraylist.add(i);
        }

        Iterator<Integer> iter = arraylist.iterator();
        while(iter.hasNext()){
        	int i = iter.next();
        	if(i == elem){
        		iter.remove();
        	}
        }
                
        for(int i : arraylist){
        	System.out.println(i);
        }
        
        return arraylist.size();
    }
	
	public static void main(String[] args){
		int [] array = new int[]{4,5};
		
		Remove remove = new Remove();
		int size = remove.removeElement(array, 4);
		System.out.println(size);
	}
}
