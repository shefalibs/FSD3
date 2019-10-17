package com.mycompany.inheritance_account;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AccountTest {
	public static void main(String[] args) {
		try {
			SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Account.class)
					.addAnnotatedClass(CurrentAccount.class)
					.addAnnotatedClass(SavingsAccount.class).buildSessionFactory();
			Session session = factory.openSession();
			Account ac = new Account(101, "Shefali B S",20000);
			CurrentAccount ca = new CurrentAccount(102, "Sreejitha N", 10000, 500);
			SavingsAccount sa = new SavingsAccount(103, "Swarna Acharya", 500, 20000);
		session.getTransaction().begin();
			session.save(ac);
			session.save(ca);
			session.save(sa);
			session.getTransaction().commit();
			System.out.println("ok..");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}