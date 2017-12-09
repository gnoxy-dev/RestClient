/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gnoxy.restclient;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

/**
 *
 * @author gnoxy
 */
public class App {

    public static void main(String args[]) {
        String ServiceURL = "http://origin-master.maher.home/RestServer/rest/services/";
//        String ServiceURL = "http://u_dev:8080/RestServer/rest/services/";

        System.out.println("Targetting: " + ServiceURL);

        Client client = ClientBuilder.newClient();

        String helloWorldString = client.target(ServiceURL + "helloWorld") // connection to the pre-defined URL
                .request("text/html") 
//                .request()
                .get(String.class);

        System.out.println("helloWorld response: " + helloWorldString);

        List<String> helloJSONString = client.target(ServiceURL + "helloJSON") // connection to the pre-defined URL
                .request()
                .get(ArrayList.class);
        System.out.println("helloJSON response:");
        for (int i=0; i < helloJSONString.size(); i++) {
            System.out.println("   " + helloJSONString.get(i));
        }
    }

}
