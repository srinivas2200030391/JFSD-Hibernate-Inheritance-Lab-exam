//package com.klef.jfsd.exam.Impl;
//
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//public class InheritanceDemo {
//    public static void main(String[] args) throws Exception {
//        Configuration cfg = new Configuration();
//        cfg.configure("hibernate.cfg.xml");
//        SessionFactory sf = cfg.buildSessionFactory();
//        Session s = sf.openSession();
//        Transaction t = s.beginTransaction();
//
//        Book b = new Book();
//
//        DVD d = new DVD();
//        d.setItemId(2);
//        d.setTitle("Java");
//        d.setDirector("James");
//        d.setRegionCode("1234");
//        d.setClstype("DVD");
//
//        s.save(b);
//        s.save(d);
//
//        t.commit();
//    }
//}
