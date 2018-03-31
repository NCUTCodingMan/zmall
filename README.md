# zmall
一个简单的SSM项目, 此项目主要用来熟悉如何使用基于Java的配置, 而不是XML来配置项目

在配置的过程中 以下几点不是很熟悉
1. Servlet3.0的新特性, 无需web.xml即可启动项目
  Spring对相关类进行了实现, 并提供了一个抽象类供我们使用, AbstractAnnotationConfigDispatcherServletInitializer
  此类不熟悉, 没有深入理解
  
2. Thymeleaf的配置
  视图解析器 模板引擎以及模型解析器, 三者之间的依赖关系
  
3. 使用REST接口返回POJO 出现Convert异常
  对于jaskson不了解 这个可以瞅瞅

暂未实现的部分
1. 事务未配置
2. Spring MVC静态资源配置
3. Spring MVC拦截器配置
4. 其他暂时未想到

下面对基于Java的配置与基于XMl的配置做一个对比
1. 基于XML的配置的特点
  所有配置信息在一块, 比较容易看, 分析
  各项配置文件分开. 比较容易捋清楚思路
  比较简单, 容易上手
  
  模板化 不利于开发人员维护
  
2. 基于Java的配置
  编程方面可能会有一定的要求
  刚接触, 不能够从容的配置
  有些配置信息直接嵌入到代码中, 不是很友好
  
  方便理解Spring Boot中的一些特性 对学习Spring Boot有一定的好处
