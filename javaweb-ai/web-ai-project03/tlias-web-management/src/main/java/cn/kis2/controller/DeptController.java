package cn.kis2.controller;

import cn.kis2.anno.Log;
import cn.kis2.pojo.Dept;
import cn.kis2.pojo.Result;
import cn.kis2.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RequestMapping("/depts")
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;


    // @RequestMapping(value = "/depts",method = RequestMethod.GET)  // method 指定请求方式
    @GetMapping
    public Result List() {
        List<Dept> deptList = deptService.findAll();
        System.out.println(deptList);
        return Result.success(deptList);
    }

    /*
    删除部门  方式一 HttpServletRequest
     */
    // @DeleteMapping("/depts")
    // public Result delete(HttpServletRequest request){
    //     String idStr = request.getParameter("id");
    //     int id = Integer.parseInt(idStr);
    //     System.out.println(id);
    //     // deptService.delete(id);
    //     return Result.success();
    // }

    // /*
    //     方式二  删除部门 @RequestParam
    //     注意事项 一旦声明了 @RequestParam 必须传递id
    //  */
    // @DeleteMapping("/depts")
    // public Result delete( @RequestParam(value = "id",required=false) Integer deptId ){
    //     System.out.println("删除"+deptId);
    //     return Result.success();
    // }

    /*
    方式三  删除部门 @RequestParam
    省略注解  请求参数和形参一致
 */
    @Log
    @DeleteMapping
    public Result delete(  Integer id ){
        log.info("根据id删除部门:{}",id);
        System.out.println("删除"+id);
        deptService.delete(id);
        return Result.success();
    }

    /*
    新增部门
     */
    @Log
    @PostMapping
    public Result add (@RequestBody Dept dept){

        log.info("新增部门:{}",dept);

        deptService.add(dept);
        return Result.success();
    }

//     /*
// 根据id查询部门数据
//  */
//     @GetMapping("/depts/{id}")
//     public Result findById(@PathVariable("id") Integer deptId){
//         Dept dept = deptService.findById(deptId);
//         return Result.success(dept);
//     }


    /*
    根据id查询部门数据
     */
    @GetMapping("/{id}")
    public Result findById(@PathVariable Integer id){
        log.info("根据{}查询部门数据",id);
        Dept dept = deptService.findById(id);
        return Result.success(dept);
    }

    /*
    根据id修改部门数据
     */
    @Log
    @PutMapping
    public Result update(@RequestBody Dept dept){
        deptService.update(dept);
        return Result.success();
    }

}
