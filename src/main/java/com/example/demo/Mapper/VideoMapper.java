package com.example.demo.Mapper;

import com.example.demo.Model.Video;
import com.example.demo.Model.VideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface VideoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video
     *
     * @mbg.generated Tue Sep 21 11:59:17 CST 2021
     */
    long countByExample(VideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video
     *
     * @mbg.generated Tue Sep 21 11:59:17 CST 2021
     */
    int deleteByExample(VideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video
     *
     * @mbg.generated Tue Sep 21 11:59:17 CST 2021
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video
     *
     * @mbg.generated Tue Sep 21 11:59:17 CST 2021
     */
    int insert(Video record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video
     *
     * @mbg.generated Tue Sep 21 11:59:17 CST 2021
     */
    int insertSelective(Video record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video
     *
     * @mbg.generated Tue Sep 21 11:59:17 CST 2021
     */
    List<Video> selectByExampleWithRowbounds(VideoExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video
     *
     * @mbg.generated Tue Sep 21 11:59:17 CST 2021
     */
    List<Video> selectByExample(VideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video
     *
     * @mbg.generated Tue Sep 21 11:59:17 CST 2021
     */
    Video selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video
     *
     * @mbg.generated Tue Sep 21 11:59:17 CST 2021
     */
    int updateByExampleSelective(@Param("record") Video record, @Param("example") VideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video
     *
     * @mbg.generated Tue Sep 21 11:59:17 CST 2021
     */
    int updateByExample(@Param("record") Video record, @Param("example") VideoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video
     *
     * @mbg.generated Tue Sep 21 11:59:17 CST 2021
     */
    int updateByPrimaryKeySelective(Video record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video
     *
     * @mbg.generated Tue Sep 21 11:59:17 CST 2021
     */
    int updateByPrimaryKey(Video record);
}