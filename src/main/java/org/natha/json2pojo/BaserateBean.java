package org.natha.json2pojo;

import com.github.adminfaces.starter.infra.model.Filter;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ManagedBean
@SessionScoped
public class BaserateBean implements Serializable {
    //Field variable
    private String base;
    private Rates rates;
    private String date;

    //bean id
    Integer id;

    Filter<Baserate> filter = new Filter<>(new Baserate());

    public String SERVICE_BASE_URI;
    FacesContext fc = FacesContext.getCurrentInstance();    //coba pasang disini.

    public List<Baserate> baserateList = new ArrayList<>();

    public List<Baserate> selectedBaserates = new ArrayList<>();

    public BaserateBean() {
    }

    @PostConstruct
    public void initDataModel() {

//        this.setListP(getPenyelenggaraBerlangsung());    //hang
//        getPenyelenggaraBerlangsung();
        getLatestBaserate();
    }

    private HttpHeaders getHeaders() {
        String credential="mukesh:m123";
        //String credential="tarun:t123";
        String encodedCredential = new String(Base64.encodeBase64(credential.getBytes()));
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", "Basic " + encodedCredential);
        return headers;
    }

    public List<Baserate> getLatestBaserate(){
        HttpHeaders headers = getHeaders();
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.exchangeratesapi.io/latest"; //pake dulu ini!
//        String url = SERVICE_BASE_URI+"user/penyelenggaras";
//        String url = SERVICE_BASE_URI+"user/penyelenggaras";  //remark
        HttpEntity<String> requestEntity = new HttpEntity<String>(headers);

        //instantiate Java Class

        //ResponseEntity<Baserate[]> responseEntity =
        ResponseEntity<Baserate> responseEntity =
                restTemplate.exchange(url,
//                        HttpMethod.GET, requestEntity, Baserate[].class);
                        HttpMethod.GET, requestEntity, Baserate.class);
//        DaftarHunianAsrama[] hdrList = responseEntity.getBody();
        //ia sudah menjasi single class

//        Baserate[] tmpBaserateList = responseEntity.getBody();
        Baserate tmpBaserateList = responseEntity.getBody();

//	return hdrs;
        List<Baserate> list = Arrays.asList(tmpBaserateList);

        int x = list.size();

        System.out.println("int x :"+x);

        //reset
        baserateList.clear();
        baserateList.addAll(list);
        return baserateList;
    }

    public List<String> completeModel(String query) {
//        List<String> result = carService.getModels(query);
        List<String> result = null;
        return result;
    }

//    public void test(){
//        String jsonStr = response.readEntity(String.class);
//        ObjectMapper mapper = new ObjectMapper();
//        JsonNode rootNode = mapper.readTree(jsonStr);
//
//// Start by checking if this is a list -> the order is important here:
//        if (rootNode instanceof ArrayNode) {
//            // Read the json as a list:
//            myObjClass[] objects = mapper.readValue(rootNode.toString(), myObjClass[].class);
//    }

    //Getter and Setter
    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Rates getRates() {
        return rates;
    }

    public void setRates(Rates rates) {
        this.rates = rates;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSERVICE_BASE_URI() {
        return SERVICE_BASE_URI;
    }

    public void setSERVICE_BASE_URI(String SERVICE_BASE_URI) {
        this.SERVICE_BASE_URI = SERVICE_BASE_URI;
    }

    public FacesContext getFc() {
        return fc;
    }

    public void setFc(FacesContext fc) {
        this.fc = fc;
    }

    public List<Baserate> getBaserateList() {
        return baserateList;
    }

    public void setBaserateList(List<Baserate> baserateList) {
        this.baserateList = baserateList;
    }

    public List<Baserate> getSelectedBaserates() {
        return selectedBaserates;
    }

    public void setSelectedBaserates(List<Baserate> selectedBaserates) {
        this.selectedBaserates = selectedBaserates;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Filter<Baserate> getFilter() {
        return filter;
    }

    public void setFilter(Filter<Baserate> filter) {
        this.filter = filter;
    }

    //End Getter and Setter
}
