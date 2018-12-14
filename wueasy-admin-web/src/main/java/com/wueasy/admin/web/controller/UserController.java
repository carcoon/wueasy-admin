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
package com.wueasy.admin.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wueasy.base.bus.client.Client;
import com.wueasy.base.entity.DataMap;
import com.wueasy.base.entity.Result;
import com.wueasy.base.util.JsonHelper;
import com.wueasy.base.util.SpringHelper;
import com.wueasy.base.web.security.pojo.Session;
import com.wueasy.base.web.security.service.SessionService;
import com.wueasy.base.web.util.SysUtil;

/**
 * 用户
 * @author: fallsea
 * @version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController
{
    /**
     * 修改头像
     * @author: fallsea
     * @param headImage
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/updateHeadImage")
    public String updateHeadImage(@RequestParam String headImage,HttpServletRequest request,HttpServletResponse response)
    {
    	DataMap dataMap = new DataMap();
    	dataMap.set("headImage", headImage);
        Result result = new Client().invoke("S1104", dataMap,SysUtil.getSystemParamMap(request));
        if(result.getErrorNo() == 0){
        	//执行成功后，更新session中的地址
        	SessionService sessionService = SpringHelper.getBean(SessionService.class);
        	Session session = sessionService.getSession(SysUtil.getToken(request));
        	
        	session.getUser().setHeadImage(headImage);
        	
        	sessionService.updateSession(session);
        }
        return JsonHelper.toJSONString(result);
    }
    
    
}
