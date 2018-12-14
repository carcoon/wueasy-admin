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

import com.wueasy.admin.entity.SysLog;
import com.wueasy.base.entity.DataMap;

/**
 * 日志
 * @author: fallsea
 * @version 1.0
 */
public interface SysLogMapper {
	
	/**
	 * 查询
	 * @author: fallsea
	 * @param paramMap
	 * @return
	 */
	List<SysLog> query(DataMap paramMap);
	
	/**
	 * 删除
	 * @author: fallsea
	 * @param paramMap
	 * @return
	 */
    int delete(DataMap paramMap);

    /**
     * 新增
     * @author: fallsea
     * @param sysLog
     * @return
     */
    int insert(SysLog sysLog);

    /**
     * 查询单个记录
     * @author: fallsea
     * @param paramMap
     * @return
     */
    SysLog selectById(DataMap paramMap);
}