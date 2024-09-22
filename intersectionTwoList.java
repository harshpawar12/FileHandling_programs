package FileHanling;

import java.util.ArrayList;
import java.util.Arrays;

public class intersectionTwoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>a=new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		ArrayList<Integer>a1=new ArrayList<Integer>(Arrays.asList(1,2,5,6,7,4));

		a.toArray();
		a1.toArray();
		System.out.println("Intersection of That:");
		for(int i=0;i<a.size();i++)
		{
			for(int j=0;j<a1.size();j++)
			{
				if(a.get(i)==a1.get(j))
				{
					System.out.println(a.get(i));
				}
			}
		}

	}

}
