
package vezbe10radsafajlovima;


public class Radnik { 
    
    private String ime; 
    private long jmbg; 
    private int staz; 
    private double plata; 

    public Radnik(String ime, long jmbg, int staz, double plata) {
        this.ime = ime;
        this.jmbg = jmbg;
        this.staz = staz;
        this.plata = plata;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public long getJmbg() {
        return jmbg;
    }

    public void setJmbg(long jmbg) {
        this.jmbg = jmbg;
    }

    public int getStaz() {
        return staz;
    }

    public void setStaz(int staz) {
        this.staz = staz;
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }
    
    public void povecajPlatu(double procenat){
        plata += plata*procenat / 100;
    
    } 
    
    @Override
    public String toString(){
        return ime + " " + staz + " " + plata;
    
    }
    
}
