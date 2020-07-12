/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author anir2070
 */
public class J12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        J12 j12 = new J12();
       // j12.moveZeroAtEnd();
      //  j12.removeduplicates();
      // j12.getfrequency();
       j12.getmaxandsecmax();
        
    }
    
    public void moveZeroAtEnd()
    {
        int[] ar = {1,2,0,3,4,0,5,6,0,7,8,0,9};
        
        ArrayList<Integer> anum = new ArrayList<Integer>();
        ArrayList<Integer> azero = new ArrayList<Integer>();
        
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==0)
            {
                azero.add(ar[i]);
            }
            else
            {
                anum.add(ar[i]);
            }
        }
        
        System.out.println(anum);
        System.out.println(azero);
        
        anum.addAll(azero);
        System.out.println(anum);
    }
    
    public void removeduplicates()
    {
        int[] ar = {1,2,1,3,4,2,5,6,3,7,8,1,4};
        
        ArrayList<Integer> anum = new ArrayList<Integer>();
         for(int i=0;i<ar.length;i++)
        {
            if(!anum.contains(ar[i]))
            {
           
                anum.add(ar[i]);
            }
        }
         System.out.println("ArrayList");
         System.out.println(anum);
         
         HashSet<Integer> hs =new HashSet<Integer>();
          for(int i=0;i<ar.length;i++)
        {
          hs.add(ar[i]);
        }
         System.out.println("Hash Set");
          System.out.println(hs);
    }
    
    public void getfrequency()
    {
        String a ="I love my india but may move out if I get the chance";
        HashMap<String,Integer> hm= new HashMap<String,Integer>();
        
        String[] a1 = a.split("");
        
        for(int i=0;i<a1.length;i++)
        {
            if(!a1[i].equals(" "))
            {
            if(hm.containsKey(a1[i]))
            {
                hm.put(a1[i],hm.get(a1[i])+1);
            }
            else
            {
                hm.put(a1[i],1);
            }
            }
        }
        
        System.out.println(hm);
    }
    
    public void getmaxandsecmax()
    {
        String a ="I love my india but may move out if I get the chance";
        
        char[] a1 = a.toCharArray();
        
        int[] AFreq = new int[a1.length];
               
        for(int i=0;i<a1.length;i++)
        {
            AFreq[i]=1;
            for(int j=i+1;j<a1.length;j++)
            {
                if((a1[i]==a1[j])&& a1[j]!='}' && a1[j]!=' ')
                {
                    AFreq[i]++;
                    a1[j]='}';
                }  
            }   
        }
        
        for(int i=0;i<a1.length;i++)
        {
            if(a1[i]!='}' && a1[i]!=' ')
            {
            System.out.print(a1[i]+" occurs "+AFreq[i]);
            System.out.println("");
            }
        }
        
        int max = Integer.MIN_VALUE,maxindex=0,min =Integer.MAX_VALUE,minindex=0;
        int secmax = Integer.MIN_VALUE,secmaxindex=0,secmin =Integer.MAX_VALUE,secminindex=0;
        
        for(int i=0;i<a1.length;i++)
        {
            if(a1[i]!=' ')
            {
            if(max<AFreq[i])
            {
                max=AFreq[i];
                maxindex=i;
            }
            
            if(AFreq[i]<max && AFreq[i]>secmax)
                    {
                        secmax=AFreq[i];
                        secmaxindex=i;
                    }
            
            if(min>AFreq[i])
            {
                min=AFreq[i];
                minindex=i;
            }
            
            if(AFreq[i]>min && AFreq[i]<secmin)
                    {
                        secmin=AFreq[i];
                        secminindex=i;
                    }
            
            
            } 
        }
        
        System.out.println(a1[maxindex]+" occurs maximum times ("+max+")");
        System.out.println(a1[minindex]+" occurs minimum times ("+min+")");
        
        System.out.println(a1[secmaxindex]+" occurs second maximum times ("+secmax+")");
        System.out.println(a1[secminindex]+" occurs second minimum times ("+secmin+")");
        
    }
    
}
