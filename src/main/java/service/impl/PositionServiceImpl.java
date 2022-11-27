package service.impl;

import dao.abstr.PositionDao;
import model.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PositionServiceImpl extends AbstrServiceImpl<Position, Long> {

    private PositionDao positionDao;

    @Autowired
    public PositionServiceImpl(PositionDao positionDao) {
        super(positionDao);
        this.positionDao = positionDao;
    }
}
