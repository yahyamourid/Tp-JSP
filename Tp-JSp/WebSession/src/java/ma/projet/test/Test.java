/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ma.projet.test;



import ma.projet.entities.Client;
import ma.projet.entities.Employe;
import ma.projet.entities.User;
import ma.projet.service.ClientService;
import ma.projet.service.EmployeService;
import ma.projet.service.UserService;
import ma.projet.util.HibernateUtil;
import ma.projet.util.Utils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author YahyaMrd
 */
public class Test {
    public static void main(String[] args) {
//         HibernateUtil.getSessionFactory();
//        EmployeService es = new EmployeService();
//        UserService us = new UserService();
////        es.create(new Employe("mouridyahya580@gmail.com","1234"));
ClientService cs = new ClientService();
Client client = cs.getByEmail("mouridyahya180@gmail.com");
client.setPassword("1234");
cs.update(client);
//        System.out.println(client.getPassword());
        
    
    }
    

}
