/*
 * Copyright 2021 Shulie Technology, Co.Ltd
 * Email: shulie@shulie.io
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pamirs.tro.entity.dao.confcenter;

import java.util.List;
import java.util.Map;

import com.pamirs.tro.entity.domain.entity.TShadowTableConfig;
import com.pamirs.tro.entity.domain.vo.TShadowTableConfigVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 影子表配置mapper
 *
 * @author 298403
 * @version v1.0
 * @date 2019年2月25日
 */
@Mapper
public interface TShadowTableConfigDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_shadow_table_config
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_shadow_table_config
     *
     * @mbggenerated
     */
    int insert(TShadowTableConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_shadow_table_config
     *
     * @mbggenerated
     */
    int insertSelective(TShadowTableConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_shadow_table_config
     *
     * @mbggenerated
     */
    TShadowTableConfig selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_shadow_table_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TShadowTableConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_shadow_table_config
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TShadowTableConfig record);

    /**
     * 通过 数据源 查询所有 影子表配置
     *
     * @param shadowDataSourceIdList
     * @return
     */
    List<TShadowTableConfig> queryShawdowTableConfigByShadowDatasourceIdList(
        @Param("shadowDataSourceIdList") List<Long> shadowDataSourceIdList);

    /**
     * 删除 应用时 删除影子表
     *
     * @param applicationIdList
     * @return
     */
    int deleteByApplicationIdList(@Param("applicationIdList") List<String> applicationIdList);

    /**
     * 批量删除影子表
     *
     * @param idList
     * @return
     */
    int deleteByIdList(@Param("idList") List<String> idList);

    /**
     * 通过影子库数据源id 与影子表名 获取影子表配置
     *
     * @param shadowDatasourceId
     * @param tableNameList
     * @return
     */
    List<TShadowTableConfig> queryShadowTableByDatasourceId(@Param("shadowDatasourceId") Long shadowDatasourceId,
        @Param("shadowTableNameList") List<String> tableNameList);

    /**
     * 批量插入
     *
     * @param recordList
     * @return
     */
    int insertList(@Param("list") List<TShadowTableConfig> recordList);

    /**
     * 根据条件分页查询 展示 影子表列表
     *
     * @param paramMap
     * @return
     */
    List<TShadowTableConfigVo> queryShadowTableConfigPage(Map<String, Object> paramMap);

}
