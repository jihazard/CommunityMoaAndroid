package com.example.communitymoa.model;


import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PostData{
    @SerializedName("pageno")
    int pageno;
    @SerializedName("preview")
    String preview;
    @SerializedName("searchPeriod")
    int searchPeriod;
    @SerializedName("seq_num")
    int seq_num;
    @SerializedName("searchOrder")
    String searchOrder;
    @SerializedName("searchType")
    String searchType;
    @SerializedName("searchSource")
    String searchSource;
}
//  map.put("pageno", 1);
//          map.put("preview", "fixed");
//          map.put("searchPeriod", 3);
//          map.put("seq_num", 0);
//          map.put("searchOrder", "popular");
//          map.put("searchType", "y");
//          map.put("searchSource", "todayhumor");