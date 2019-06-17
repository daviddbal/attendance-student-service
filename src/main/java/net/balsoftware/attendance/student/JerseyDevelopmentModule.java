package net.balsoftware.attendance.student;

import com.google.inject.AbstractModule;
import net.balsoftware.attendance.connection.ConnectionHelper;
import net.balsoftware.attendance.connection.ConnectionHelperC3PO;
import net.balsoftware.attendance.connection.PostgresConnectionHelper;

public class JerseyDevelopmentModule extends AbstractModule {
    @Override
    protected void configure() {
       bind(ConnectionHelper.class).to(PostgresConnectionHelper.class);
    }
}
