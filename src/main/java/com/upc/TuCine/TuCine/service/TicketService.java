package com.upc.TuCine.TuCine.service;

import com.upc.TuCine.TuCine.dto.TicketDto;
import com.upc.TuCine.TuCine.dto.save.Ticket.TicketSaveDto;

import java.util.List;

public interface TicketService {

    List<TicketDto> getAllTickets();
    List<TicketDto> getAllTicketsByUserId(Integer UserId);
    TicketDto getTicketById(Integer id);
    TicketDto createTicket(TicketSaveDto ticketSaveDto);

    TicketDto updateTicket(Integer id, TicketSaveDto ticketSaveDto);

    TicketDto deleteTicket(Integer id);



}
