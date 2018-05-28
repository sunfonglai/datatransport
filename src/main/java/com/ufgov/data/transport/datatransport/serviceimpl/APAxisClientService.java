package com.ufgov.data.transport.datatransport.serviceimpl;

public class APAxisClientService {

    public static void main(String[] args) {
//        // 远程调用路径
//        String endpoint = "http://localhost:8080/Hikvision/services/checkService?wsdl";
//        String result = "call failed!";
//        Service service = new Service();
//        Call call;
//
//        try {
//            call = ((Call) service.createCall());
//            call.setTargetEndpointAddress(endpoint);
//            // 设置命名空间调用的方法名
//            /**
//             * 这里的new QName的URL,就是要指向的命名空间的名称了，
//             * 这个URL地址在你的wsdl打开后可以看到的，
//             * 上面有写着<xs:schema xmlns:ax218="http://service.hcj.com/xsd" attributeFormDefault="qualified" elementFormDefault="qualified" targetNamespace="http://action.hcj.com">,
//             * 找到targetNamespace，里面的值就是你的域名空间
//             * <span style="color:#ff0000;">备注：可能你进行搜索的时候，会找到好多个targetNamespace，去查找<xs:element name="queryName">即你所要调用方法上面的那个<xs:schema标签里的targetNamespace</span>
//             */
//            call.setOperationName(new QName("http://action.hcj.com","queryName"));
//
//            // 设置参数名
//            call.addParameter("name",XMLType.XSD_STRING,ParameterMode.IN);
//            // 设置返回值类型
//            call.setReturnType(XMLType.XSD_STRING); // 返回值类型：String
//            String name = "abc2222";
//            result = (String) call.invoke(new Object[] { name });// 远程调用
//        } catch (RemoteException e) {
//            e.printStackTrace();
//        }
    }
}
