package org.natha.json2pojo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "BGN",
        "NZD",
        "ILS",
        "RUB",
        "CAD",
        "USD",
        "PHP",
        "CHF",
        "AUD",
        "JPY",
        "TRY",
        "HKD",
        "MYR",
        "HRK",
        "CZK",
        "IDR",
        "DKK",
        "NOK",
        "HUF",
        "GBP",
        "MXN",
        "THB",
        "ISK",
        "ZAR",
        "BRL",
        "SGD",
        "PLN",
        "INR",
        "KRW",
        "RON",
        "CNY",
        "SEK",
        "EUR"
})
public class Rates {
    @JsonProperty("BGN")
    private Double bGN;
    @JsonProperty("NZD")
    private Double nZD;
    @JsonProperty("ILS")
    private Double iLS;
    @JsonProperty("RUB")
    private Double rUB;
    @JsonProperty("CAD")
    private Double cAD;
    @JsonProperty("USD")
    private Double uSD;
    @JsonProperty("PHP")
    private Double pHP;
    @JsonProperty("CHF")
    private Double cHF;
    @JsonProperty("AUD")
    private Double aUD;
    @JsonProperty("JPY")
    private Double jPY;
    @JsonProperty("TRY")
    private Double tRY;
    @JsonProperty("HKD")
    private Double hKD;
    @JsonProperty("MYR")
    private Double mYR;
    @JsonProperty("HRK")
    private Double hRK;
    @JsonProperty("CZK")
    private Double cZK;
    @JsonProperty("IDR")
    private Double iDR;
    @JsonProperty("DKK")
    private Double dKK;
    @JsonProperty("NOK")
    private Double nOK;
    @JsonProperty("HUF")
    private Double hUF;
    @JsonProperty("GBP")
    private Double gBP;
    @JsonProperty("MXN")
    private Double mXN;
    @JsonProperty("THB")
    private Double tHB;
    @JsonProperty("ISK")
    private Double iSK;
    @JsonProperty("ZAR")
    private Double zAR;
    @JsonProperty("BRL")
    private Double bRL;
    @JsonProperty("SGD")
    private Double sGD;
    @JsonProperty("PLN")
    private Double pLN;
    @JsonProperty("INR")
    private Double iNR;
    @JsonProperty("KRW")
    private Double kRW;
    @JsonProperty("RON")
    private Double rON;
    @JsonProperty("CNY")
    private Double cNY;
    @JsonProperty("SEK")
    private Double sEK;
    @JsonProperty("EUR")
    private Double eUR;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("BGN")
    public Double getBGN() {
        return bGN;
    }

    @JsonProperty("BGN")
    public void setBGN(Double bGN) {
        this.bGN = bGN;
    }

    @JsonProperty("NZD")
    public Double getNZD() {
        return nZD;
    }

    @JsonProperty("NZD")
    public void setNZD(Double nZD) {
        this.nZD = nZD;
    }

    @JsonProperty("ILS")
    public Double getILS() {
        return iLS;
    }

    @JsonProperty("ILS")
    public void setILS(Double iLS) {
        this.iLS = iLS;
    }

    @JsonProperty("RUB")
    public Double getRUB() {
        return rUB;
    }

    @JsonProperty("RUB")
    public void setRUB(Double rUB) {
        this.rUB = rUB;
    }

    @JsonProperty("CAD")
    public Double getCAD() {
        return cAD;
    }

    @JsonProperty("CAD")
    public void setCAD(Double cAD) {
        this.cAD = cAD;
    }

    @JsonProperty("USD")
    public Double getUSD() {
        return uSD;
    }

    @JsonProperty("USD")
    public void setUSD(Double uSD) {
        this.uSD = uSD;
    }

    @JsonProperty("PHP")
    public Double getPHP() {
        return pHP;
    }

    @JsonProperty("PHP")
    public void setPHP(Double pHP) {
        this.pHP = pHP;
    }

    @JsonProperty("CHF")
    public Double getCHF() {
        return cHF;
    }

    @JsonProperty("CHF")
    public void setCHF(Double cHF) {
        this.cHF = cHF;
    }

    @JsonProperty("AUD")
    public Double getAUD() {
        return aUD;
    }

    @JsonProperty("AUD")
    public void setAUD(Double aUD) {
        this.aUD = aUD;
    }

    @JsonProperty("JPY")
    public Double getJPY() {
        return jPY;
    }

    @JsonProperty("JPY")
    public void setJPY(Double jPY) {
        this.jPY = jPY;
    }

