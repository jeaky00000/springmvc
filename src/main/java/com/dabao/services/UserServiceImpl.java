package com.dabao.services;

import com.dabao.entities.User;
import com.dabao.mappers.UserMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    SqlSessionFactory sqlSessionFactory;

    @Override
    public List<User> findAll() {
        UserMapper mapper = sqlSessionFactory.openSession().getMapper(UserMapper.class);
        return mapper.findAll();
    }
}
