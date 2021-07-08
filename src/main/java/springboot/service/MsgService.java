package springboot.service;

import springboot.domain.Msg;

import java.util.List;


public interface MsgService {


    List<Msg> msg_all();


    int deleteByPrimaryKey(Integer hq);

    int insert(Msg record);

    int insertSelective(Msg record);

    Msg selectByPrimaryKey(Integer hq);

    int updateByPrimaryKeySelective(Msg record);

    int updateByPrimaryKey(Msg record);
}
