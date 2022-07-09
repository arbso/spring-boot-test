package com.example.springboottest.config;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration(proxyBeanMethods = true)
public class JPAConfig {

    private static final String[] ENTITYMANAGER_PACKAGES_TO_SCAN = "com.example.springboottest.model.User,com.example.springboottest.model.Booking,com.example.springboottest.model.Flight,com.example.springboottest.model.UserDetails".split(",");
//    @Bean
//    @ConfigurationProperties("application.properties")
//    public DataSource dataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean
//    public DataSource dataSourceT() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setUsername("root");
//        dataSource.setPassword("arbersotiri1");
//        dataSource.setUrl(
//                "jdbc:mysql://localhost:3306/myDBTest?createDatabaseIfNotExist=true");
//
//        return dataSource;
//    }
//
//    @Bean(name="entityManagerFactory")
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//
//        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
//        entityManagerFactoryBean.setJpaVendorAdapter(vendorAdaptor());
//        entityManagerFactoryBean.setJpaProperties(additionalProperties());
////        entityManagerFactoryBean.setDataSource(dataSourceT());
////        entityManagerFactoryBean.setPersistenceProviderClass(PersistenceProvider.class);
//        entityManagerFactoryBean.setPackagesToScan(new String[] {"com.example.springboottest.model"});
//
//        return entityManagerFactoryBean;
//    }
//
//    private HibernateJpaVendorAdapter vendorAdaptor() {
//        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//        return vendorAdapter;
//    }
//
//    @Bean
//    public JpaTransactionManager jpaTransactionManager() {
//        JpaTransactionManager transactionManager = new JpaTransactionManager();
//        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
//        return transactionManager;
//    }
//
//    @Bean
//    public PlatformTransactionManager transactionManager() {
//        JpaTransactionManager transactionManager = new JpaTransactionManager();
//        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
//
//        return transactionManager;
//    }
//
//    @Bean
//    public PersistenceExceptionTranslationPostProcessor exceptionTranslation(){
//        return new PersistenceExceptionTranslationPostProcessor();
//    }
//
//    Properties additionalProperties() {
//        Properties properties = new Properties();
//        properties.setProperty("hibernate.hbm2ddl.auto", "update");
//        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
//        properties.setProperty("show_sql", "true");
//        properties.setProperty("hibernate.temp.use_jdbc_metadata_defaults", "false");
//        properties.setProperty("hibernate.format_sql", "true");
//        properties.setProperty("hibernate.use_sql_comments", "true");
//
//        return properties;
//    }

//    @Bean
//    public LocalEntityManagerFactoryBean entityManagerFactory(){
//        LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
//        factoryBean.setPersistenceUnitName("myDB");
//        return factoryBean;
//    }

}