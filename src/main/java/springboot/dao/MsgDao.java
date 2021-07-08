package springboot.dao;

import springboot.domain.Msg;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MsgDao {

    List<Msg> msg_all();

    int deleteByPrimaryKey(Integer hq);

    int insert(Msg record);

    int insertSelective(Msg record);

    Msg selectByPrimaryKey(Integer hq);

    int updateByPrimaryKeySelective(Msg record);

    int updateByPrimaryKey(Msg record);
}