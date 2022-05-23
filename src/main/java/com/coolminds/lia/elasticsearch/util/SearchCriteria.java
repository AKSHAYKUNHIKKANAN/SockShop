package com.coolminds.lia.elasticsearch.util;

import java.util.List;
import java.util.Map;

public class SearchCriteria {

    String keyword;
    Map<String,String> filter;
    List<String> sortBy;
    int startLImit;
    int endLimit;
    
}