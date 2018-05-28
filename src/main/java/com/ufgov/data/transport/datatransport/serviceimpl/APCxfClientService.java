package com.ufgov.data.transport.datatransport.serviceimpl;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

public class APCxfClientService {

    public static void main(String[] args) {

        // 创建动态客户端
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        QName serviceName = new QName("FmBankWsServiceImplService");
//        Uri
        Client client = null;
        try {
//            QName service = new QName("getDataBySql");
            QName port = new QName("BankWs");//{http://ws.fm.ufgov.com/}FmBankWsServiceImplPort
            client = dcf.createClient(new URL("http://localhost:7341/sbjc/FM_WS/service/BankWs?wsdl"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
//        Client client = dcf.createClient("http://localhost:7341/sbjc/FM_WS/service/BankWs?wsdl",qName);
//        Client client = dcf.createClient("http://localhost:7341/sbjc/FM_WS/service/BankWs?wsdl");

        // 需要密码的情况需要加上用户名和密码
        // client.getOutInterceptors().add(new ClientLoginInterceptor(USER_NAME,
        // PASS_WORD));
        Object[] objects = new Object[0];
        try {
            // invoke("方法名",参数1,参数2,参数3....);
            objects = client.invoke("getDataBySql", "select 1 from dual");
            System.out.println("返回数据:" + objects[0]);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }



    }
}
