package net.balsoftware.attendance.student;

import com.google.inject.AbstractModule;
import net.balsoftware.attendance.connection.ConnectionHelper;

public class JerseyDevelopmentModule extends AbstractModule {
    @Override
    protected void configure() {
//        bind(ConnectionHelper.class).to(PostgresTestConnectionHelper.class);
    }
}
