package com.iflytek.aiuidemosample.db;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.iflytek.aiuidemosample.model.Message;

import java.util.List;

import io.reactivex.Flowable;

/**
 * Created by PR on 2017/8/3.
 */
@Dao
public interface MessageDao {
    @Insert
    public void addMessage(Message msg);

    @Update
    public void updateMessage(Message msg);

    @Query("select * from message")
    public Flowable<List<Message>> getAllMessage();


}
