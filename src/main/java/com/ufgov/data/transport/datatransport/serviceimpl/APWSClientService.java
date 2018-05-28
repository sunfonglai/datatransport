package com.ufgov.data.transport.datatransport.serviceimpl;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class APWSClientService {


    public static void main(String[] args) {

    String xmlStr = "<soapenv:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ws=\"http://ws.fm.ufgov.com/\">\n" +
            "   <soapenv:Header/>" +
            "   <soapenv:Body>\n" +
            "      <ws:getDataBySql soapenv:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\">\n" +
            "         <sqlXml xsi:type=\"soapenc:string\" xmlns:soapenc=\"http://schemas.xmlsoap.org/soap/encoding/\">select * from fm_option</sqlXml>\n" +
            "      </ws:getDataBySql>\n" +
            "   </soapenv:Body>\n" +
            "</soapenv:Envelope>";
//        String xmlStr ="<?xml version=\"1.0\" encoding=\"utf-8\"?>" ;

        System.out.println(xmlStr);

//        CloseableHttpClient client = HttpClients.createJAXBContextProxyateDefault();
        HttpClient client = new DefaultHttpClient();
        String url="http://localhost:7341/sbjc/FM_WS/service/BankWs";
        HttpPost post = new HttpPost(url);

        post.setHeader("Accept", "*/*");
        post.setHeader("Cache-Control", "no-cache");
        post.setHeader("SOAPAction", "");
//        post.setHeader("Content-Length", "1000");
        post.setHeader("Content-Type", "charset=UTF-8");
        post.setHeader("Connection", "Keep-Alive");
        post.setHeader("User-Agent", "Apache-HttpClient/4.5.2 (Java/1.8.0_152-release)");
        post.setHeader("Accept-Encoding", "gzip,deflate");
        StringEntity stringEntity = null;
        try {
            stringEntity = new StringEntity(xmlStr);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        post.setEntity(stringEntity);


//        List<BasicNameValuePair> parameters = new ArrayList<>();
//        parameters.add(new BasicNameValuePair("xmlStr", xmlStr));
//        try {
//            post.setEntity(new UrlEncodedFormEntity(parameters,"UTF-8"));
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
        HttpResponse response = null;
        try {
            response = client.execute(post);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(response.toString());
        HttpEntity entity = response.getEntity();
//        String result = EntityUtils.toString(entity, "UTF-8");
    }

}
