package com.klef.jfsd.exam.Impl;

import com.klef.jfsd.exam.models.Device;
import com.klef.jfsd.exam.models.SmartPhone;
import com.klef.jfsd.exam.models.Tablet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Inheritance {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        // Create and insert a Device
        Device device = new Device();
        device.setBrand("Generic");
        device.setModel("ModelX");
        device.setPrice(150.00);
        session.save(device);

        // Create and insert a Smartphone
        SmartPhone smartphone = new SmartPhone();
        smartphone.setBrand("Apple");
        smartphone.setModel("iPhone 14");
        smartphone.setPrice(999.99);
        smartphone.setOperatingSystem("iOS");
        smartphone.setCameraResolution(12);
        session.save(smartphone);

        // Create and insert a Tablet
        Tablet tablet = new Tablet();
        tablet.setBrand("Samsung");
        tablet.setModel("Galaxy Tab S8");
        tablet.setPrice(699.99);
        tablet.setScreenSize(11.0);
        tablet.setBatteryLife(15);
        session.save(tablet);

        transaction.commit();
        session.close();
        sessionFactory.close();

        System.out.println("Records inserted successfully!");
    }
}
