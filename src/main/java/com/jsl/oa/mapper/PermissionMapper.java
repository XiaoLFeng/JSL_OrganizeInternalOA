package com.jsl.oa.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PermissionMapper {

    @Insert("insert into organize_oa.oa_role_permissions(rid, pid) VALUE (#{rid},#{pid})")
    void permissionAdd(Long rid, Long pid);

    @Select("select name from organize_oa.oa_permissions where id in(select pid " +
            "from organize_oa.oa_role_permissions where rid=" +
            "(select rid from organize_oa.oa_role_user where uid=#{uid}) )")
    List<String> permissionUser(Long uid);
}
