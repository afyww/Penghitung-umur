
package umur; 

public class umur {
      int umur;
    
    void setUmurnya(int pertambahanUmurnya)
    {
        umur = umur + pertambahanUmurnya;
    }
    
    int getUmur()
    {
        if (umur < 14)
        {
            System.out.println("Anak-anak");
        }
        
        else if(umur > 14 && umur <=18)
        {
            System.out.println("remaja"); 
        }
        
        else if(umur > 18 && umur <= 35)
        {
            System.out.println("dewasa");
        }
            return umur;
            
    } 
    

    
}
