package com.itheima.mapper;

/*员工管理*/

import com.itheima.pojo.Emp;
import org.apache.ibatis.annotations.*;

import java.time.LocalDate;
import java.util.List;


@Mapper
public interface EmpMapper {

    /*查询总记录数*/
//    @Select("select count(*) from emp")
//    public Long count();

    /*查询列表数据*/
//    @Select("select * from emp limit #{start},#{pageSize}")
//    public List<Emp> page(@Param("start") Integer start, @Param("pageSize") Integer pageSize);


    @Insert("insert into emp(username,name,gender,image,job,entrydate,dept_id,create_time,update_time) values (#{username},#{name},#{gender},#{image},#{job},#{entrydate},#{deptId},#{createTime},#{updateTime})")
    public void add(Emp emp);

    @Select("select * from emp where id = #{id}")
    Emp getById(Integer id);

    @Update("update emp set username = #{username},name = #{name},gender = #{gender},image = #{image},job = #{job},entrydate = #{entrydate},dept_id = #{deptId},create_time = #{createTime},update_time = #{updateTime} where id = #{id}")
    void update(Emp emp);

//    @Select("select * from emp")
    public List<Emp> list(@Param("name") String name,@Param("gender") Short gender,@Param("begin") LocalDate begin,@Param("end") LocalDate end);

    void delete(@Param("ids") List<Integer> ids);

    /*@Select("select * from emp")
    public List<Emp> list(String name, Short gender, LocalDate begin, LocalDate end);*/
}
