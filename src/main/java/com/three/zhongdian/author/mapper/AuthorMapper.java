package com.three.zhongdian.author.mapper;

import com.three.zhongdian.author.entity.Author;
import com.three.zhongdian.book.po.Book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by 任梦杭 on 2017/08/11.
 */
@Mapper
@Component
public interface AuthorMapper {
    @Insert("insert into author(authorNname,newPassword,repeatPassword,email,QQ,realName,sex,cardtype,cardId,tel_pre,province,address) values (#{authorNname},#{newPassword},#{repeatPassword},#{email},#{QQ},#{realName},#{sex},#{cardtype},#{cardId},#{tel_pre},#{province},#{address})")
    void addAuthor(Author author);
    @Select("select * from author where authorNname=#{authorNname}")
    List<Author> query(String authorNname);
    /*
        根据作者查询
         */
    Author  findByAuthorName(String authorNname);
    List<Book> selectByAuthorName(String authorNname);




}
