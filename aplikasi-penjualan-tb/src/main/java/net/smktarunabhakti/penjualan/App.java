package net.smktarunabhakti.penjualan;

import net.smktarunabhakti.penjualan.domain.barang;
import net.smktarunabhakti.penjualan.service.AppService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 * error mampus
 */
public class App 
{
	private static ApplicationContext appCtx;
	private static AppService appService;
	
    public static void main( String[] args )
    {
        appCtx = new ClassPathXmlApplicationContext("classpath:net/smktarunabhakti/penjualan/applicationContext.xml");
        
        appService = (AppService)
        		appCtx.getBean("appService");
        saveBarang();
    	
    }
    
    private static void saveBarang(){
    	barang b = new barang();
    	b.setKodeBarang("1");
    	b.setNamaBarang("nama");
    	
    	appService.simpanBarang(b);
    }
}
