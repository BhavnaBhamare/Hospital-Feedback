package com.model;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.pojo.Patient;

public class BLManager {
	SessionFactory con = new Configuration().configure().buildSessionFactory();

	
	public void savedata(Patient p) {
		
		Session s1 = con.openSession();
		Transaction t1 = s1.beginTransaction();
		s1.save(p);
		t1.commit();
		s1.close();
	}


}
