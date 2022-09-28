package ru.javarush.murinovdmitry.project3simple;


import org.junit.jupiter.api.Test;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static org.mockito.Mockito.*;

public class ThirdStepServletTest {

    @Test
    public void testPositiveScenario_stayPick_leadToStayStep() throws ServletException, IOException {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        RequestDispatcher dispatcher = mock(RequestDispatcher.class);

        when(request.getParameter("choice")).thenReturn("stay");
        when(request.getRequestDispatcher("/steps/thirdStepStay.jsp")).thenReturn(dispatcher);

        new ThirdStepServlet().doGet(request, response);

        verify(request, atLeastOnce()).getParameter("choice");
        verify(dispatcher, atLeastOnce()).forward(request, response);
    }
    
    @Test
    public void testPositiveScenario_travelPick_leadToTravelStep() throws ServletException, IOException {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        RequestDispatcher dispatcher = mock(RequestDispatcher.class);

        when(request.getParameter("choice")).thenReturn("travel");
        when(request.getRequestDispatcher("/steps/thirdStepTravel.jsp")).thenReturn(dispatcher);

        new ThirdStepServlet().doGet(request, response);

        verify(request, atLeastOnce()).getParameter("choice");
        verify(dispatcher, atLeastOnce()).forward(request, response);
    }

}
