package com.vic.chat.sbm.dao;

import com.vic.chat.sbm.domain.Message;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface MessageDao {
    @Insert("INSERT INTO t_message(messageFrom,messageTo,messageInfo,messageStatus) VALUES(#{messageFrom},#{messageTo},#{messageInfo},#{messageStatus})")
    public void insertMessage(Message message);

    @Delete("delete from t_message where messageId=#{messageId}")
    public void deleteMessage(Message message);

    @Update("update t_message set messageStatus=#{messageStatus} where messageId=#{messageId}")
    public void updateMessage(Message message);

    @Select("select * from t_message where  messageTo=#{idTo} and messageStatus='S' order by messageTime")
    public List<Message> selectFromAll(Integer idTo);

    @Select("select * from t_message where messageFrom=#{idFrom} and messageTo=#{idTo} and messageStatus='S' order by messageTime")
    public List<Message> selectFrom(Integer idFrom, Integer idTo);
}
