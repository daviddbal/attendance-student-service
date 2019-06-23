package net.balsoftware.attendance.student;

import com.google.inject.AbstractModule;
import net.balsoftware.attendance.connection.ConnectionFactory;
import net.balsoftware.attendance.connection.PostgresConnectionFactory;

public class JerseyDevelopmentModule extends AbstractModule {
    @Override
    protected void configure() {
       bind(ConnectionFactory.class).to(PostgresConnectionFactory.class);
    }
}
