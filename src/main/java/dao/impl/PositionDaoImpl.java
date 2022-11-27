package dao.impl;

import dao.abstr.PositionDao;
import model.Customer;
import model.Position;
import org.springframework.stereotype.Repository;

@Repository
public class PositionDaoImpl extends AbstrDaoImpl<Position, Long> implements PositionDao {
}
