package worldwar;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello worldwar");
		
		Customer c = new Customer();
		c.setC_Id("C02");
		c.setCname("Davidoff");
		//c.setPhn(9191919191);
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Customer.class);
		
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		
		SessionFactory sf = con.buildSessionFactory(sr);
		
		Session s = sf.openSession();
		
		Transaction tx = s.beginTransaction();
		//tx.begin();
		s.save(c);
		tx.commit();
		}
	// end of file

}
