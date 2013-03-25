package mirasalma;
public class ogretmen extends kisi {
    
    private String sicilno;
    private String bolum;
    public String getsicilno() {
	return sicilno;
	}
    public void setsicilno(String sicilno) {
	this.sicilno = sicilno;
	}
    public String getbolum() {
	return bolum;
	}
    public void setbolum(String bolum) {
	this.bolum= bolum;
	}
    public void ders(){
	System.out.println("hoca derste");
	}
    public void sinav(){
	System.out.println("hoca sinav yapiyo");
	}
    public String ogretmenbilgisi(){
        //super.kisibilgisi();
	    return " sicilno "+sicilno+"\nbolum: "+bolum+" "+super.kisibilgisi();
        
	}

    
    
}
