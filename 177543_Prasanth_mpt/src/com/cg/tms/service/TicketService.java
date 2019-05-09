package com.cg.tms.service;

import java.util.List;

import com.cg.tms.dto.TicketCategory;
import com.cg.tms.dto.TicketCategory.TicketBean;

public interface TicketService {
	
	boolean raiseNewTicket(TicketBean ticketBean);
	List<TicketCategory>listTicketCategory();
	boolean displayInformation(TicketCategory t1);
	

}


	