    @JsonProperty("TRY")
    public Double getTRY() {
        return tRY;
    }

    @JsonProperty("TRY")
    public void setTRY(Double tRY) {
        this.tRY = tRY;
    }

    @JsonProperty("HKD")
    public Double getHKD() {
        return hKD;
    }

    @JsonProperty("HKD")
    public void setHKD(Double hKD) {
        this.hKD = hKD;
    }

    @JsonProperty("MYR")
    public Double getMYR() {
        return mYR;
    }

    @JsonProperty("MYR")
    public void setMYR(Double mYR) {
        this.mYR = mYR;
    }

    @JsonProperty("HRK")
    public Double getHRK() {
        return hRK;
    }

    @JsonProperty("HRK")
    public void setHRK(Double hRK) {
        this.hRK = hRK;
    }

    @JsonProperty("CZK")
    public Double getCZK() {
        return cZK;
    }

    @JsonProperty("CZK")
    public void setCZK(Double cZK) {
        this.cZK = cZK;
    }

    @JsonProperty("IDR")
    public Double getIDR() {
        return iDR;
    }

    @JsonProperty("IDR")
    public void setIDR(Double iDR) {
        this.iDR = iDR;
    }

    @JsonProperty("DKK")
    public Double getDKK() {
        return dKK;
    }

    @JsonProperty("DKK")
    public void setDKK(Double dKK) {
        this.dKK = dKK;
    }

    @JsonProperty("NOK")
    public Double getNOK() {
        return nOK;
    }

    @JsonProperty("NOK")
    public void setNOK(Double nOK) {
        this.nOK = nOK;
    }

    @JsonProperty("HUF")
    public Double getHUF() {
        return hUF;
    }

    @JsonProperty("HUF")
    public void setHUF(Double hUF) {
        this.hUF = hUF;
    }

    @JsonProperty("GBP")
    public Double getGBP() {
        return gBP;
    }

    @JsonProperty("GBP")
    public void setGBP(Double gBP) {
        this.gBP = gBP;
    }

    @JsonProperty("MXN")
    public Double getMXN() {
        return mXN;
    }

    @JsonProperty("MXN")
    public void setMXN(Double mXN) {
        this.mXN = mXN;
    }

    @JsonProperty("THB")
    public Double getTHB() {
        return tHB;
    }

    @JsonProperty("THB")
    public void setTHB(Double tHB) {
        this.tHB = tHB;
    }

    @JsonProperty("ISK")
    public Double getISK() {
        return iSK;
    }

    @JsonProperty("ISK")
    public void setISK(Double iSK) {
        this.iSK = iSK;
    }

    @JsonProperty("ZAR")
    public Double getZAR() {
        return zAR;
    }

    @JsonProperty("ZAR")
    public void setZAR(Double zAR) {
        this.zAR = zAR;
    }

    @JsonProperty("BRL")
    public Double getBRL() {
        return bRL;
    }

    @JsonProperty("BRL")
    public void setBRL(Double bRL) {
        this.bRL = bRL;
    }

    @JsonProperty("SGD")
    public Double getSGD() {
        return sGD;
    }

    @JsonProperty("SGD")
    public void setSGD(Double sGD) {
        this.sGD = sGD;
    }

    @JsonProperty("PLN")
    public Double getPLN() {
        return pLN;
    }

    @JsonProperty("PLN")
    public void setPLN(Double pLN) {
        this.pLN = pLN;
    }

    @JsonProperty("INR")
    public Double getINR() {
        return iNR;
    }

    @JsonProperty("INR")
    public void setINR(Double iNR) {
        this.iNR = iNR;
    }

    @JsonProperty("KRW")
    public Double getKRW() {
        return kRW;
    }

    @JsonProperty("KRW")
    public void setKRW(Double kRW) {
        this.kRW = kRW;
    }

    @JsonProperty("RON")
    public Double getRON() {
        return rON;
    }

    @JsonProperty("RON")
    public void setRON(Double rON) {
        this.rON = rON;
    }

    @JsonProperty("CNY")
    public Double getCNY() {
        return cNY;
    }

    @JsonProperty("CNY")
    public void setCNY(Double cNY) {
        this.cNY = cNY;
    }

    @JsonProperty("SEK")
    public Double getSEK() {
        return sEK;
    }

    @JsonProperty("SEK")
    public void setSEK(Double sEK) {
        this.sEK = sEK;
    }

    @JsonProperty("EUR")
    public Double getEUR() {
        return eUR;
    }

    @JsonProperty("EUR")
    public void setEUR(Double eUR) {
        this.eUR = eUR;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
