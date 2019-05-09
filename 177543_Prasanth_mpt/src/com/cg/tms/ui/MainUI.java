package com.cg.tms.ui;



import java.time.LocalDate;
import java.util.*;

import com.cg.tms.dto.TicketCategory;

import com.cg.tms.service.TicketService;

import com.cg.tms.service.TicketServiceImpl;


public class MainUI {

 public static void main(String[] args)
 {
 TicketService service=new TicketServiceImpl();
 TicketCategory t1=new TicketCategory("101","Ram");

           boolean added=service.displayInformation(t1);

         System.out.println("added successfully"+added);
         String tno = null,tname;
         TicketCategory tt;
          Scanner sc=new Scanner(System.in);
 
          System.out.println("Welcozme to itihelp desk");
          System.out.println("1. Raise a ticket");
          System.out.println("2. Exit");
         
        int ch = sc.nextInt();

 do {
            switch(ch)

                     {

                    case 1 : System.out.println("Raise a Ticket: ");
                            System.out.println("enter the ticket number");
                                 tno = sc.next();
                              System.out.println("enter the name");
                              tname=sc.nextLine();
                              tno = sc.next();
                              System.out.println("ticket successfully completed at"+LocalDate.now());
                              System.out.println("============================");
                                tt = new TicketCategory(tno,tname);
                               tt.printDetails();
                                tt.toString();
                           
                              
                              System.out.println("1.Software Installation");
                              System.out.println("2.Email Box");
                              System.out.println("3.Network Issue");
                                    break;

                     case 2 : System.out.println(" You are Exiting  from the system: ");
                                  System.exit(0);
                                 break;
 
                    }
                     System.out.println("select the option that list provided:");
                      System.out.println("1. Raise a ticket");
                      System.out.println("2. Exit");
                      ch = sc.nextInt();
                  } while(ch!=0);
              }
              }