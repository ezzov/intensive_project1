package service.impl;

import dao.abstr.ProjectDao;
import model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl extends AbstrServiceImpl<Project, Long> {

    private ProjectDao projectDao;

    @Autowired
    public ProjectServiceImpl(ProjectDao projectDao) {
        super(projectDao);
        this.projectDao = projectDao;
    }
}
