package com.andriiiiiko.database.services;

import com.andriiiiiko.database.dao.TicketDao;
import com.andriiiiiko.database.entities.Ticket;

public class TicketService {

    private TicketDao ticketDao = new TicketDao();

    public void saveTicket(Ticket ticket) {
        ticketDao.save(ticket);
    }

    public Ticket findTicketById(Long id) {
        return ticketDao.findById(id);
    }

    public void updateTicket(Ticket ticket) {
        ticketDao.update(ticket);
    }

    public void deleteTicket(Ticket ticket) {
        ticketDao.delete(ticket);
    }
}
