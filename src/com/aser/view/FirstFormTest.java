package com.aser.view;

import com.sun.corba.se.impl.protocol.giopmsgheaders.FragmentMessage;

import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.awt.*;

public class FirstFormTest{
        public static void main(String[] args){
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    FirstFrom frame = new FirstFrom();
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    Toolkit toolkit = Toolkit.getDefaultToolkit();
                    Dimension screenSize = toolkit.getScreenSize();
                    int w = screenSize.width;
                    int h =screenSize.height;
                    frame.setLocation(0,0);
                    frame.setSize(w / 2, h / 2);
                    frame.setLocationByPlatform(true);
                    Image img = new ImageIcon("C:\\Users\\pzhang.HKI\\OneDrive\\Java\\Icon\\java\\light1.png").getImage();
                    frame.setIconImage(img);
                    frame.setTitle("Frame instance");
                    frame.setResizable(false);
                    frame.setVisible(true);
                }
            });
            System.out.println("Done");
        }
        }
