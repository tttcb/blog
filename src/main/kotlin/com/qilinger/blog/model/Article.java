package com.qilinger.blog.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author astupidcoder
 * @since 2021-07-06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("Article")
public class Article extends Model {

    private static final long serialVersionUID = 1L;

    @TableId("ArticleID")
    private String ArticleID;

    @TableField("Summary")
    private String Summary;

    @TableField("ArticleCategory")
    private String ArticleCategory;

    @TableField("ArticleAuthor")
    private String ArticleAuthor;

    @TableField("CreateTime")
    private LocalDateTime CreateTime;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("DeleteTime")
    private LocalDateTime DeleteTime;

    @TableField("Spare1")
    private String Spare1;

    @TableField("Spare2")
    private String Spare2;

    @TableField("Spare3")
    private String Spare3;

    @TableField("Spare4")
    private String Spare4;

    @TableField("Spare5")
    private String Spare5;

    @TableField("Spare6")
    private String Spare6;

    @TableField("Spare7")
    private String Spare7;

    @TableField("Spare8")
    private String Spare8;

    @TableField("SPare9")
    private String SPare9;

    @TableField("Spare10")
    private String Spare10;


}
