package springboot.service.impl;

import springboot.dao.MsgDao;
import springboot.domain.Msg;
import springboot.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MsgServiceImpl implements MsgService {

    @Autowired
    private MsgDao msgDao;


    @Override
    public List<Msg> msg_all() {
        try {
           return msgDao.msg_all();
        }catch (Exception exception){

            return null;
        }

    }

    @Override
    public int deleteByPrimaryKey(Integer hq) {
        return 0;
    }

    @Override
    public int insert(Msg record) {
        return 0;
    }

    @Override
    public int insertSelective(Msg record) {
        return 0;
    }

    @Override
    public Msg selectByPrimaryKey(Integer hq) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Msg record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Msg record) {
        return 0;
    }
}
