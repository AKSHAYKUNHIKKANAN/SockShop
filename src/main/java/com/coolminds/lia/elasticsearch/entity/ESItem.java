package com.coolminds.lia.elasticsearch.entity;


import java.util.Date;
import java.util.List;

// import com.coolminds.lia.commons.dto.ItemAttributeDto;
// import com.coolminds.lia.commons.dto.ItemAvailabilityDto;
// import com.coolminds.lia.commons.dto.ItemCategoryDto;
// import com.coolminds.lia.commons.dto.ItemImagesDto;
// import com.coolminds.lia.commons.dto.ItemPriceDto;
// import com.coolminds.lia.commons.dto.ItemRuleDto;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "lia")
public class ESItem {

    private String id;

    @Field(type = FieldType.Text, name = "name")
    private String name;

    @Field(type = FieldType.Text, name = "description")
    private String description;

    private Boolean isRentable;

    private Boolean isSelleble;

    private int addressId;

    private int itemStatusId;

    private int userId;

    private Date createdOn;

    @Field(type = FieldType.Text, name = "createdBy")
    private String createdBy;

    private Date modifiedOn;

    @Field(type = FieldType.Text, name = "modifiedBy")
    private String modifiedBy;

    private int itemDraftId;

    // private List<ItemImagesDto> itemImages;

    // private List<ItemAttributeDto> itemAttributes;

    // private List<ItemAvailabilityDto> itemAvailabilities;

    // private List<ItemCategoryDto> itemCategories;

    // private List<ItemPriceDto> itemPrices;

    // private List<ItemRuleDto> itemRules;
    
}