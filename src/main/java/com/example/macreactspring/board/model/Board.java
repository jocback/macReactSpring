package com.example.macreactspring.board.model;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="board")
@DynamicInsert
@DynamicUpdate
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer no;

    @Column(name="type")
    private String type;

    @Column(name="title")
    private String title;

    @Column(name="contents")
    private String contents;

    @Column(name="member_no")
    private Integer member_no;

    @Column(name="created_time")
    private Date createdTime;

    @Column(name="updated_time")
    private Date updatedTime;

    @Column(name="likes")
    private Integer likes;

    @Column(name="counts")
    private Integer counts;
}
