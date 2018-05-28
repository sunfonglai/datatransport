package com.ufgov.data.transport.datatransport.serviceimpl;

import com.ufgov.data.transport.datatransport.service.IAPRestClientService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Service
public class APRestClientServiceImpl implements IAPRestClientService {
    @Override
    public boolean sendMessage(String message) {
        RestTemplate restTemplate=new RestTemplate();
        String url="http://localhost:8080/data/getDataBySql";
//        /* 注意：必须 http、https……开头，不然报错，浏览器地址栏不加 http 之类不出错是因为浏览器自动帮你补全了 */
//        HttpHeaders headers = new HttpHeaders();
//        /* 这个对象有add()方法，可往请求头存入信息 */
//        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
//        /* 解决中文乱码的关键 , 还有更深层次的问题 关系到 StringHttpMessageConverter，先占位，以后补全*/
//        HttpEntity<String> entity = new HttpEntity<String>("<i m body>", headers);
//        /* body是Http消息体例如json串 */
//        headers.add("sql",message);
//        restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
///*上面这句返回的是往 url发送 post请求 请求携带信息为entity时返回的结果信息
//String.class 是可以修改的，其实本质上就是在指定反序列化对象类型，这取决于你要怎么解析请求返回的参数*/

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
        map.add("sql", message);

        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);

        ResponseEntity<String> response = restTemplate.postForEntity( url, request , String.class );
        return false;
    }
}
