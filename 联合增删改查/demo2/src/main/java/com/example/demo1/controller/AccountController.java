package com.example.demo1.controller;

import com.example.demo1.Result.Result;
import com.example.demo1.logindemo.dao.AccountMapper;
import com.example.demo1.logindemo.dao.AccountTypeMapper;
import com.example.demo1.logindemo.dao.AccountAndAccountTypeMapper;
import com.example.demo1.logindemo.model.*;
import com.example.demo1.logindemo.service.DemoService;
import com.example.demo1.logindemo.service.imp.DemoServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.util.StringUtils;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RequestMapping("/")
@Controller
public class AccountController {
    private final Logger logger = LoggerFactory.getLogger(AccountController.class);
    @Autowired
    DemoService demoService;

    @Autowired
    AccountMapper accountMapper;

    @Autowired
    AccountTypeMapper accountTypeMapper;

    @Autowired
    AccountAndAccountTypeMapper accountAndAccountTypeMapper;

    @GetMapping(value = "/account/list")
    public String list(@ModelAttribute Account account, @RequestParam(value = "page",defaultValue = "0") Integer page, Model model) {
        //List<AccountAndAccountType> list=accountAndAccountTypeMapper.selectAll();
//        List<AccountType> accountType=accountTypeMapper.selectAll();
//        model.addAttribute("accountType",accountType);
//        model.addAttribute("name",account.getName());
//        model.addAttribute("pwd",account.getPwd());
//        model.addAttribute("accountTypeId",account.getAccountTypeId());
//        //总条数
//        Integer taotalNumber=accountMapper.selectCount(account).getTotalNumber();
//        //每页条数
//        Integer pageSize = 10;
//        //总页数
//        Integer totalPage =  BigDecimal.valueOf(taotalNumber/pageSize,BigDecimal.ROUND_UP).intValue();
//        Integer startIndex = page * pageSize;
//        List<Account> list=accountMapper.selectAll(account,startIndex,pageSize);
//
//        PageModel pageModel =new PageModel<Account>();
//
//        pageModel.setList(list);
//        pageModel.setPageSize(page);
//        pageModel.setTotalNumber(taotalNumber);
//        pageModel.setTotalPage(totalPage);
//
//        model.addAttribute("pageModel",pageModel);

        PageHelper.startPage(1,5);
        List<Account> list=accountMapper.selectList(account);

        List<ArticlesModel>item = new ArrayList<ArticlesModel>();


        for(int i=0; i<list.size(); i++){
            ArticlesModel articlesObj = new ArticlesModel<>();
            articlesObj.setName(list.get(i).getName());
            articlesObj.setPwd(list.get(i).getPwd());
            item.add(articlesObj);  //向列表中添加数据
        }
//        HashMap<String,String> hashMap = new HashMap<String, String>();
//        hashMap.put("name", "1st");
//        hashMap.put("pwd", "2nd");

        PageInfo<Account> pageInfo = new PageInfo<Account>(list);
        model.addAttribute("pageModel",pageInfo);
        return "/account/index.html";
    }
    @GetMapping(value = "/account/add")
    public String add(Integer id,Model model) {
        List<AccountType> list=accountTypeMapper.selectAll();
        model.addAttribute("list",list);
        return "/account/add.html";
    }
    @GetMapping(value = "/account/edit")
    public String edit(int id,Model model) {
        Account info= (Account) demoService.selectById(id);
        model.addAttribute("info",info);
        List<AccountType> list=accountTypeMapper.selectAll();
        model.addAttribute("list",list);
        return "/account/edit.html";
    }

    @PostMapping(value = "/account/save")
    public String save(@ModelAttribute Account account,@RequestParam(value = "picc") MultipartFile pic) {
        try {
            if(StringUtils.isEmpty(account.getName())){
                return "redirect:/account/add";
            }
            //上传图片 start
            String accountPic = uploadFile(pic,System.getProperty("user.dir")+"\\src\\main\\resources\\static\\picture");
            logger.info("pic="+accountPic);
            account.setPic(accountPic);
            //上传图片 end
            logger.info("id="+account.getId());
            if (account.getId() ==0) {
                logger.info("add");
                int a= demoService.add(account);
            } else {
                logger.info("update");
                int b= demoService.updateById(account);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:/account/list";
        }
        return "redirect:/account/list";
    }
    @GetMapping(value = "/account/delete")
    public String delete(Integer id) {
        int result = accountMapper.deleteById(id);
        if (result ==0) {
            logger.info("delete error");
        }
        logger.info("delete success");
        return "redirect:/account/list";
    }


    public static String uploadFile(MultipartFile file,String uploadPath){
        //如果文件是空，返回空
        if (file.isEmpty()) {
            return null;
        }

        //获取这个文件的名字，目的是获取这个文件的后缀名
        String fileName = file.getOriginalFilename();
        //获取后缀名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        //为上传的文件建立一个新名字，避免文件名重复。这里用当前时间戳 加 一个6位随机数 加 文件后缀名
        fileName = System.currentTimeMillis() +""+ ((int)(Math.random()*1000000)) + suffixName;

        //在磁盘创建这个文件目录
        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()) {
            uploadDir.mkdir();
        }

        //创建这个绝对路径的文件对象
        File uploadFile = new File(uploadDir + uploadDir.separator + fileName);

        try {
            //把file转移给uploadFile
            file.transferTo(uploadFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //最后，这里没有直接返回绝对地址，而是返回了以“picture”开头的文件。
        return "/picture/"+fileName;
    }

//    @GetMapping(value = "/api/UserInfo")
//    public String getUserInfo(String id) {
//        //List<Account> list=demoService.selectAll();
//        List<Account> list=accountMapper.selectById(id);
//       // return new Result("200",list,"null");
//    }

////
//    public static void main(String[] args) {
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("t1......");
//            }
//        });
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("t2......");
//            }
//        });
//
//        t1.start();
//        t2.start();
//    }

}
