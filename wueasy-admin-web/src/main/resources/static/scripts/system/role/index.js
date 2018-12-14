/*
 * fsLayui - A Front-end Rapid Development Framework.
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
layui.use(['form','layer','jquery','carousel','fsCommon','fsConfig'], function () {
    var form = layui.form,
    	fsCommon = layui.fsCommon,
    	fsConfig = layui.fsConfig,
    	statusName = $.result(fsConfig,"global.result.statusName","errorNo"),
      msgName = $.result(fsConfig,"global.result.msgName","errorInfo"),
      servletUrl = $.result(fsConfig,"global.servletUrl"),
      carousel = layui.carousel;

    
    alert();

});