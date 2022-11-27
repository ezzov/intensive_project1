package dao.impl;

import dao.abstr.ProjectDao;
import model.Project;
import org.springframework.stereotype.Repository;

@Repository
public class ProjectDaoImpl extends AbstrDaoImpl<Project, Long> implements ProjectDao {
}
