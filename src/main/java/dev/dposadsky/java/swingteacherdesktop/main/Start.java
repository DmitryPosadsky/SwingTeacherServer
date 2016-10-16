/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.dposadsky.java.swingteacherdesktop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;
import java.sql.SQLException;


/**
 *
 * @author DPosadsky
 */
public class Start {
    public static void main(String[] args) throws SQLException {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

            }
        }); 
    }
}
