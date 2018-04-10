package com.kim.mapper;

import com.kim.model.CplData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by pan.sun on 2018/4/10.
 */
@Mapper
public interface CplDataMapper {
    @Select("SELECT * FROM cpl_data WHERE uid = #{uid}")
    CplData findByUid(@Param("uid")String uid);
}
