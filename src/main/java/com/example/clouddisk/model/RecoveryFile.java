package com.example.clouddisk.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.*;

/**
 * @author R.Q.
 * brief:删除文件记录表
 */
@Data
@Table(name="recoveryfile")
@Entity
@TableName("recoveryfile")
public class RecoveryFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(type = IdType.AUTO)
    @Column(columnDefinition = "bigint(20)")
    private Long recoveryFileId;

    @Column(columnDefinition = "bigint(20)")
    private Long userFileId;

    @Column(columnDefinition = "varchar(25)")
    private String deleteTime;

    @Column(columnDefinition = "varchar(25)")
    private String deleteBatchNum;
}
