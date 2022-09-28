package ru.javarush.murinovdmitry.project3simple;


import org.junit.jupiter.api.Test;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static org.mockito.Mockito.*;

public class FirstStepServletTest {

    @Test
    public void testPositiveScenario_livePick_leadToLiveStep() throws ServletException, IOException {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        RequestDispatcher dispatcher = mock(RequestDispatcher.class);

        when(request.getParameter("choice")).thenReturn("live");
        when(request.getRequestDispatcher("/steps/firstStepLive.jsp")).thenReturn(dispatcher);

        new FirstStepServlet().doGet(request, response);

        verify(request, atLeastOnce()).getParameter("choice");
        verify(dispatcher, atLeastOnce()).forward(request, response);
    }

    @Test
    public void testPositiveScenario_diePick_leadToDieStep() throws ServletException, IOException {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        RequestDispatcher dispatcher = mock(RequestDispatcher.class);

        when(request.getParameter("choice")).thenReturn("die");
        when(request.getRequestDispatcher("/steps/firstStepDie.jsp")).thenReturn(dispatcher);

        new FirstStepServlet().doGet(request, response);

        verify(request, atLeastOnce()).getParameter("choice");
        verify(dispatcher, atLeastOnce()).forward(request, response);
    }

}
