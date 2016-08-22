import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int n=0,p=0,neg=0,pos=0;
		
		int range = sc.nextInt();
		int[] array = new int[range];
		int[] out = new int[range];
		
		for(int i=0;i<range;i++){
		    array[i] = sc.nextInt();
		}
		
		Arrays.sort(array);
		
		for(int i=0;i<range;i++){
		    if(array[i] >=0)
		      pos++;
		    if(array[i]<0)
		        neg++;
		}
		
		int[] negarr = new int[neg];
		int[] posarr = new int[pos];
		
		for(int i=0;i<range;i++){
		    if(array[i] >=0)
		      posarr[p++] = array[i];
		    if(array[i]<0)
		        negarr[n++] = array[i];
		}
		
		out = mergePosNeg(negarr,posarr);
		for(int i=0;i<range;i++){
		    System.out.println(out[i]);
		}
	}
	
	public static int[] mergePosNeg(int[] n,int[] p){
	    
	    int size = n.length + p.length;
	    int[] output = new int[size];
	    int i=0,ind=0,j;
	    j = n.length-1;
	    
	    while(j!=-1 && i<p.length){
	        output[ind++] = p[i++];
	        output[ind++] = n[j--];
	    }
	    
	    while(j!=-1){
	        output[ind++] = n[j--];
	    }
	    
	    while(i<p.length){
	        output[ind++] = p[i++];
	    }
	    return output;
	}
}
