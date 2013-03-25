package ilkservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import mirasalma.memur;
import mirasalma.ogrenci;
import mirasalma.ogretmen;
import mirasalma.ogrgorevlisi;

@WebServlet("/selam")
public class selam extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ogrenci ogrn = new ogrenci();
	ogretmen ogrt = new ogretmen();
	memur mmr =new memur();
	ogrgorevlisi og = new ogrgorevlisi();
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selam() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getCharacterEncoding();
		ogrn.setTcno(10060275);
		ogrn.setAd("adem");
		ogrn.setmemleket("corum");
		ogrn.setbolum("bilgisayar muh");
		ogrn.setDt(1991);
		ogrt.setAd("ismail");
		ogrt.setbolum("bilgisayar muh");
		ogrt.setsicilno("597");
		ogrt.setDt(1980);
	    ogrt.setTcno(10060210);
        og.setAd("recai");
        og.setTcno(10060260);
        og.setDt(1982);
	    og.setalan("ozgur yazilim ");
	    og.setsicilno("4098");
	    og.setbolum("bilgisayar muh");
        mmr.setAd("cengiz");
	    mmr.setDt(1989);
	    mmr.setGorev("yazici");
	    mmr.setTcno(456882);
		PrintWriter out=response.getWriter();
		response.getCharacterEncoding();
		out.println
		("<!DOCTYPE html>\n" +
		"<html>\n" +
		        "<head><title>A Test Servlet</title></head>\n" +
		        "<body bgcolor=\"#fdf5e6\">\n" +
		        "<h1> Bilgiler </h1>\n" +
		        "<p> <b>ogrenci bilgileri </b></p>\n" +
				"</body></html>");
		        out.println(ogrn.ogrencibilgisi() +
		        "<p> <br> <b>ogretmen bilgileri</b> </br> </p>\n" +
				ogrt.ogretmenbilgisi()+
				"<p> <br> <b>ogretim gorevlisi bilgileri</b> </br> </p>\n" +
				og.ogrtgrvbilgisi()+
				"<p> <br> <b>memur bilgileri</b> </br> </p>\n" +
				mmr.memurbilgisi());
				
				
				
				
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
