package com.vnc.smarthomestay.service;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public interface ShowRoom {
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    int getRoomnumber();
    String getRoomname();
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    BigDecimal getPrice();
    String getStatus();
    String getAdditionalname();
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    BigDecimal getAdditionalprice();
}

