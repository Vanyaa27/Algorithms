import java.util.* ;
import java.io.*; 
public class Solution
{
	public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
	{
		ArrayList<Integer> dup = new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			if(arr2.contains(arr1.get(i))){
				dup.add(arr1.get(i));
				arr2.remove(arr1.get(i));
			}
		}
		return dup;
	}
}
