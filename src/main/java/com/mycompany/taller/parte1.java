/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.taller;

/**
 *
 * @author 2112712
 */
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class parte1 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.google.com/");
        System.out.println("getProtocol :"+url.getProtocol());
        System.out.println("getAuthority :"+url.getAuthority());
        System.out.println("getHost :"+url.getHost());
        System.out.println("getPath :"+url.getPath());
        System.out.println("getQuery :"+url.getQuery());
        System.out.println("getFile :"+url.getFile());
        System.out.println("getRef :"+url.getRef());
    }

}

   
    

