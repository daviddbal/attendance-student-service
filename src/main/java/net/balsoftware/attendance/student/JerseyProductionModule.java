package net.balsoftware.attendance.student;

import com.google.inject.AbstractModule;
import net.balsoftware.attendance.connection.ConnectionFactory;
import net.balsoftware.attendance.connection.ConnectionHelperC3PO;

public class JerseyProductionModule  extends AbstractModule {
    @Override
    protected void configure() {
        bind(ConnectionFactory.class).to(ConnectionHelperC3PO.class);
    }
}
