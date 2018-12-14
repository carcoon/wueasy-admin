/*
 * wueasy - A Java Distributed Rapid Development Platform.
 * Copyright (C) 2017-2019 wueasy.com

 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.

 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.wueasy.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wueasy.admin.entity.SysRole;
import com.wueasy.base.entity.DataMap;

/**
 * 系统角色
 * @author: fallsea
 * @version 1.0
 */
public interface SysRoleMapper {
	
	/**
	 * 删除
	 * @author: fallsea
	 * @param roleId
	 * @return
	 */
    int delete(Long roleId);
    
    int delete(DataMap paramMap);

    /**
     * 新增
     * @author: fallsea
     * @param paramMap
     * @return
     */
    int insert(DataMap paramMap);


    /**
     * 查询单个数据
     * @author: fallsea
     * @param paramMap
     * @return
     */
    SysRole select(DataMap paramMap);
    
    /**
     * 查询单个数据
     * @author: fallsea
     * @param roleId
     * @return
     */
    SysRole select(@Param("roleId")Long roleId);
    
    /**
     * 查询列表
     * @author: fallsea
     * @param paramMap
     * @return
     */
    List<SysRole> query(DataMap paramMap);
    
    /**
     * 修改数据
     * @author: fallsea
     * @param paramMap
     * @return
     */
    int update(DataMap paramMap);
}