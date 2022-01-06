
package umur;


public class umurberaksi {
    public static void main(String[]args)
    {
        umur umursaya = new umur();
        
        umursaya.setUmurnya(5);
        System.out.println("umur saya saat ini : " +umursaya.getUmur());
        System.out.println();
        
        umursaya.setUmurnya(10);
        System.out.println("umur saya saat ini : " +umursaya.getUmur());
        System.out.println();
    }            
            
    
}
