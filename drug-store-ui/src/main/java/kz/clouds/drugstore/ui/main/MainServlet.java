package kz.clouds.drugstore.ui.main;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;

@WebServlet(value = "/*", asyncSupported = true)
@VaadinServletConfiguration(heartbeatInterval=300, productionMode = false, ui = MainApplication.class)
public class MainServlet extends VaadinServlet {
}