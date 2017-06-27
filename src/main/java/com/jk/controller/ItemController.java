package com.jk.controller;

import com.jk.util.ReturnJson;
import org.apache.xml.security.utils.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.UUID;

/**
 * Created by Administrator on 2017/6/27.
 */
@Controller
@RequestMapping("item")
public class ItemController {


    /**
     * 上传按钮的页面
     * @return
     */
    @RequestMapping("chooseFile")
    public String chooseFile(){
        return "chooseFile";
    }


    //上传图片
    @RequestMapping("upImg")
    @ResponseBody
    public ReturnJson upImg(HttpServletRequest request, @RequestParam("upfile") MultipartFile file){
        ModelAndView mv=new ModelAndView();
        ReturnJson rj=new ReturnJson();

        //获取上传的文件名称
        String filename = file.getOriginalFilename();

        //获取项目中 uploadImg文件夹的真实路径  --上传图片存放到web服务器tomcat中
        String realPath = request.getServletContext().getRealPath("/uploadImg");
        //判断文件夹是否存在
        File f = new File(realPath);
        if (!f.exists()) {
            f.mkdirs();
        }
        InputStream inputStream  = null;
        BufferedInputStream bis = null;
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        //装饰设计模式
        try {
            //文件输入流
            inputStream = file.getInputStream();
            bis = new BufferedInputStream(inputStream);
            //截取文件后缀
            String suffix =  filename.substring(filename.lastIndexOf("."));
            String name = UUID.randomUUID().toString() + suffix;
            fos = new FileOutputStream(realPath+"/"+ name);
            bos = new BufferedOutputStream(fos);
            byte [] b = new  byte[2048];
            int s = 0;
            while( (s = bis.read(b)) != -1){
                bos.write(b, 0, s);
                bos.flush();
            }
            mv.addObject("msg","上传文件成功");
            mv.setViewName("ok");

            rj.setMsg(name);
        } catch (IOException e) {
            e.printStackTrace();
            mv.addObject("msg","上传文件失败");
            mv.setViewName("error");
            rj.setMsg("上传文件失败");
        }finally{
            try {
                if (bos != null) {
                    bos.flush();
                    bos.close();
                    bos = null;
                }
                if (fos  != null) {
                    fos.flush();
                    fos.close();
                    fos = null;
                }
                if (bis != null) {
                    bis.close();
                    bis = null;
                }
                if (inputStream != null) {
                    inputStream.close();
                    inputStream = null;
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return rj;
    }

}
