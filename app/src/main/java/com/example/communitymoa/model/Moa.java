package com.example.communitymoa.model;


import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Moa {
    @SerializedName("title")
    private String title;
    @SerializedName("url_parameter")
    private String url_parameter;
    @SerializedName("url_pc")
    private String url_pc;
    @SerializedName("url_mobile")
    private String url_mobile;
    @SerializedName("source")
    private String source;
    @SerializedName("source_name")
    private String source_name;
    @SerializedName("description")
    private String description;
    @SerializedName("reg_date")
    private String reg_date;
    @SerializedName("img")
    private String img;
    @SerializedName("view_cnt")
    private int view_cnt;
    @SerializedName("reply_cnt")
    private int reply_cnt;
    @SerializedName("click_cnt")
    private int click_cnt;
    @SerializedName("totalCount")
    private int totalCount;
    @SerializedName("pagesize")
    private int pagesize;
    @SerializedName("pageno")
    private int pageno;
    @SerializedName("pageCount")
    private int pageCount;
    @SerializedName("rowPerPage")
    private int rowPerPage;
    @SerializedName("excludeRowCount")
    private int excludeRowCount;
    @SerializedName("seq_num")
    private int seq_num;



}
