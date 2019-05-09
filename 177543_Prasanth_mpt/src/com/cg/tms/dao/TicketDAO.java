package com.cg.tms.dao;

import java.util.List;

import com.cg.tms.dto.TicketCategory;
import com.cg.tms.dto.TicketCategory.TicketBean;

public interface TicketDAO {
	
	boolean raiseNewTicket(TicketBean ticketBean);
	List<TicketCategory>listTicketCategory();

}
