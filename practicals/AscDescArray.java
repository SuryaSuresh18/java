public class AscDescArray
{
    public static void main(String[] args)
    {
    	int a[]={60,34,3,2,90};//array declaration
    	int temp = 0;    //Temporary variable
        for (int i = 0; i < a.length; i++)
         {     
            for (int j = i+1; j < a.length; j++)
            {     
               if(a[i] < a[j]) //Compare and swap
               {    
                   temp = a[i];    
                   a[i] = a[j];    
                   a[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
            
        //Displaying elements  after sorting    
        System.out.println("Elements of array sorted in descending order: ");    
        for (int i = 0; i < a.length; i++) 
        {     
            System.out.print(a[i] + " ");    
        }    
        // Ascending order
        for (int i = 0; i < a.length; i++)
        {     
           for (int j = i+1; j < a.length; j++)
           {     
              if(a[i] > a[j]) //Compare and swap
              {    
                  temp = a[i];    
                  a[i] = a[j];    
                  a[j] = temp;    
              }     
           }     
       }    
         
       System.out.println();    
           
       //Displaying  after sorting    
       System.out.println("Elements of array sorted in ascending order: ");    
       for (int i = 0; i < a.length; i++) 
       {     
           System.out.print(a[i] + " ");    
       }    
    }
}