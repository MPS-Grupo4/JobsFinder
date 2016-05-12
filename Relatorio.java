/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;


public abstract class Relatorio {
    public Relatorio(){
        Date d = GregorianCalendar.getInstance().getTime();
	SimpleDateFormat format = new SimpleDateFormat();
	System.out.println("Relatório gerado por: " + toString() + "\t" + format.format(d));
    }
    
}
