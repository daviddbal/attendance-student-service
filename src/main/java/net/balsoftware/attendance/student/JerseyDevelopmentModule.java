package net.balsoftware.attendance.student;

import com.google.inject.AbstractModule;
import net.balsoftware.attendance.connection.ConnectionFactory;
import net.balsoftware.attendance.connection.PostgresConnectionFactory;
import net.balsoftware.attendance.connection.PostgresTestConnectionFactory;

public class JerseyDevelopmentModule extends AbstractModule {
    @Override
    protected void configure() {
       bind(ConnectionFactory.class).to(PostgresTestConnectionFactory.class);
    }
}
