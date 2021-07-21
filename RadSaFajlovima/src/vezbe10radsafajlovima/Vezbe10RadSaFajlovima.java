
package vezbe10radsafajlovima; 

import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.IOException; 
import java.util.Scanner; 
import java.util.ArrayList;


public class Vezbe10RadSaFajlovima {

 
    public static void main(String[] args) {  
        
        try{ 
            
            FileInputStream fis = new FileInputStream("ulaz.txt"); 
            Scanner s = new Scanner(fis); 
            ArrayList<Radnik> lista  = new ArrayList<>();
            
            while(s.hasNext()){
                String ime = s.nextLine().trim(); 
                long jmbg = s.nextLong();  
                int staz = s.nextInt();
                double plata = s.nextDouble();  
                s.nextLine(); 
                
                lista.add(new Radnik(ime, jmbg, staz, plata));
                
            
            } 
            System.out.println("Lista radnika " + lista);
            s.close(); 
            fis.close();
        
        
        }catch(FileNotFoundException e){
            e.printStackTrace(); 
            System.out.println("Greska u citanju iz fajla");
        
        }catch (IOException e){
            e.printStackTrace(); 
            System.out.println("Greska u citanju iz fajla");
        }
        
        
        
    }
    
}
