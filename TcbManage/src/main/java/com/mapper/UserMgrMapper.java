package com.mapper;

import com.bean.DTO.InnerUserDTO;
import org.apache.ibatis.annotations.Mapper;

/**
 *  车辆查询 Mapper
 */
@Mapper
public interface UserMgrMapper {

    /**
     *
     * @return
     */
    int insertNewCarType ();

    InnerUserDTO getById(String innerUserId);

}