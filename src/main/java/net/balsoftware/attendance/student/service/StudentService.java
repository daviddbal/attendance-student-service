package net.balsoftware.attendance.student.service;

import net.balsoftware.attendance.dao.DAOManager;

public class StudentService {

    // TODO - MAKE DAO LIBRARY PROJECT
    private final DAOManager daoManager;

    public StudentService(DAOManager daoManager) {
        this.daoManager = daoManager;
    }

    public String getStudentById(int id) {
        return daoManager.getStudentDAO().getStudentById(id);
    }
}
