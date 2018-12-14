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

import com.wueasy.admin.entity.TemplatePublishPlan;
import com.wueasy.base.entity.DataMap;

public interface TemplatePublishPlanMapper {

    TemplatePublishPlan select(DataMap paramMap);
    
    TemplatePublishPlan select(@Param("id") Long id);
    
    List<TemplatePublishPlan> query(DataMap paramMap);
    
    int delete(DataMap paramMap);
    
    int deleteMultiple(DataMap paramMap);
    
    int insert(DataMap paramMap);
    
    int update(DataMap paramMap);

    
    /**
	 * 查询list列表
	 * @author: fallsea
	 * @return
	 */
    List<TemplatePublishPlan> queryList();
}