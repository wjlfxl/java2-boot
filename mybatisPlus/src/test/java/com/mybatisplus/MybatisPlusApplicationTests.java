package com.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mybatisplus.mapper.UserMapper;
import com.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {

    @Autowired
    private UserMapper userMapper;

    //继承了BaseMapper，所有的方法都来自己父类
    //我们也可以编写自己的扩展方法!
    @Test
    void contextLoads() {
        User user =userMapper.selectById(3);
        System.out.println(user);

//        参数是一个wrapper ，条件构造器，这里我们先不用nuLL，查询全部用户
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    //add
    @Test
    public void TestAdd(){
        User user=new User();
        user.setId(7);
        user.setName("rtul");
        user.setPassword(123125);

        int insert=userMapper.insert(user);
        System.out.println(insert);
        System.out.println(user);
    }

    //update
    @Test
    public void TestUpdate(){
//        User user=new User();
//        user.setId(5);
//        user.setName("小乔乔");
//        user.setPassword(12121);
//        int user1=userMapper.updateById(user);
//        System.out.println(userMapper.selectById(5));
    }

    //测试乐观锁成功
    @Test
    public void TestOptimisticLocker(){
        //1.查询用户信息
        User user=userMapper.selectById(4);
        //2.插入用户信息
        user.setName("白起1");
        user.setPassword(22322);
        //3.执行更新操作
        userMapper.updateById(user);
    }

    //测试乐观锁失败
    @Test
    public void TestOptimisticLocker2(){
        User user=userMapper.selectById(1);
        user.setName("白起1");
        user.setPassword(22322);

        //模拟插队
        User user2=userMapper.selectById(1);
        user.setName("白起2");
        user.setPassword(22322);
        userMapper.updateById(user2);

        //可以自旋锁来多次尝试提交!
        userMapper.updateById(user);//如果没有乐观锁就会覆盖插队线程的值!
    }


    //测试查询
    @Test
    public void TestQuery() {
        User user = userMapper.selectById(3);
        System.out.println(user);
    }

    //查询多个id
    @Test
    public void TestQuery2(){
        //类型是Collection --所以用集合Arrays.asList
        List<User> users = userMapper.selectBatchIds(Arrays.asList(1, 2, 3));
        System.out.println(users);
    }

    //条件查询之一通过map
    @Test
    public void TestQuery3(){
        HashMap<String,Object> map = new HashMap<>();
//        map.put("name","www");
        map.put("password","12121");

        userMapper.selectByMap(map);
        System.out.println();
    }

    //分页查询三种方式-1、使用limit。2、第三方插件。3、MyBatisPlus内置分页
    //分页查新。需要配置拦截组件
    //MybatisPlus3.5的在Mybatis方法里面直接加 interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL))
    @Test
    public void TestPageQuery(){
        //参数一是页码，二是数量
        Page<User> Page = new Page<>(1,3);
        //wrapper暂时不用
        userMapper.selectPage(Page,null);
        //getRecords获得记录
        Page.getRecords().forEach(System.out::println);
        Page.getPages(); //一共多少页
        Page.getTotal();//一共多少条数据
        Page.getCurrent(); //当前第几页
        Page.getRecords();//获取分页后的数据
    }

    //按id删除
    @Test
    public void TestDelete(){
        userMapper.deleteById(1);

        //查询多个id
        //类型是Collection --所以用集合Arrays.asList
        userMapper.deleteBatchIds(Arrays.asList(1,2,3));

        //条件查询之一通过map
        HashMap<String,Object> map = new HashMap<>();
//        map.put("name","www");
        map.put("password","12121");

        userMapper.deleteByMap(map);
    }


    //逻辑删除。物理删除是直接从数据库中删除。逻辑删除是在数据库中没有删除，而是通过变量来使他失效
    //管理员可以查看删除记录，以防数据丢失，类似于回收站
    //在配置文件中配置了之后删除不会删除数据库中的数据
//    UPDATE user SET deleted=1 WHERE id=? AND deleted=0实际执行的是update
    @Test
    public void TestLogicDelete() {
        //按id删除
        userMapper.deleteById(1);
    }


    //防止全表更新删除
    @Test
    public void testDeleteUpdate() {
        LambdaUpdateWrapper<User> wrapper = new LambdaUpdateWrapper<>();
        wrapper.eq(User::getId, 1);
        User user = new User();
        user.setId(5);
        user.setName("custom_name");

        //我没写这个方法，不知道wrapper是什么
//        userMapper.saveOrUpdate(user, wrapper);
    }


}
