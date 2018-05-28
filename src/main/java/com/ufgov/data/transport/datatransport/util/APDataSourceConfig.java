package com.ufgov.data.transport.datatransport.util;


//@Configuration
//@MapperScan(basePackages = "com.ufgov.data.transport.datatransport.Mapper",sqlSessionFactoryRef = "DBDataSqlSessionFactory")
public class APDataSourceConfig {

//    @Bean(name = "DBDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource")
//    public DataSource getDataSource(){
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean(name = "DBDataSqlSessionFactory")
//    public SqlSessionFactory getSqlSessionFactory(@Qualifier("DBDataSource") DataSource dataSource) throws Exception{
//        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//        bean.setDataSource(dataSource);
//        bean.setMapperLocations( new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*/*Mapper.xml"));
//        return bean.getObject();
//    }
//
//    @Bean(name = "DBDataTransactionManager")
//    public DataSourceTransactionManager transactionManager(@Qualifier("DBDataSource") DataSource dataSource) {
//        return new DataSourceTransactionManager(dataSource);
//    }
//
//    @Bean(name = "DBDataSqlSessionTemplate")
//    public SqlSessionTemplate sqlSessionTemplate(
//            @Qualifier("DBDataSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
//        return new SqlSessionTemplate(sqlSessionFactory);
//    }


}
