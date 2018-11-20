package edu.eci.pdsw.guice;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;

import com.google.inject.Guice;
import com.google.inject.Injector;
import edu.eci.pdsw.persistence.IntentionDAO;

import edu.eci.pdsw.persistence.UserDAO;
import edu.eci.pdsw.persistence.mybatisimpl.MyBatisIntentionDAO;
import edu.eci.pdsw.persistence.mybatisimpl.MyBatisUserDAO;
import edu.eci.pdsw.services.InitiativeBankServices;
import edu.eci.pdsw.services.impl.InitiativeBankServicesImpl;




public class GuiceContextListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		ServletContext servletContext = servletContextEvent.getServletContext();
		servletContext.removeAttribute(Injector.class.getName());
	}

	public void contextInitialized(ServletContextEvent servletContextEvent) {
            Injector injector = Guice.createInjector(new XMLMyBatisModule() {
                @Override
                protected void initialize() {
                    install(JdbcHelper.PostgreSQL);
                    setEnvironmentId("development");
                    setClassPathResource("mybatis-config.xml");
                    // User
                    bind(InitiativeBankServices.class).to(InitiativeBankServicesImpl.class);
                    bind(UserDAO.class).to(MyBatisUserDAO.class);
                    bind(IntentionDAO.class).to(MyBatisIntentionDAO.class);
                }
            });

            ServletContext servletContext = servletContextEvent.getServletContext();
            servletContext.setAttribute(Injector.class.getName(), injector);
	}

}